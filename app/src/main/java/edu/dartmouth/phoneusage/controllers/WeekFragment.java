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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.models.classes.LocalDailyUsageEntry;
import edu.dartmouth.phoneusage.models.data_sources.BaseDataSource;
import edu.dartmouth.phoneusage.models.data_sources.LocalDailyUsageEntryDataSource;
import edu.dartmouth.phoneusage.utils.CalendarUtil;

/**
 * Created by SujayBusam on 2/27/16.
 *
 * Fragment to display weekly overview of total phone usage and number of unlocks. Breaks down
 * on a weekly and daily basis using a chart.
 */
public class WeekFragment extends Fragment implements UpdatableFragment {
    private static String TAG = "SVB-WeekFragment";
    private static SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE", Locale.US);

    private CombinedChart mChart;
    private String[] mDays = new String[] {
            "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"
    };
    private Map<String, List<LocalDailyUsageEntry>> mUsageDataMap;

    /**
     * Update UI elements when tab selected
     */
    @Override
    public void updateUI() {
        if (getActivity() == null) { return; }

        // Get the start time in millis for the past Sunday
        long sundayStartMS = CalendarUtil.calendarForLastSundayStart().getTimeInMillis();
        long endDateTimeMS = Calendar.getInstance().getTimeInMillis();

        // Get all LocalDailyUsageEntry objects from the past week and populate the weekly chart.
        LocalDailyUsageEntryDataSource.getInstance(getActivity())
                .fetchLocalDailyUsageEntriesBetweenDateTimes(sundayStartMS, endDateTimeMS,
                        new BaseDataSource.CompletionHandler<List<LocalDailyUsageEntry>>() {
                            @Override
                            public void onDbTaskCompleted(List<LocalDailyUsageEntry> result) {
                                populateWeeklyUsageChart(result);
                            }
                        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");

        // Inflate the layout for this fragment;
        View view = inflater.inflate(R.layout.fragment_week, container, false);

        initWeeklyUsageChart(view);
        updateUI();

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        mUsageDataMap = new HashMap<>();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "onResume");
        super.onResume();
        updateUI();
    }

    // **************************** Private Chart Helper Functions ****************************** //

    private void initWeeklyUsageChart(View view) {
        mChart = (CombinedChart) view.findViewById(R.id.weekly_usage_chart);
        mChart.setDescription("");
        mChart.setBackgroundColor(Color.WHITE);
        mChart.setDrawGridBackground(false);
        mChart.setDrawBarShadow(false);

        // draw bars behind lines
        mChart.setDrawOrder(new CombinedChart.DrawOrder[]{
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
    }

    private void populateWeeklyUsageChart(List<LocalDailyUsageEntry> usageEntries) {
        // Rebuild the hash map that maps days to lists of entries
        mUsageDataMap = new HashMap<>();
        for (LocalDailyUsageEntry usageEntry : usageEntries) {
            Calendar calForEntry = CalendarUtil.calendarFromMillis(usageEntry.getDateTimeMS());
            String abbreviatedDay = dateFormatter.format(calForEntry.getTime());
            if (mUsageDataMap.get(abbreviatedDay) == null) {
                // No entries for this day yet, so create a new list.
                List<LocalDailyUsageEntry> entryList = new ArrayList<>();
                entryList.add(usageEntry);
                mUsageDataMap.put(abbreviatedDay, entryList);
            } else {
                // Entries already exist for this day. Append the current one.
                mUsageDataMap.get(abbreviatedDay).add(usageEntry);
            }
        }

        // Build up the line and bar entries for the chart from the new data mapping.
        List<Entry> lineEntries = new ArrayList<>();
        List<BarEntry> barEntries = new ArrayList<>();
        for (int dayIndex = 0; dayIndex < mDays.length; dayIndex++) {
            List<LocalDailyUsageEntry> dailyEntries = mUsageDataMap.get(mDays[dayIndex]);
            if (dailyEntries != null) {
                for (LocalDailyUsageEntry dailyEntry : dailyEntries) {
                    lineEntries.add(new Entry(dailyEntry.getTotalUsageInHours(), dayIndex));
                    barEntries.add(new BarEntry(dailyEntry.getGoalHoursInHours(), dayIndex));
                }
            }
        }

        // Add the line and bar entries to the chart.
        CombinedData combinedData = new CombinedData(mDays);
        combinedData.setData(getLineData(lineEntries));
        combinedData.setData(getBarData(barEntries));
        mChart.setData(combinedData);
        mChart.invalidate();
    }

    private LineData getLineData(List<Entry> entries) {
        LineData lineData = new LineData();

        LineDataSet set = new LineDataSet(entries, "Your Total Usage Hours");
        // set.setColor(Color.RED);
        set.setColor(getResources().getColor(android.R.color.holo_red_dark));
        set.setLineWidth(2.5f);
        // set.setCircleColor(Color.RED);
        set.setCircleColor(getResources().getColor(android.R.color.holo_red_dark));
        set.setCircleRadius(5f);
        // set.setFillColor(Color.RED);
        set.setFillColor(getResources().getColor(android.R.color.holo_red_dark));
        set.setDrawCubic(false);
        set.setDrawValues(true);
        set.setValueTextSize(12f);
        // set.setValueTextColor(Color.RED);
        set.setValueTextColor(getResources().getColor(android.R.color.holo_red_dark));

        set.setAxisDependency(YAxis.AxisDependency.LEFT);

        lineData.addDataSet(set);
        return lineData;
    }

    private BarData getBarData(List<BarEntry> entries) {
        BarData barData = new BarData();

        BarDataSet set = new BarDataSet(entries, "Your Goal Usage Hours");
        // set.setColor(Color.rgb(60, 220, 78));
        set.setColor(getResources().getColor(android.R.color.holo_green_light));
        //set.setValueTextColor(Color.rgb(60, 220, 78));
        set.setValueTextColor(getResources().getColor(android.R.color.holo_green_dark));
        set.setValueTextSize(12f);
        set.setAxisDependency(YAxis.AxisDependency.LEFT);

        barData.addDataSet(set);
        return barData;
    }
}
