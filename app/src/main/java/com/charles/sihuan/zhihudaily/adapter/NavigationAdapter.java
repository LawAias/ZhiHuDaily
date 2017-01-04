package com.charles.sihuan.zhihudaily.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.charles.sihuan.zhihudaily.R;
import com.charles.sihuan.zhihudaily.model.bean.ThemeRes;

import java.util.List;

/**
 * Created by sihuan on 2017/1/3.
 * com.charles.sihuan.zhihudaily.adapter
 */

public class NavigationAdapter extends BaseAdapter {


    private List<ThemeRes.Theme> themes;

    @Override
    public int getCount() {
        return themes == null ? 1 : themes.size() + 1;
    }

    @Override
    public Object getItem(int i) {
        return themes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public void setThemes(List<ThemeRes.Theme> themes) {
        this.themes = themes;
        notifyDataSetChanged();
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_navigation, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        switch (i) {
            case 0:
                viewHolder.logo.setVisibility(View.VISIBLE);
                viewHolder.logo.setImageResource(R.drawable.menu_home);
                viewHolder.title.setText("首页");
                viewHolder.title.setTextColor(Color.parseColor("#00A2ED"));
                break;
            default:
                ThemeRes.Theme theme = themes.get(i - 1);
                viewHolder.logo.setVisibility(View.GONE);
                viewHolder.title.setText(theme.getName());
                viewHolder.title.setTextColor(Color.parseColor("#000000"));
                break;
        }
        return view;
    }

    private class ViewHolder {
        ImageView logo;
        TextView title;

        ViewHolder(View v) {
            logo = (ImageView) v.findViewById(R.id.drawer_item_logo);
            title = (TextView) v.findViewById(R.id.drawer_item_title);
        }
    }


}
