package edu.dartmouth.phoneusage.utils;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.controllers.MainActivity;
import edu.dartmouth.phoneusage.voice.FeatureExtractor;
import edu.dartmouth.phoneusage.voice.MicrophoneRecorder;
import edu.dartmouth.phoneusage.voice.MicrophoneRecorder.MicrophoneListener;
import edu.dartmouth.phoneusage.voice.SpeechDetector;

/**
 * 
 * Context_Service: This is a sample class to reads sensor data (accelerometer). Received sensor data
 * filtered, processed to extract features out of it and finally sent to the classification pipeline
 * to detect steps and identify activity.
 * 
 * @author CS390MB
 * 
 */
public class Context_Service extends Service implements MicrophoneListener{

	/**
	 * Notification manager to display notifications
	 */
	private NotificationManager nm;
	
	public static LinkedList<Integer> raw_activity_history = new LinkedList<Integer>();
	public static LinkedList<Integer> raw_voice_history = new LinkedList<Integer>();
	public static LinkedList<Float> accx_history = new LinkedList<Float>();
	public static LinkedList<Float> accy_history = new LinkedList<Float>();
	public static LinkedList<Float> accz_history = new LinkedList<Float>();
	
	public static List<Integer> selected = new ArrayList<Integer>();

	private static final String TAG = "ContextService";


	//List of bound clients/activities to this service
	ArrayList<Messenger> mClients = new ArrayList<Messenger>();

	//Message codes sent and received by the service
	public static final int MSG_REGISTER_CLIENT = 1;
	public static final int MSG_UNREGISTER_CLIENT = 2;
	public static final int MSG_START_MICROPHONE = 3;
	public static final int MSG_STOP_MICROPHONE = 4;
	public static final int MSG_MICROPHONE_STARTED = 5;
	public static final int MSG_MICROPHONE_STOPPED = 6;
	public static final int MSG_SPEECH_STATUS = 7;
	
	static Context_Service sInstance = null;
	private static boolean isRunning = false;
	private static boolean isMicrophoneRunning = false;
	private static final int NOTIFICATION_ID = 777;
	
	/**
	 * Filter class required to filter noise from accelerometer
	 */
	private Filter filter = null;

	private String activity = null;
	
	private FeatureExtractor speechExtractor = null;
	
	//Messenger used by clients
	final Messenger mMessenger = new Messenger(new IncomingHandler());

