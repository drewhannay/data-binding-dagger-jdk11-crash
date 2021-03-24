package com.example.myapplication;

import dagger.Component;

@Component(modules = {
        ApplicationModule.class
})
public interface AppComponent {
    void inject(MyApplication myApplication);
}
