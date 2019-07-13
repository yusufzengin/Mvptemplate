package com.yusufzengin.template.di;

import android.app.Application;

import com.yusufzengin.template.TemplateApp;
import com.yusufzengin.template.di.scopes.ApplicationScope;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@ApplicationScope
@Component(modules = {ApplicationModule.class,
        NetworkModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class})
public interface ApplicationComponent extends AndroidInjector<TemplateApp> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        ApplicationComponent.Builder application(Application application);

        ApplicationComponent build();
    }
}
