package edu.dartmouth.phoneusage.controllers;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

import edu.dartmouth.phoneusage.R;

/**
 * Created by SujayBusam on 2/27/16.
 *
 * Fragment to display weekly overview of total phone usage and number of unlocks. Breaks down
 * on a weekly and daily basis using a chart.
 */
public class WeekFragment extends Fragment implements UpdatableFragment {
    private static String TAG = "WeekFragment";

    private CombinedChart mChart;
    private CombinedData mCombinedData;
    private String[] mDays = new String[] {
            "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");

        // Inflate the layout for this fragment;
        View view = inflater.inflate(R.layout.fragment_week, container, false);

        initWeeklyUsageChart(view);

        // TODO: replace this with real data
        List<Entry> lineEntries = new ArrayList<>();
        for (int index = 0; index < mDays.length; index++)
            lineEntries.add(new Entry(getRandom(4.5f, 0), index));

        List<BarEntry> barEntries = new ArrayList<>();
        for (int index = 0; index < mDays.length; index++)
            barEntries.add(new BarEntry(getRandom(5.5f, 3), index));

        updateLineData(lineEntries);
        updateBarData(barEntries);
        mChart.setData(mCombinedData);
        mChart.invalidate();

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
    }


    // **************************** Private Chart Helper Functions ****************************** //

    private void initWeeklyUsageChart(View view) {
        mChart = (CombinedChart) view.findViewById(R.id.weekly_usage_chart);
        mChart.setDescription("");
        mChart.setBackgroundColor(Color.WHITE);
        mChart.setDrawGridBackground(false);
        mChart.setDrawBarShadow(false);

        // draw bars behind lines
        mChart.setDrawOrder(new CombinedChart.DrawOrder[] {
                CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.LINE
        });

        YAxis rightAxis = mChart.getAxisRight();
        rightAxis.setDrawGridLines(false);
        rightAxis.setAxisMinValue(0f); // this replaces setStartAtZero(true)

        YAxis leftAxis = mChart.getAxisLeft();
        leftAxis.setDrawGridLines(false);
        leftAxis.setAxisMinValue(0f); // this replaces setStartAtZero(true)

        XAxis xAxis = mChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        mCombinedData = new CombinedData(mDays);
    }

    private void updateLineData(List<Entry> entries) {
        LineData lineData = new LineData();

        LineDataSet set = new LineDataSet(entries, "Your Total Usage");
        // set.setColor(Color.RED);
        set.setColor(getResources().getColor(android.R.color.holo_red_dark));
        set.setLineWidth(2.5f);
        // set.setCircleColor(Color.RED);
        set.setCircleColor(getResources().getColor(android.R.color.holo_red_dark));
        set.setCircleRadius(5f);
        // set.setFillColor(Color.RED);
        set.setFillColor(getResources().getColor(android.R.color.holo_red_dark));
        set.setDrawCubic(true);
        set.setDrawValues(true);
        set.setValueTextSize(10f);
        // set.setValueTextColor(Color.RED);
        set.setValueTextColor(getResources().getColor(android.R.color.holo_red_dark));

        set.setAxisDependency(YAxis.AxisDependency.LEFT);

        lineData.addDataSet(set);
        mCombinedData.setData(lineData);
    }

    private void updateBarData(List<BarEntry> entries) {
        BarData barData = new BarData();

        BarDataSet set = new BarDataSet(entries, "Goal Percentile Usage");
        // set.setColor(Color.rgb(60, 220, 78));
        set.setColor(getResources().getColor(android.R.color.holo_green_light));
        //set.setValueTextColor(Color.rgb(60, 220, 78));
        set.setValueTextColor(getResources().getColor(android.R.color.holo_green_dark));
        set.setValueTextSize(10f);
        set.setAxisDependency(YAxis.AxisDependency.LEFT);

        barData.addDataSet(set);
        mCombinedData.setData(barData);
    }

    private float getRandom(float range, float startsfrom) {
        return (float) (Math.random() * range) + startsfrom;
    }

    @Override
    public void updateUI() {
        // update UI elements when tab selected
    }
}
