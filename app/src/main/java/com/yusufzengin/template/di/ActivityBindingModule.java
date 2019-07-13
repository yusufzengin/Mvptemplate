package com.yusufzengin.template.di;

import com.yusufzengin.template.di.scopes.ActivityScope;
import com.yusufzengin.template.ui.main.MainActivity;
import com.yusufzengin.template.ui.main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {MainModule.class})
    abstract MainActivity mainActivity();

}
