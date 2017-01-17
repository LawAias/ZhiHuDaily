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

    @GET("news/latest")
    Observable<ThemeNews> getNews();

    @GET("theme/{themeId}")
    Observable<ThemeNews> getThemeNews(@Path("themeId") String id);

}
