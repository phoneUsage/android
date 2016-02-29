package edu.dartmouth.phoneusage.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;

import edu.dartmouth.phoneusage.R;

/**
 * Created by hunterestrada on 2/28/16.
 */
public class TodayCircleView extends View {

    SharedPreferences mSharedPreferences;
    String mDurationKey;
    String mLimitationKey;

    Paint mPaint = new Paint();
    int mColor;

    public TodayCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        mDurationKey = context.getString(R.string.key_for_daily_duration);
        mLimitationKey = context.getString(R.string.key_for_daily_limitation);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        long duration = mSharedPreferences.getLong(mDurationKey, 6600000);
        long limitation = mSharedPreferences.getLong(mLimitationKey, 8800000);
        double percentage = (double) duration / (double) limitation;

        // draw circle
        int r = (int) (Math.min(1.0, percentage) * 255.0);
        int g = (int) (Math.max(0.0, 1.0 - percentage) * 255.0);
        int b = 10;
        mPaint.setColor(Color.rgb(r, g, b)); // TODO: green -> red

        int x = getWidth() / 2;
        int y = getHeight() / 2;
        double radius = Math.min((double) getWidth(), (double) getHeight()) / 2.0 * Math.min(percentage, 1.0) - PADDING;

        canvas.drawCircle(x, y, (int) radius, mPaint);


        // draw information
        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(TEXT_SIZE);
        mPaint.setTextAlign(Paint.Align.CENTER);


        long hours = (duration / 3600000) % 24;
        long minutes = (duration / 60000) % 60;
        String timeText = String.format("%.2f\n%d hr %d min", percentage * 100, hours, minutes);

        canvas.drawText(timeText, x, y, mPaint);
    }

    /* CONSTANTS */
    private static final int PADDING = 5;
    private static final int TEXT_SIZE = 40;
}
