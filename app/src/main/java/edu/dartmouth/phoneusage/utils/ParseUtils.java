package edu.dartmouth.phoneusage.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.parse.FunctionCallback;
import com.parse.ParseCloud;
import com.parse.ParseException;
import com.parse.ParseObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by benribovich on 3/4/16.
 */
public class ParseUtils {

    public static void getStatsInfo(Context prefsContext){
        HashMap<String, Object> params = new HashMap<String, Object>();
        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(prefsContext);
        ParseCloud.callFunctionInBackground("getStatistics", params, new FunctionCallback<Map<String,String>>() {
            @Override
            public void done(Map<String,String> objects, ParseException e) {
                if (e == null) {
                    Log.d("ParseUtils", "" + objects);
                    prefs.edit().putFloat("AVERAGE", Float.parseFloat(objects.get("average"))).apply();
                    prefs.edit().putFloat("STDDEV", Float.parseFloat(objects.get("stdDev"))).apply();

                }
            }
        });
    }

    public static void addInfoToParse(long duration, long unlocks){
        ParseObject entry = new ParseObject("PFDailyUsageEntry");
        entry.put("date", new Date());
        entry.put("totalUsage", duration);
        entry.put("totalUnlocks", unlocks);
        entry.saveInBackground();
    }

}
