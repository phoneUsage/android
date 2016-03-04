package edu.dartmouth.phoneusage.utils;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

import edu.dartmouth.phoneusage.utils.Context_Service;

/**
 * Created by benribovich on 3/3/16.
 */
public class VoiceHelper {

    private boolean microphoneStarted = false;
    private Context context;

    /**
     * Messenger service for exchanging messages with the background service
     */
    private Messenger mService = null;
    /**
     * Variable indicating if this activity is connected to the service
     */
    private boolean mIsBound;


    public VoiceHelper(Context c){
        context =c;
    }

    /**
     * Messenger receiving messages from the background service to update UI
     */
    private final Messenger mMessenger = new Messenger(new IncomingHandler());

    /**
     * Handler to handle incoming messages
     */
    @SuppressLint("HandlerLeak")
    class IncomingHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case Context_Service.MSG_MICROPHONE_STARTED:
                {
                    Toast.makeText(context, "microphone started", Toast.LENGTH_SHORT);
                    break;
                }
                case Context_Service.MSG_MICROPHONE_STOPPED:
                {
                    Toast.makeText(context, "microphone stopped", Toast.LENGTH_SHORT);
                    break;
                }
                case Context_Service.MSG_SPEECH_STATUS:
                {
                    Integer speech = msg.getData().getInt("speech");
                    //Log.d("speech", "speech in main: "+speech);
                    if (speech==1.0)
                        Toast.makeText(context, "Speech", Toast.LENGTH_SHORT);
                    else
                        Toast.makeText(context, "Noise", Toast.LENGTH_SHORT);

                    //statusSpeechView.setText(""+speech);
                    break;
                }
                default:
                    super.handleMessage(msg);
            }
        }
    }

    /**
     * Connection with the service
     */
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            mService = new Messenger(service);
            Log.d("Tagg", "Attached to the Service");
            mIsBound = true;
            try {
                Message msg = Message.obtain(null, Context_Service.MSG_REGISTER_CLIENT);
                msg.replyTo = mMessenger;
                mService.send(msg);
            } catch (RemoteException e) {
                // In this case the service has crashed before we could even do anything with it
            }
        }

        public void onServiceDisconnected(ComponentName className) {
            // This is called when the connection with the service has been unexpectedly disconnected - process crashed.
            mIsBound = false;
            mService = null;
            Log.d("tagg", "Disconnected from the Service");
        }
    };

    /**
     * Binds this activity to the service if the service is already running
     */
    private void bindToServiceIfIsRunning() {
        //If the service is running when the activity starts, we want to automatically bind to it.
        if (Context_Service.isRunning()) {
            doBindService();//
            Log.d("tagg", "Request to bind service");
        }
    }

    /**
     * This method is required to send a request to the background service.
     * In current application, we are not sending any message yet.
     * @param message
     */
    private void sendMessageToService(int message) {
        if (mIsBound) {
            if (mService != null) {
                try {
                    Message msg = Message.obtain(null, message);
                    msg.replyTo = mMessenger;
                    mService.send(msg);
                } catch (RemoteException e) {
                }
            }
        }
    }

    /**
     * Binds the activity to the background service
     */
    void doBindService() {
        context.bindService(new Intent(context, Context_Service.class), mConnection, Context.BIND_AUTO_CREATE);
        Log.d("tagg","Binding to Service");
    }

    /**
     * Unbind this activity from the background service
     */
    void doUnbindService() {
        if (mIsBound) {
            // If we have received the service, and hence registered with it, then now is the time to unregister.
            if (mService != null) {
                try {
                    Message msg = Message.obtain(null, Context_Service.MSG_UNREGISTER_CLIENT);
                    msg.replyTo = mMessenger;
                    mService.send(msg);
                } catch (RemoteException e) {
                    // There is nothing special we need to do if the service has crashed.
                }
            }
            // Detach our existing connection.
            context.unbindService(mConnection);
            Log.d("tagg","Unbinding from Service");
        }
    }

    /**
     * Sends Microphone Start Request
     */
    private void startMicrophone() {
        if(!mIsBound) {
            doBindService();
        }
        if(mIsBound) {
            sendMessageToService(Context_Service.MSG_START_MICROPHONE);
        }
    }

    /**
     * Sends Accelerometer Stop Request
     */
    private void stopMicrophone() {
        if(!mIsBound) {
            doBindService();
        }
        if(mIsBound) {
            sendMessageToService(Context_Service.MSG_STOP_MICROPHONE);
        }
    }

}
