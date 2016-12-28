package com.charles.sihuan.zhihudaily.base;

import android.app.Activity;
import android.app.Application;

import com.elvishew.xlog.LogLevel;
import com.elvishew.xlog.XLog;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sihuan on 2016/12/28.
 * PACKAGE_NAME
 */

public class App extends Application {

    private Set<Activity> activities;
    private static App instance;

    public static synchronized App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        XLog.init(LogLevel.DEBUG);
    }


    public void registerActivity(Activity activity) {
        if (activities == null) {
            activities = new HashSet<Activity>();
        }
        activities.add(activity);
    }


    public void unregisterActivity(Activity activity) {
        if (activities != null) {
            activities.remove(activity);
        }
    }

    public void exitApp() {
        if (activities != null) {
            for (Activity act : activities) {
                if (act != null && !act.isFinishing()) {
                    act.finish();
                }
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}
