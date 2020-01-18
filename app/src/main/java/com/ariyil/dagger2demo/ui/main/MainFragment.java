package com.ariyil.dagger2demo.ui.main;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ariyil.dagger2demo.R;
import com.ariyil.dagger2demo.ui.base.BaseFragment;

public class MainFragment extends BaseFragment {

    public static MainFragment newInstance() {
        return new MainFragment();
    }


    @Override
    protected int getLayoutRes() {
        return R.layout.main_fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    protected Class getViewModel() {
        return MainViewModel.class;
    }
}
