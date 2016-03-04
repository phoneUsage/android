package edu.dartmouth.phoneusage.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.parse.FunctionCallback;
import com.parse.ParseCloud;
import com.parse.ParseException;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by benribovich on 3/4/16.
 */
public class ParseUtils {

    public static void getStatsInfo(Context prefsContext){
        HashMap<String, Object> params = new HashMap<String, Object>();

        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(prefsContext);
        ParseCloud.callFunctionInBackground("getStatistics", params, new FunctionCallback<ArrayList<Float>>() {
            @Override
            public void done(ArrayList<Float> objects, ParseException e) {
                if (e == null) {
                    prefs.edit().putFloat("AVERAGE", objects.get(0)).apply();
                    prefs.edit().putFloat("STDDEV", objects.get(1)).apply();

                }
            }
        });
    }

}
