package edu.dartmouth.phoneusage.controllers;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import edu.dartmouth.phoneusage.R;

/**
 * Created by benribovich on 2/27/16.
 */
public class SettingsFragment extends PreferenceFragment implements UpdatableFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settingsfragment);
    }

    @Override
    public void updateUI() {
        // update UI elements when tab selected
    }
}
