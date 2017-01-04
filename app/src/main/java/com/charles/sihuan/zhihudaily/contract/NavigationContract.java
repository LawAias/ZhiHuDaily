package com.charles.sihuan.zhihudaily.contract;

import com.charles.sihuan.zhihudaily.base.BasePresenter;
import com.charles.sihuan.zhihudaily.base.BaseView;
import com.charles.sihuan.zhihudaily.model.bean.ThemeRes;

/**
 * Created by sihuan on 2017/1/3.
 * com.charles.sihuan.zhihudaily.contract
 */

public interface NavigationContract {

    interface View extends BaseView<Presenter> {
        void setThemesInfo(ThemeRes themeRes);

    }

    interface Presenter extends BasePresenter {
        void getThemeList();
    }
}
