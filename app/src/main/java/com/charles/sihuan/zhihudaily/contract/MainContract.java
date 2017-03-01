package com.charles.sihuan.zhihudaily.contract;

import com.charles.sihuan.zhihudaily.base.BasePresenter;
import com.charles.sihuan.zhihudaily.base.BaseView;
import com.charles.sihuan.zhihudaily.model.bean.ThemeNews;
import com.charles.sihuan.zhihudaily.model.bean.ThemeRes;

import java.util.List;

/**
 * Created by sihuan on 2016/12/29.
 * com.charles.sihuan.zhihudaily.contract
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {

        void changeTheme(ThemeRes.Theme theme);

        void changeMain();

        void setItemInfo(List<ThemeNews.Story> sList);

    }

    interface Presenter extends BasePresenter {
        void getMainPageInfo();

        void getThemeInfo(int id);
    }
}
