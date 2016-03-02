package edu.dartmouth.phoneusage.controllers;

import android.app.Fragment;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.views.TodayCircleView;

/**
 * Created by benribovich on 2/27/16.
 */
public class TodayFragment extends Fragment implements UpdatableFragment {
    View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_today, container, false);
        return mView;
    }

    @Override // updates today circle view stats when visible
    public void updateUI() {
        if (mView != null) {
            mView.findViewById(R.id.TodayCircleView).invalidate();
        }
    }
}
