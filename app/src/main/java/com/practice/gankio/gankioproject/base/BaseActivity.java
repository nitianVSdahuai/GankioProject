package com.practice.gankio.gankioproject.base;

import android.os.Bundle;
import android.widget.Toast;

import com.zhy.autolayout.AutoLayoutActivity;

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends AutoLayoutActivity {

    public T presenter;
    protected String tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = initPresenter();
        presenter.onCreate((V) this);
        tag = this.getClass().getSimpleName();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    public abstract T initPresenter();

    public void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
