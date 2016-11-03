package com.practice.gankio.gankioproject.base;


import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public abstract class BasePresenter<V> {

    protected CompositeSubscription subscriptions;
    protected String tag;


    public BasePresenter() {
        subscriptions = new CompositeSubscription();
        tag = this.getClass().getSimpleName();

    }

    protected V mView;

    protected void onCreate(V mView) {
        this.mView = mView;

    }

    protected void onStart() {
    }

    protected void onResume() {
    }

    protected void onPause() {
    }


    protected void onStop() {
    }

    protected void registerSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }

    protected CompositeSubscription getSubscriptions() {
        return subscriptions;
    }

    protected void onDestroy() {
        subscriptions.unsubscribe();
        mView = null;
    }
}
