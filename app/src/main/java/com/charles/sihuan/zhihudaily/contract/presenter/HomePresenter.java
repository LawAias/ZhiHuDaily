package com.charles.sihuan.zhihudaily.contract.presenter;

import com.charles.sihuan.zhihudaily.base.RxPresenter;
import com.charles.sihuan.zhihudaily.contract.HomeContract;
import com.charles.sihuan.zhihudaily.ui.view.HomeView;

/**
 * Created by sihuan on 2017/1/5.
 * com.charles.sihuan.zhihudaily.contract.presenter
 */

public class HomePresenter extends RxPresenter implements HomeContract.Presenter {

    HomeView mView;

    public HomePresenter(HomeView view) {
        mView = view;
        mView.setPresenter(this);
    }
}
