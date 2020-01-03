package com.ariyil.dagger2demo.dagger.component;

import android.app.Application;

import com.ariyil.dagger2demo.DemoApp;
import com.ariyil.dagger2demo.dagger.builder.ActivityBuilder;
import com.ariyil.dagger2demo.dagger.builder.FragmentBuilderModule;
import com.ariyil.dagger2demo.dagger.module.AppModule;
import com.ariyil.dagger2demo.dagger.module.ViewModelModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;


@Singleton
@Component(modules = {
        AppModule.class,
        AndroidInjectionModule.class,
        FragmentBuilderModule.class,
        ActivityBuilder.class,
        ViewModelModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(DemoApp aplApplication);
}