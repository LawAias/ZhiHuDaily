package com.charles.sihuan.zhihudaily.ui.view;

import android.content.Context;
import android.util.AttributeSet;

import com.charles.sihuan.zhihudaily.R;
import com.charles.sihuan.zhihudaily.base.RootView;
import com.charles.sihuan.zhihudaily.contract.MainContract;

/**
 * Created by sihuan on 2016/12/29.
 * com.charles.sihuan.zhihudaily.ui.view
 */

public class MainView extends RootView<MainContract.Presenter> implements MainContract.View {
    public MainView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MainView(Context context) {
        super(context);
    }

    public MainView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void getLayout() {
        inflate(mContext, R.layout.main_view, this);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initEvent() {

    }


    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }
}
