package com.charles.sihuan.zhihudaily.ui.view;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.Holder;
import com.charles.sihuan.zhihudaily.R;
import com.charles.sihuan.zhihudaily.adapter.HomeAdapter;
import com.charles.sihuan.zhihudaily.base.RootView;
import com.charles.sihuan.zhihudaily.contract.MainContract;
import com.charles.sihuan.zhihudaily.model.bean.ThemeNews;
import com.charles.sihuan.zhihudaily.model.bean.ThemeRes;
import com.charles.sihuan.zhihudaily.ui.activity.MainActivity;

import java.util.List;

import butterknife.BindView;

/**
 * Created by sihuan on 2016/12/29.
 * com.charles.sihuan.zhihudaily.ui.view
 */

public class MainView extends RootView<MainContract.Presenter> implements MainContract.View, SwipeRefreshLayout.OnRefreshListener {

    ThemeRes.Theme mTheme;

    @BindView(R.id.toolbar_actionbar)
    Toolbar toolbar;

    @BindView(R.id.swipe_ly)
    SwipeRefreshLayout refreshLayout;

    @BindView(R.id.main_layout)
    DrawerLayout mDrawerLayout;

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;


    ActionBarDrawerToggle mDrawerToggle;

    MainActivity mActivity;

    HomeAdapter mAdapter;

    ConvenientBanner banner;


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
        banner = (ConvenientBanner) inflate(mContext, R.layout.item_banner_view, null);
        toolbar.setTitle(R.string.main_page);
        mActivity.setSupportActionBar(toolbar);
        mActivity.getSupportActionBar().setHomeButtonEnabled(true);
        mActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mDrawerToggle = new ActionBarDrawerToggle(mActivity, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        mDrawerToggle.syncState();
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        LinearLayoutManager layoutManager = new LinearLayoutManager(mActivity);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter = new HomeAdapter());

    }

    @Override
    protected void initEvent() {
        refreshLayout.setOnRefreshListener(this);
    }


    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        if (presenter != null) {
            mPresenter = presenter;
            mPresenter.getMainPageInfo();
        }
    }


    @Override
    public void changeTheme(ThemeRes.Theme theme) {
        mTheme = theme;
        toolbar.setTitle(theme.getName());
        mPresenter.getThemeInfo(theme.getId());
        mDrawerLayout.closeDrawers();
    }

    @Override
    public void changeMain() {
        mTheme = null;
        toolbar.setTitle("首页");
        mPresenter.getMainPageInfo();
        mDrawerLayout.closeDrawers();
    }


    @Override
    public void setItemInfo(List<ThemeNews.Story> sList) {
        refreshLayout.setRefreshing(false);
        mAdapter.setNewData(sList);
    }

    @Override
    public void onRefresh() {
        if (mTheme == null) {
            mPresenter.getMainPageInfo();
        } else {
            mPresenter.getThemeInfo(mTheme.getId());
        }
    }


    public class BannerViewHolder implements Holder {
        private ImageView imageView;
        private TextView textView;


        @Override
        public View createView(Context context) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_banner, null);
            imageView = (ImageView) view.findViewById(R.id.banner_icon);
            textView = (TextView) view.findViewById(R.id.banner_title);
            return view;
        }

        @Override
        public void UpdateUI(Context context, int position, Object data) {

        }
    }
}
