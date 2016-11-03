package com.practice.gankio.gankioproject.main;

import android.os.Bundle;

import com.practice.gankio.gankioproject.R;
import com.practice.gankio.gankioproject.base.BaseActivity;

public class MainActivity extends BaseActivity<MainContract.View, MainPresenter> implements MainContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public MainPresenter initPresenter() {
        return new MainPresenter();
    }
}
