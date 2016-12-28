package com.charles.sihuan.zhihudaily.base;

/**
 * Created by sihuan on 2016/12/20.
 * com.charles.sihuan.zhihudaily.base
 */

public interface BasePresenter<T> {
    void attachView(T view);

    void detachView();
}
