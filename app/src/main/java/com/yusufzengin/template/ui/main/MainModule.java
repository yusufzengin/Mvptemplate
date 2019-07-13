package com.yusufzengin.template.ui.main;

import com.yusufzengin.template.di.scopes.ActivityScope;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainModule {

    @ActivityScope
    @Binds
    abstract MainContract.Presenter providePresenter(MainPresenter presenter);

}
