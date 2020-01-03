package com.ariyil.dagger2demo.dagger.builder;

import com.ariyil.dagger2demo.ui.main.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class FragmentBuilderModule {

    @SuppressWarnings("unused")
    @ContributesAndroidInjector
    abstract MainFragment contributeMainFragment();



}
