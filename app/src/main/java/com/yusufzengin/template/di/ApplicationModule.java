package com.yusufzengin.template.di;

import android.app.Application;
import android.content.Context;

import com.yusufzengin.template.di.qualifiers.ApplicationContext;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ApplicationModule {

    @ApplicationContext
    @Binds
    abstract Context bindContext(Application application);
}
