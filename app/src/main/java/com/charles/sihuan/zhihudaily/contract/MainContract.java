package com.charles.sihuan.zhihudaily.contract;

import com.charles.sihuan.zhihudaily.base.BasePresenter;
import com.charles.sihuan.zhihudaily.base.BaseView;

/**
 * Created by sihuan on 2016/12/29.
 * com.charles.sihuan.zhihudaily.contract
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
    }
}
