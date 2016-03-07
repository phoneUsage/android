package edu.dartmouth.phoneusage.controllers;

import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
    UnlockReceiver mUnlockReceiver;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_today, container, false);
        return mView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUnlockReceiver = new UnlockReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_UPDATE_UI);
        getActivity().registerReceiver(mUnlockReceiver, intentFilter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getActivity().unregisterReceiver(mUnlockReceiver);
    }

    @Override // updates today circle view stats when visible
    public void updateUI() {
        if (mView != null) {
            mView.findViewById(R.id.TodayCircleView).invalidate();
        }
    }

    public class UnlockReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d(getClass().getName(), "updated BX");
            updateUI();
        }
    }

    public static final String ACTION_UPDATE_UI = "update_ui";
}
