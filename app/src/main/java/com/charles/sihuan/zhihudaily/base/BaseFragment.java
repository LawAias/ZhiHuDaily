package com.charles.sihuan.zhihudaily.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by sihuan on 2016/12/19.
 * com.charles.sihuan.zhihudaily.base
 */

public abstract class BaseFragment<T extends BasePresenter> extends Fragment {

    protected Unbinder unbinder;
    protected T mPresenter;
    protected Context mContext;
    protected View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(getLayout(), container, false);
        }
        ViewGroup parent = (ViewGroup) rootView.getParent();
        if (parent != null) {
            parent.removeView(rootView);
        }
        unbinder = ButterKnife.bind(this, rootView);
        initView(inflater);
        return rootView;
    }
    protected abstract int getLayout();


    protected void initView(LayoutInflater inflater) {
    }

    protected void initEvent() {
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (unbinder != null)
            unbinder.unbind();
    }
}
