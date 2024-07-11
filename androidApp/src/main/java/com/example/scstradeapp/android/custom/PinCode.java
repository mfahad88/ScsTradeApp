package com.example.scstradeapp.android.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.scstradeapp.android.databinding.CustomPinCodeBinding;

public class PinCode extends ConstraintLayout {
    private CustomPinCodeBinding binding;
    public PinCode(@NonNull Context context) {
        super(context);
        init();
    }



    public PinCode(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PinCode(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public PinCode(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        binding = CustomPinCodeBinding.inflate(LayoutInflater.from(getContext()));
    }

/*    private String getPin(){

    }*/
}
