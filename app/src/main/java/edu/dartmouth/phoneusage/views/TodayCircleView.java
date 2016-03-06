package edu.dartmouth.phoneusage.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import edu.dartmouth.phoneusage.R;

/**
 * Created by hunterestrada on 2/28/16.
 */
public class TodayCircleView extends View {

    SharedPreferences mSharedPreferences;
    String mDurationKey;
    String mLimitationKey;
    String mUnlocksKey;
    String mPercentileKey;
    DateFormat mDateFormatter;

    CircularProgressDrawable mCircularProgress;

    Paint mPaint = new Paint();
    Rect mBounds = new Rect();

    public TodayCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        mDurationKey = context.getString(R.string.key_for_daily_duration);
        mLimitationKey = context.getString(R.string.key_for_daily_limitation);
        mPercentileKey = context.getString(R.string.key_for_percentile);
        mDateFormatter = new SimpleDateFormat("EEEE", Locale.US);

        mCircularProgress = new CircularProgressDrawable.Builder()
                .setRingWidth(8)
                .setOutlineColor(getResources().getColor(android.R.color.darker_gray))
                .create();
        mUnlocksKey = context.getString(R.string.key_for_daily_unlocks);
        mPaint.setFlags(Paint.ANTI_ALIAS_FLAG);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // GET INFORMATION

        // center coordinates
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        // shared preferences
        long duration = mSharedPreferences.getLong(mDurationKey, 0);
        long limitation = mSharedPreferences.getLong(mLimitationKey, 21600000);
        int percentile = mSharedPreferences.getInt(mPercentileKey, 50);
        float percentage = ((float) duration / (float) limitation) * 100;
        // float percentage = (float) 101;
        long unlocks = mSharedPreferences.getLong(mUnlocksKey, 0);

        String day = mDateFormatter.format(Calendar.getInstance().getTimeInMillis());


        // DRAW CIRCULAR PROGRESS

        mCircularProgress.setBounds(0, 0, getWidth(), getHeight() / 2);
        mCircularProgress.setProgress(percentage / 100);

        int circleColor = getResources().getColor(android.R.color.holo_green_light);

        if (percentage > 100) { // warning: usage exceeded
            circleColor = getResources().getColor(android.R.color.holo_red_dark);
        } else if (percentage > 50) { // warning: usage limited
            circleColor = getResources().getColor(android.R.color.holo_orange_light);
        }

        mCircularProgress.centerColor = circleColor;
        mCircularProgress.setRingColor(circleColor);
        mCircularProgress.draw(canvas);


        // DRAW LARGE TEXT

        mPaint.setTextSize(BIG_TEXT_SIZE);
        mPaint.setTextAlign(Paint.Align.CENTER);

        if (percentage > 100) {
            mPaint.setColor(Color.WHITE);
        } else {
            mPaint.setColor(Color.BLACK);
        }

        // percentage text
        canvas.drawText(String.format("%.0f%%", percentage),
                centerX, mCircularProgress.getBounds().centerY() - OFFSET, mPaint);


        // duration text
        long hours = (duration / 3600000) % 24;
        long minutes = (duration / 60000) % 60;
        canvas.drawText(String.format("%d hr %02d min", hours, minutes),
                centerX, mCircularProgress.getBounds().centerY() + OFFSET, mPaint);

        mPaint.setColor(Color.BLACK);

        // limitation text
        long hoursLimit = (limitation / 3600000) % 24;
        long minutesLimit = (limitation / 60000) % 60;
        canvas.drawText(String.format("%d hr %02d min", hoursLimit, minutesLimit),
                centerX, mCircularProgress.getBounds().bottom + OFFSET * 4, mPaint);


        // DRAW SMALL TEXT

        mPaint.setTextSize(SMALL_TEXT_SIZE);
        // limit separator text
        canvas.drawText("of", centerX, mCircularProgress.getBounds().bottom + OFFSET * 2, mPaint);
        // limit detail text
        canvas.drawText(String.format("Limit based on the %d%s percentile of usage on %s.",
                percentile, percentileSuffix[percentile % 10], day),
                centerX, mCircularProgress.getBounds().bottom + OFFSET * 6, mPaint);


        // unlocks text
        canvas.drawText(String.format("%d", unlocks), centerX, getHeight() - OFFSET * 2, mPaint);
        canvas.drawText("unlocks", centerX, getHeight() - OFFSET, mPaint);
    }

    static final String[] percentileSuffix = {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};

    /* CONSTANTS */
    private static final int BIG_TEXT_SIZE = 45;
    private static final int SMALL_TEXT_SIZE = 25;
    private static final int OFFSET = 35;
}
