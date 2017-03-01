package com.charles.sihuan.zhihudaily.contract.presenter;

import com.charles.sihuan.zhihudaily.base.RxPresenter;
import com.charles.sihuan.zhihudaily.contract.MainContract;
import com.charles.sihuan.zhihudaily.model.bean.ThemeNews;
import com.charles.sihuan.zhihudaily.model.net.RetrofitHelper;
import com.charles.sihuan.zhihudaily.ui.view.MainView;
import com.charles.sihuan.zhihudaily.utils.RxUtils;
import com.elvishew.xlog.XLog;

import rx.Subscription;
import rx.functions.Action1;

/**
 * Created by sihuan on 2016/12/29.
 * com.charles.sihuan.zhihudaily.contract.presenter
 */

public class MainPresenter extends RxPresenter implements MainContract.Presenter {

    MainView mView;

    public MainPresenter(MainView mainView) {
        mView = mainView;
        mView.setPresenter(this);
    }


    public void getMainPageInfo() {
        Subscription subscription = RetrofitHelper.getZhiHuApis().getMainPage()
                .compose(RxUtils.<ThemeNews>rxSchedulerHelper())
                .subscribe(new Action1<ThemeNews>() {
                    @Override
                    public void call(ThemeNews themeNews) {
                        mView.setItemInfo(themeNews.getStories());

                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        XLog.e(throwable);
                    }
                });
        addSubscribe(subscription);
    }

    @Override
    public void getThemeInfo(int id) {
        Subscription subscription = RetrofitHelper.getZhiHuApis().getThemeNews(id)
                .compose(RxUtils.<ThemeNews>rxSchedulerHelper())
                .subscribe(new Action1<ThemeNews>() {
                    @Override
                    public void call(ThemeNews themeNews) {
                        mView.setItemInfo(themeNews.getStories());
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        XLog.e(throwable);
                    }
                });
        addSubscribe(subscription);

    }
}
