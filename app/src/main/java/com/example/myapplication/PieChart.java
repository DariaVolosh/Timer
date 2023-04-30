package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.core.content.ContextCompat;

public class PieChart extends View {
    public PieChart(Context context, AttributeSet attr) {
        super(context, attr);
        init();
    }

    private void init() {
        Paint textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(ContextCompat.getColor(getContext(), R.color.purple_500));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(getContext(), R.color.purple_500));
        canvas.drawOval(0,1,3,0, paint);
    }
}
