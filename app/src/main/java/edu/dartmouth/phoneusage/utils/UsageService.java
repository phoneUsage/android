package edu.dartmouth.phoneusage.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.RemoteViews;

import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.controllers.MainActivity;

/**
 * Created by hunterestrada on 3/2/16.
 */
public class UsageService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        setupReceiver();
        setupNotification();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // must explicitly call kill the service
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        stopSelf();
    }


    /* Helper Methods */

    // register broadcast receiver to intercept usage events
    private void setupReceiver() {
        Log.d(getClass().getName(), "setupReceiver");
        UsageBroadcastReceiver ubc  = new UsageBroadcastReceiver(this);
        registerReceiver(ubc, new IntentFilter(Intent.ACTION_USER_PRESENT));
        registerReceiver(ubc, new IntentFilter(Intent.ACTION_SCREEN_OFF));
        registerReceiver(ubc, new IntentFilter(Intent.ACTION_SHUTDOWN));
    }

    // displays usage on the lock screen with a notification
    private void setupNotification(){
        Log.d(getClass().getName(), "setupNotification");
        final NotificationManager nm = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        CharSequence tickerText = "hello";
        long when = System.currentTimeMillis();
        final Notification noti = new Notification(R.mipmap.ic_launcher, tickerText, when);
        Context context = this.getApplicationContext();
        Intent notiIntent = new Intent(context, MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(context, 0, notiIntent, 0);
        noti.flags |= Notification.FLAG_ONGOING_EVENT;
        final RemoteViews contentView = new RemoteViews(getPackageName(), R.layout.notification);
        contentView.setImageViewResource(R.id.status_icon, R.mipmap.ic_launcher);
        noti.contentView = contentView;
        noti.contentIntent = pi;
        nm.notify(STATUS_BAR_NOTIFICATION, noti);

        final SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        new Thread(new Runnable() {
            public void run() {

                boolean run = true;
                while (run) {
                    long duration = sharedPreferences.getLong(getString(R.string.key_for_daily_duration), 0);
                    long limitation = sharedPreferences.getLong(getString(R.string.key_for_daily_limitation), 8800000);

                    // values to display on notification banner
                    float percentage = ((float) duration / (float) limitation) * 100;
                    long hours = (duration / 3600000) % 24;
                    long minutes = (duration / 60000) % 60;
                    long unlocks = sharedPreferences.getLong(getString(R.string.key_for_daily_unlocks), 0);


                    String usageText = String.format("Usage: %.2f%% @ %d h %02d m\nUnlocks: %d", percentage, hours, minutes, unlocks);
                    // CharSequence title =  mPercentage +  "%, 60 unlocks";
                    noti.contentView.setTextViewText(R.id.status_text, usageText);
                    noti.contentView.setProgressBar(R.id.progressBar, 100, (int) (percentage), false);

                    if(percentage>=100){
                        noti.contentView.setProgressBar(R.id.full_progressBar, 100, 100, false);
                    }

                    nm.notify(STATUS_BAR_NOTIFICATION, noti);
                    SystemClock.sleep(10000);
                }
            }
        }).start();
    }

    /* CONSTANTS */

    private static final int STATUS_BAR_NOTIFICATION = 0;
}