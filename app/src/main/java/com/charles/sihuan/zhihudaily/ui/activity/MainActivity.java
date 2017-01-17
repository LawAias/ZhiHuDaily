package com.charles.sihuan.zhihudaily.ui.activity;

import android.os.Bundle;

import com.charles.sihuan.zhihudaily.R;
import com.charles.sihuan.zhihudaily.base.BaseActivty;
import com.charles.sihuan.zhihudaily.contract.presenter.MainPresenter;
import com.charles.sihuan.zhihudaily.model.bean.ThemeRes;
import com.charles.sihuan.zhihudaily.ui.view.MainView;
import com.charles.sihuan.zhihudaily.ui.view.NavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivty implements NavigationView.OnNavigationListener {

    @BindView(R.id.main_view)
    MainView mainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        mPresenter = new MainPresenter(mainView);
    }

    @Override
    public void changeInfo(ThemeRes.Theme theme) {
        mainView.setTitle(theme.getName());
        mainView.closeNavigation();
    }
}
