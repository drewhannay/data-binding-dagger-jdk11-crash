package com.example.myapplication;

import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class RandomBindingAdapter {

    @BindingAdapter("whatever")
    public void setWhateverToSomething(TextView textView, String what) {
        textView.setText(what);
    }
}
