package edu.dartmouth.phoneusage.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.parse.FunctionCallback;
import com.parse.ParseCloud;
import com.parse.ParseException;
import com.parse.ParseObject;

import org.apache.commons.math3.special.Erf;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import edu.dartmouth.phoneusage.models.data_sources.BaseDataSource;

/**
 * Created by benribovich on 3/4/16.
 */
public class ParseUtils {

    public static void getStatsInfo(Context prefsContext,
                                    final BaseDataSource.CompletionHandler<Boolean> completionHandler){
        HashMap<String, Object> params = new HashMap<String, Object>();
        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(prefsContext);
        ParseCloud.callFunctionInBackground("getStatistics", params, new FunctionCallback<Map<String,String>>() {
            @Override
            public void done(Map<String,String> objects, ParseException e) {
                if (e == null) {
                    Log.d("ParseUtils", "" + objects);
                    Float average = Float.parseFloat(objects.get("average"));
                    Float stdDev = Float.parseFloat(objects.get("stdDev"));
                    prefs.edit().putFloat("AVERAGE", average).apply();
                    prefs.edit().putFloat("STDDEV", stdDev).apply();
                    prefs.edit().putLong("LIMIT", Math.round(percentileFromStats(average, stdDev, prefs.getInt("PERCENTILE", 50)))).apply();

                    Log.d("ParseResults Average", prefs.getFloat("AVERAGE", 0) + "");
                    Log.d("ParseResults SD", prefs.getFloat("STDDEV", 0) + "");
                    Log.d("ParseResults Limit", prefs.getLong("LIMIT", 0) + "");
                    completionHandler.onTaskCompleted(true /*suceeded*/);
                } else {
                    completionHandler.onTaskCompleted(false /*failed*/);
                }
            }
        });
    }

    public static void addInfoToParse(long duration, long unlocks){
        ParseObject entry = new ParseObject("PFDailyUsageEntry");
        Date now = new Date();
        entry.put("date", now);
        entry.put("totalUsage", duration);
        entry.put("totalUnlocks", unlocks);
        entry.saveInBackground();
        Log.d("SVB-ParseUtils", String.format("addInfoToParse. Duration: %d, Unlocks: %d, Date: %s",
                duration, unlocks, now.toString()));
    }

    public static void recalculatePercentile(Context prefsContext,Integer percentile){
        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(prefsContext);
        Float limit = percentileFromStats(prefs.getFloat("AVERAGE", 0),prefs.getFloat("STDDEV", 0),percentile);
        Log.d("ParseUtils Limit", limit + "");
        prefs.edit().putLong("LIMIT", Math.round(limit)).apply();
    }


    public static Float percentileFromStats(Float mean, Float stdDev, Integer percentile){
        return mean + (stdDev*pToZ(percentile/100.0));
    }

    public static Float pToZ(double p) {
        double z = -Math.sqrt(2) * Erf.erfcInv(2*p);
        return(Float.parseFloat(z+""));
    }

    private static float getRandom(float range, float startsfrom) {
        return (float) (Math.random() * range) + startsfrom;
    }
}
