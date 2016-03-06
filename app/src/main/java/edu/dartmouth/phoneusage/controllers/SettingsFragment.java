package edu.dartmouth.phoneusage.controllers;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.dartmouth.phoneusage.R;

/**
 * Created by benribovich on 2/27/16.
 */
public class SettingsFragment extends PreferenceFragment implements UpdatableFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settingsfragment);
        Preference seekBar = findPreference("PERCENTILE");
        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        seekBar.setSummary(prefs.getInt("PERCENTILE",50)+"%");
    }

    @Override
    public void updateUI() {
        // update UI elements when tab selected
    }
}
