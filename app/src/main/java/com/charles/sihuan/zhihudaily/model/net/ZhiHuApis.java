package com.charles.sihuan.zhihudaily.model.net;

import com.charles.sihuan.zhihudaily.model.bean.ThemeNews;
import com.charles.sihuan.zhihudaily.model.bean.ThemeRes;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by sihuan on 2017/1/2.
 * ${PACKAGE_NAME}
 */

public interface ZhiHuApis {
    String Version = "4/";
    String Host = "http://news-at.zhihu.com/api/" + Version;

    /**
     * 主题日报列表
     *
     * @return
     */
    @GET("themes")
    Observable<ThemeRes> getThemeList();

    //    http://news-at.zhihu.com/api/4/theme/11
    @GET("theme/{themeId}")
    Observable<ThemeNews> getThemeNews(@Path("themeId") int id);

    @GET("news/latest")
    Observable<ThemeNews> getMainPage();



}
