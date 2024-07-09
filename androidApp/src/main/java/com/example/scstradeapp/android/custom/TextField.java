package com.example.scstradeapp.android.custom;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.EditText;

import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;

import com.example.scstradeapp.android.R;

public class TextField extends EditText {
    public TextField(Context context) {
        super(context);
        init();
    }

    public TextField(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextField(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.bg_edt_text));
        setGravity(Gravity.CENTER_VERTICAL);
        setPadding(40,0,40,0);
    }
}