	public static Object[] getObjectDoubleArray(double[] in,Object[] result){
		for (int i=0;i<in.length;i++){
			result[i] = new Double(in[i]);
		}
		return result;
	}
	/**
	 * Handler to handle incoming messages
	 */
	@SuppressLint("HandlerLeak")
	class IncomingHandler extends Handler { 
		@Override
		public void handleMessage(Message msg) {
			Log.d(TAG, "gotMessage" + msg.what);
			switch (msg.what) {
			case MSG_REGISTER_CLIENT:
				mClients.add(msg.replyTo);
				break;
			case MSG_UNREGISTER_CLIENT:
				mClients.remove(msg.replyTo);
				break;
			case MSG_START_MICROPHONE:
			{
				isMicrophoneRunning = true;
				MicrophoneRecorder.getInstance().registerListener(sInstance);
				MicrophoneRecorder.getInstance().startRecording();
				sendMessageToUI(MSG_MICROPHONE_STARTED);
				break;
			}
			case MSG_STOP_MICROPHONE:
			{
				isMicrophoneRunning = false;
				MicrophoneRecorder.getInstance().unregisterListener(sInstance);
				MicrophoneRecorder.getInstance().stopRecording();
				sendMessageToUI(MSG_MICROPHONE_STOPPED);
				break;
			}

			default:
				super.handleMessage(msg);
			}
		}
	}
	
	
	private Object[] result = new Object[12];
	@Override
	//declared in an interface in MicrophoneRecorder
	public void microphoneBuffer(short[] buffer, int window_size) {
		//number of voiced sample among 200 samples
		int voiced = 0;
		
		//For 200 samples,
		for(int k=0;k<8000;k+=200){
            double[] features = FeatureExtractor.ComputeFeaturesForFrame(buffer,200,k);
            try {
            	result=getObjectDoubleArray(features,result);
            	
            	//TODO: classify the result and get the output of classifier
        		//If output is 0.0d, increment ‘voiced’ variable.
				double output = SpeechDetector.classify(result);

				if (output==0.0d) voiced++;
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
		//TODO: After you find the number of ‘voiced’ sample among 200 samples, 
		//determine whether 200 samples mostly contain human voice by thresholding.
		//If ‘voiced’ variable is greater than a certain threshold, call 
		//sendSpeechStatusToUI() with speech variable=1.
		sendSpeechStatusToUI(voiced > 15 ? 1 : 0);
	}
	
	private void sendMessageToUI(int message) {
		for (int i=mClients.size()-1; i>=0; i--) {
			try {
				Log.d(TAG,"sendingMessage" + message);
				// Send message value
				mClients.get(i).send(Message.obtain(null, message));
			} catch (RemoteException e) {
				// The client is dead. Remove it from the list; we are going through the list from back to front so this is safe to do inside the loop.
				mClients.remove(i);
			}
		}
	}

	
	private void sendSpeechStatusToUI(int speech) {
		for (int i=mClients.size()-1; i>=0; i-- ) {
			try {
				//Send Step Count
				Message msg = Message.obtain(null, MSG_SPEECH_STATUS);
				Bundle b = new Bundle();
				long time = System.currentTimeMillis();
				
				//Log.d("speechContext", ""+speech);	
				
				b.putInt("speech", speech);
				msg.setData(b);
				mClients.get(i).send(msg);
			} catch (RemoteException e) {
				// The client is dead. Remove it from the list; we are going through the list from back to front so this is safe to do inside the loop.
				mClients.remove(i);
			}
		}
	}

	/**
	 * On Binding, return a binder
	 */
	@Override
	public IBinder onBind(Intent intent) {
		return mMessenger.getBinder();
	}


	
	

	//Start service automatically if we reboot the phone
	public static class Context_BGReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			Intent bootUp = new Intent(context,Context_Service.class);
			context.startService(bootUp);
		}		
	}

	@SuppressWarnings("deprecation")
	private void showNotification() {
		//Cancel previous notification
		if(nm!=null)
			nm.cancel(NOTIFICATION_ID);
		else
			nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

		// The PendingIntent to launch our activity if the user selects this notification
		PendingIntent contentIntent = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 0);

		// Use the commented block of code if your target environment is Android-16 or higher 
		/*Notification notification = new Notification.Builder(this)
		.setContentTitle("Context Service")
		.setContentText("Running").setSmallIcon(R.drawable.icon)
		.setContentIntent(contentIntent)
		.build();
		
		nm.notify(NOTIFICATION_ID, notification); */
		
		//For lower versions of Android, the following code should work
		Notification notification = new Notification();
		//notification.icon = R.drawable.icon;
		notification.tickerText = getString(R.string.app_name);
		notification.contentIntent = contentIntent;
        notification.when = System.currentTimeMillis();
        notification.setLatestEventInfo(getApplicationContext(), getString(R.string.app_name), "Microphone running?", contentIntent);
        
        // Send the notification.
        nm.notify(NOTIFICATION_ID, notification);
	}




	/* getInstance() and isRunning() are required by the */
	static Context_Service getInstance(){
		return sInstance;
	}

	public static boolean isRunning(){
		return isRunning;
	}

	public static boolean isMicrophoneRunning() {
		return isMicrophoneRunning;
	}

	
	@Override
	public void onCreate() {
		Log.d(TAG, "onCreateCalled");
		super.onCreate();
		showNotification();
		isRunning = true;
		sInstance = this;
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		nm.cancel(NOTIFICATION_ID); // Cancel the persistent notification.
        isRunning = false;
		//Don't let Context_Service die!
		Intent mobilityIntent = new Intent(this,Context_Service.class);
		startService(mobilityIntent);
	}
	
	
	
	@Override
    public int onStartCommand(Intent intent, int flags, int startId) {
		Log.d(TAG, "onStartCommandCalled");
        return START_STICKY; // run until explicitly stopped.
    }

}
