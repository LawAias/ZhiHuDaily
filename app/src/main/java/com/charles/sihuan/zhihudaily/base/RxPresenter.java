package com.charles.sihuan.zhihudaily.base;

import com.charles.sihuan.zhihudaily.base.BasePresenter;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by sihuan on 2016/12/29.
 * com.charles.sihuan.zhihudaily.contract.presenter
 */

public class RxPresenter<T> implements BasePresenter<T> {

    private T mView;
    private CompositeSubscription mCompositeSubscription;

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
        unSubscribe();
    }

    private void unSubscribe() {
        if (mCompositeSubscription != null) {
            mCompositeSubscription.unsubscribe();
        }
    }

    protected void addSubscribe(Subscription s) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(s);
    }

}
