package edu.dartmouth.phoneusage.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Calendar;

/**
 * Created by hunterestrada on 3/2/16.
 */
public class MidnightScheduler {

    public static void prepare(Context context) {
        Log.d("MidnightScheduler", "alarm created and set");

        // intent to communicate with UsageBroadcastReceiver
        Intent intent = new Intent(context, MidnightBroadcastReceiver.class);
        intent.putExtra(REQUEST_CODE_NAME, REQUEST_CODE); // unique for broadcast rx
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context,
                REQUEST_CODE, intent, PendingIntent.FLAG_CANCEL_CURRENT);

        // calendar to set time of uploading/resetting
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, HOUR_OF_DAY);
        calendar.set(Calendar.MINUTE, MINUTE);
        calendar.set(Calendar.SECOND, SECOND);
        if (calendar.getTimeInMillis() < System.currentTimeMillis())
            calendar.add(Calendar.DATE, 1);

        Log.d("MidnightScheduler", "fired alarm");

        // repeating alarm to fire pending intent
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
//        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
                AlarmManager.INTERVAL_DAY, pendingIntent);
    }

    /* CONSTANTS */

    public static final int REQUEST_CODE = 238293; // constant random
    public static final String REQUEST_CODE_NAME = "request_code_name";

    public static final int HOUR_OF_DAY = 13;
    public static final int MINUTE = 22;
    public static final int SECOND = 30;
}
