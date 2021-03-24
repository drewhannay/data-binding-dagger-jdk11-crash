package com.example.myapplication;

import android.app.Application;
import android.content.Context;

import androidx.databinding.DataBindingComponent;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private static Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    Context providesContext() {
        return application;
    }
}
