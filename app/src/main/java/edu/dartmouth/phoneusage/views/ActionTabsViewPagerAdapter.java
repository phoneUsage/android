package edu.dartmouth.phoneusage.views;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.ArrayList;

import edu.dartmouth.phoneusage.controllers.UpdatableFragment;

/**
 * Created by Fanglin Chen on 12/18/14.
 */

public class ActionTabsViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments;

    public static final int TODAY = 0;
    public static final int WEEK = 1;
    public static final int SETTINGS = 2;
    public static final String UI_TAB_TODAY = "TODAY";
    public static final String UI_TAB_WEEK = "WEEK";
    public static final String UI_TAB_SETTINGS = "SETTINGS";

    public ActionTabsViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments){
        super(fm);
        this.fragments = fragments;
    }

    // updates UI of requested fragment, then returns updated fragment
    public Fragment getItem(int pos){
        ((UpdatableFragment) fragments.get(pos)).updateUI();
        return fragments.get(pos);
    }

    public int getCount(){
        return fragments.size();
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case TODAY:
                return UI_TAB_TODAY;
            case WEEK:
                return UI_TAB_WEEK;
            case SETTINGS:
                return UI_TAB_SETTINGS;
            default:
                break;
        }
        return null;
    }
}
