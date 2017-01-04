package com.charles.sihuan.zhihudaily.fragment;

import android.view.LayoutInflater;

import com.charles.sihuan.zhihudaily.R;
import com.charles.sihuan.zhihudaily.base.BaseFragment;
import com.charles.sihuan.zhihudaily.contract.presenter.NavigationPresenter;
import com.charles.sihuan.zhihudaily.ui.view.NavigationView;

import butterknife.BindView;

/**
 * Created by sihuan on 2016/12/19.
 * com.charles.sihuan.zhihudaily.fragment
 */

public class NavigationFragment extends BaseFragment {

    @BindView(R.id.navigation_view)
    NavigationView navigationView;

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initView(LayoutInflater inflater) {
        mPresenter = new NavigationPresenter(navigationView);
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_navigation;
    }
}
