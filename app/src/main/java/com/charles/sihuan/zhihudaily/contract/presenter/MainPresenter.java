package com.charles.sihuan.zhihudaily.contract.presenter;

import com.charles.sihuan.zhihudaily.base.RxPresenter;
import com.charles.sihuan.zhihudaily.contract.MainContract;
import com.charles.sihuan.zhihudaily.ui.view.MainView;

/**
 * Created by sihuan on 2016/12/29.
 * com.charles.sihuan.zhihudaily.contract.presenter
 */

public class MainPresenter extends RxPresenter implements MainContract.Presenter {

    MainView mView;

    public MainPresenter(MainView mainView) {
        mView = mainView;
    }
}
