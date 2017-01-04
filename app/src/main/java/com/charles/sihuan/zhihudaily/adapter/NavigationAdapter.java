package com.charles.sihuan.zhihudaily.adapter;

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

    List<ThemeRes.Theme> themes;

    @Override
    public int getCount() {
        return themes == null ? 0 : themes.size();
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
        ThemeRes.Theme theme = themes.get(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_navigation, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.title.setText(theme.getName());
        return view;
    }

    private class ViewHolder {
        ImageView logo;
        TextView title;

        public ViewHolder(View v) {
            logo = (ImageView) v.findViewById(R.id.drawer_item_logo);
            title = (TextView) v.findViewById(R.id.drawer_item_title);
        }
    }


}
