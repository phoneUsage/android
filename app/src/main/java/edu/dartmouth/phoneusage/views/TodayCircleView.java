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

import edu.dartmouth.phoneusage.R;

/**
 * Created by hunterestrada on 2/28/16.
 */
public class TodayCircleView extends View {

    SharedPreferences mSharedPreferences;
    String mDurationKey;
    String mLimitationKey;
    String mUnlocksKey;

    Paint mPaint = new Paint();
    Rect mBounds = new Rect();

    public TodayCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        mDurationKey = context.getString(R.string.key_for_daily_duration);
        mLimitationKey = context.getString(R.string.key_for_daily_limitation);
        mUnlocksKey = context.getString(R.string.key_for_daily_unlocks);
        mPaint.setFlags(Paint.ANTI_ALIAS_FLAG);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setTextSize(TEXT_SIZE);
        // stored information
        long duration = mSharedPreferences.getLong(mDurationKey, 0);
        long limitation = mSharedPreferences.getLong(mLimitationKey, 21600000);
        double percentage = ((double) duration / (double) limitation) * 100;

        long hours = (duration / 3600000) % 24;
        long minutes = (duration / 60000) % 60;

        long hoursLimit = (limitation / 3600000) % 24;
        long minutesLimit = (limitation / 60000) % 60;

        // center coordinates
        int x = getWidth() / 2;
        int y = getHeight() / 2;

        // text information
        String timeText = String.format("%d h %02d m", hours, minutes);
        String percentageText = String.format("%.2f%%", percentage);
        String unlocksText = String.valueOf(mSharedPreferences.getLong(mUnlocksKey, 0));

        // circle information based on text information
        mPaint.getTextBounds("Unlocks", 0, 0, mBounds);

        double radius = Math.min((double) getWidth(), (double) getHeight()) / 2.0 * Math.min(percentage / 100.0, 1.0) - mBounds.height();
        Log.d(getClass().getName(), String.format("(%d, %d)", getWidth(), getHeight()));
        Log.d(getClass().getName(), String.format("r = %f", radius));
        radius = Math.max(radius, mPaint.measureText(timeText)); // ensure radius exceeds text information
        Log.d(getClass().getName(), String.format("r = %f", radius));

        // draw circle
        if (percentage > 100) {
            mPaint.setColor(getResources().getColor(android.R.color.holo_red_dark));
        } else if (percentage > 50) {
            mPaint.setColor(getResources().getColor(android.R.color.holo_orange_light));
        } else {
            mPaint.setColor(getResources().getColor(android.R.color.holo_green_light));
        }

        canvas.drawCircle(x, y, (int) radius, mPaint);


        // draw text

        if (percentage > 100) {
            mPaint.setColor(Color.WHITE);
        } else {
            mPaint.setColor(Color.BLACK);
        }

        mPaint.setTextAlign(Paint.Align.CENTER);

        // circle text (middle)
        canvas.drawText(timeText, x, y - OFFSET, mPaint);
        canvas.drawText(percentageText, x, y + OFFSET, mPaint);

        mPaint.setColor(Color.BLACK);

        // limit text (top)
        timeText = String.format("%d h %02d m", hoursLimit, minutesLimit);
        canvas.drawText(timeText, x, OFFSET * 2, mPaint);
        canvas.drawText("Limit", x, OFFSET * 4, mPaint);
        // unlock text (bottom)
        canvas.drawText(unlocksText, x, getHeight() - OFFSET * 3, mPaint);
        canvas.drawText("Unlocks", x, getHeight() - OFFSET, mPaint);
    }

    /* CONSTANTS */
    private static final int TEXT_SIZE = 45;
    private static final int OFFSET = 25;
}
