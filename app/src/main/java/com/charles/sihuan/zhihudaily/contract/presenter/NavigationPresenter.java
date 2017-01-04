package com.charles.sihuan.zhihudaily.contract.presenter;

import com.charles.sihuan.zhihudaily.base.RxPresenter;
import com.charles.sihuan.zhihudaily.contract.NavigationContract;
import com.charles.sihuan.zhihudaily.model.bean.ThemeRes;
import com.charles.sihuan.zhihudaily.model.net.RetrofitHelper;
import com.charles.sihuan.zhihudaily.ui.view.NavigationView;
import com.charles.sihuan.zhihudaily.utils.RxUtils;
import com.elvishew.xlog.XLog;

import rx.Subscription;
import rx.functions.Action1;

/**
 * Created by sihuan on 2017/1/3.
 * com.charles.sihuan.zhihudaily.contract.presenter
 */

public class NavigationPresenter extends RxPresenter implements NavigationContract.Presenter {

    NavigationView mView;

    public NavigationPresenter(NavigationView mView) {
        this.mView = mView;
        mView.setPresenter(this);
    }

    @Override
    public void getThemeList() {
        Subscription subscription = RetrofitHelper.getZhiHuApis().getThemeList()
                .compose(RxUtils.<ThemeRes>rxSchedulerHelper())
                .subscribe(new Action1<ThemeRes>() {
                    @Override
                    public void call(ThemeRes themeRes) {
                        mView.setThemesInfo(themeRes);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                    }
                });
        addSubscribe(subscription);
    }
}
