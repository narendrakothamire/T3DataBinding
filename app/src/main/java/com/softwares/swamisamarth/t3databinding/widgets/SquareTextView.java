package com.softwares.swamisamarth.t3databinding.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by C145557 on 9/30/2016.
 */

public class SquareTextView extends TextView {
    public SquareTextView(Context context) {
        super(context);
    }

    public SquareTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
       // int parentHeight = MeasureSpec.getSize(heightMeasureSpec);
        int parentHeight = getContext().getResources().getDisplayMetrics().heightPixels;
        int myHeight = (parentHeight / 2) - 25;
        super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(myHeight, MeasureSpec.EXACTLY));
    }
}
