package com.charles.sihuan.zhihudaily.ui.view;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;

import com.charles.sihuan.zhihudaily.R;
import com.charles.sihuan.zhihudaily.base.RootView;
import com.charles.sihuan.zhihudaily.contract.MainContract;
import com.charles.sihuan.zhihudaily.ui.activity.MainActivity;

import butterknife.BindView;

/**
 * Created by sihuan on 2016/12/29.
 * com.charles.sihuan.zhihudaily.ui.view
 */

public class MainView extends RootView<MainContract.Presenter> implements MainContract.View {

    @BindView(R.id.toolbar_actionbar)
    Toolbar toolbar;

    @BindView(R.id.main_layout)
    DrawerLayout mDrawerLayout;

    private ActionBarDrawerToggle mDrawerToggle;

    MainActivity mActivity;

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
        mActivity = (MainActivity) getContext();
        toolbar.setTitle(R.string.main_page);
        mActivity.setSupportActionBar(toolbar);
        mActivity.getSupportActionBar().setHomeButtonEnabled(true);
        mActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mDrawerToggle = new ActionBarDrawerToggle(mActivity, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        mDrawerToggle.syncState();
        mDrawerLayout.setDrawerListener(mDrawerToggle);

    }

    @Override
    protected void initEvent() {

    }


    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }
}
