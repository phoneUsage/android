package edu.dartmouth.phoneusage.controllers;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.views.TodayCircleView;

/**
 * Created by benribovich on 2/27/16.
 */
public class TodayFragment extends Fragment {
    View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_today, container, false);
        return mView;
    }

    @Override // update the the displayed information when visible
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (isVisibleToUser && mView != null) {
            mView.refreshDrawableState();
        }
    }
}
