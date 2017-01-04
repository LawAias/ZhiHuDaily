package com.charles.sihuan.zhihudaily.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.charles.sihuan.zhihudaily.R;
import com.charles.sihuan.zhihudaily.adapter.NavigationAdapter;
import com.charles.sihuan.zhihudaily.base.RootView;
import com.charles.sihuan.zhihudaily.contract.NavigationContract;
import com.charles.sihuan.zhihudaily.model.bean.ThemeRes;

import butterknife.BindView;

/**
 * Created by sihuan on 2017/1/3.
 * com.charles.sihuan.zhihudaily.ui.view
 */

public class NavigationView extends RootView<NavigationContract.Presenter> implements NavigationContract.View {

    @BindView(R.id.list_view)
    ListView listView;


    public NavigationView(Context context) {
        super(context);
    }

    public NavigationView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NavigationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void getLayout() {
        inflate(mContext, R.layout.fragment_navigation_view, this);
    }

    NavigationAdapter adapter;

    @Override
    protected void initView() {
        adapter = new NavigationAdapter();
        listView.setAdapter(adapter);
    }

    @Override
    protected void initEvent() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }

    @Override
    public void setPresenter(NavigationContract.Presenter presenter) {
        if (presenter != null) {
            mPresenter = presenter;
            mPresenter.getThemeList();
        }
    }


    @Override
    public void setThemesInfo(ThemeRes themeRes) {
        adapter.setThemes(themeRes.getOthers());

    }
}
