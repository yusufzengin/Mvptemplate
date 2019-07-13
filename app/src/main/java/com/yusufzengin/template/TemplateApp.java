package com.yusufzengin.template;

import com.yusufzengin.template.di.DaggerApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class TemplateApp extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();


    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerApplicationComponent.builder().application(this).build();
    }
}
