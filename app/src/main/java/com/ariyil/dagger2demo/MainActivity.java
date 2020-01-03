package com.ariyil.dagger2demo;

import android.os.Bundle;

import com.ariyil.dagger2demo.ui.base.BaseActivity;
import com.ariyil.dagger2demo.ui.main.MainFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.main_activity;
    }
}
