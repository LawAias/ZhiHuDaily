package com.charles.sihuan.zhihudaily.fragment;

import android.view.LayoutInflater;

import com.charles.sihuan.zhihudaily.R;
import com.charles.sihuan.zhihudaily.base.BaseFragment;
import com.charles.sihuan.zhihudaily.contract.presenter.HomePresenter;
import com.charles.sihuan.zhihudaily.ui.view.HomeView;

import butterknife.BindView;

/**
 * Created by sihuan on 2017/1/5.
 * com.charles.sihuan.zhihudaily.fragment
 */

public class HomeFragment extends BaseFragment {

    @BindView(R.id.home_view)
    HomeView mView;

    @Override
    protected int getLayout() {
        return R.layout.fragment_home;
    }


    @Override
    protected void initView(LayoutInflater inflater) {
        mPresenter = new HomePresenter(mView);
    }

    @Override
    protected void initEvent() {

    }
}
