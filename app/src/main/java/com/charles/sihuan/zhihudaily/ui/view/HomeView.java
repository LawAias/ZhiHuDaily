package com.charles.sihuan.zhihudaily.ui.view;

import android.content.Context;
import android.util.AttributeSet;

import com.charles.sihuan.zhihudaily.R;
import com.charles.sihuan.zhihudaily.base.RootView;
import com.charles.sihuan.zhihudaily.contract.HomeContract;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import butterknife.BindView;

/**
 * Created by sihuan on 2017/1/5.
 * com.charles.sihuan.zhihudaily.ui.view
 */

public class HomeView extends RootView<HomeContract.Presenter> implements HomeContract.View {

    @BindView(R.id.recyclerView)
    XRecyclerView recyclerView;

    public HomeView(Context context) {
        super(context);
    }

    public HomeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HomeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        if (presenter != null) {
            mPresenter = presenter;
        }
    }

    @Override
    protected void getLayout() {
        inflate(mContext, R.layout.home_view, this);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initEvent() {

    }
}
