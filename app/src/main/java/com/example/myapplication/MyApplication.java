package com.example.myapplication;

import android.app.Application;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

public class MyApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        appComponent.inject(this);

        RandomBindingAdapter randomBindingAdapter = new RandomBindingAdapter();
        DataBindingUtil.setDefaultComponent(new DataBindingComponent() {
            public RandomBindingAdapter getRandomBindingAdapter() {
                return randomBindingAdapter;
            }
        });
    }
}
