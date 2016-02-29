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
    String mUnlocksKey;

    Paint mPaint = new Paint();
    int mColor;

    public TodayCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        mDurationKey = context.getString(R.string.key_for_daily_duration);
        mLimitationKey = context.getString(R.string.key_for_daily_limitation);
        mUnlocksKey = context.getString(R.string.key_for_daily_unlocks);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // stored information
        long duration = mSharedPreferences.getLong(mDurationKey, 6600000);
        long limitation = mSharedPreferences.getLong(mLimitationKey, 8800000);
        double percentage = (double) duration / (double) limitation;

        // center coordinates
        int x = getWidth() / 2;
        int y = getHeight() / 2;

        // text information
        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(TEXT_SIZE);
        mPaint.setTextAlign(Paint.Align.CENTER);

        long hours = (duration / 3600000) % 24;
        long minutes = (duration / 60000) % 60;

        String timeText = String.format("%2d m %2d s", hours, minutes);
        String percentageText = String.format("%.2f%%", percentage * 100);
        String unlocksText = String.valueOf(mSharedPreferences.getLong(mUnlocksKey, 0));


        // circle information based on text information
        double radius = Math.min((double) getWidth(), (double) getHeight()) / 2.0 * Math.min(percentage, 1.0) - OFFSET;
        radius = Math.max(radius, mPaint.measureText(timeText)); // ensure radius exceeds text information

        int r = (int) (Math.min(1.0, percentage) * 255.0);
        int g = (int) (Math.max(0.0, 1.0 - percentage) * 255.0);
        int b = 10;

        // perform ordered drawing
        mPaint.setColor(Color.rgb(r, g, b));
        canvas.drawCircle(x, y, (int) radius, mPaint);

        mPaint.setColor(Color.BLACK);
        canvas.drawText(timeText, x, y - OFFSET, mPaint);
        canvas.drawText(percentageText, x, y + OFFSET, mPaint);
        canvas.drawText(unlocksText, x, getHeight() - OFFSET * 3, mPaint);
        canvas.drawText("unlocks", x, getHeight() - OFFSET, mPaint);
    }

    /* CONSTANTS */
    private static final int PADDING = 5;
    private static final int TEXT_SIZE = 40;
    private static final int OFFSET = 25;
}
