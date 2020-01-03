package com.ariyil.dagger2demo.dagger.module;

import com.ariyil.dagger2demo.ui.base.BaseViewModel;
import com.ariyil.dagger2demo.ui.base.DemoViewModelFactory;
import com.ariyil.dagger2demo.ui.main.MainViewModel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;


@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    @SuppressWarnings("unused")
    abstract ViewModel bindsMainViewModel(MainViewModel mainViewModel);


    @Binds
    abstract ViewModelProvider.Factory bindsViewModelFactory(DemoViewModelFactory viewModelFactory);
}
