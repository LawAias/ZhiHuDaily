package com.charles.sihuan.zhihudaily.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.charles.sihuan.zhihudaily.R;
import com.charles.sihuan.zhihudaily.model.bean.ThemeNews;

import java.util.List;

/**
 * Created by sihuan on 2017/1/5.
 * com.charles.sihuan.zhihudaily.adapter
 */

public class HomeAdapter extends BaseQuickAdapter<ThemeNews.Story, BaseViewHolder> {

    private List<ThemeNews.Story> mStoriesList;
    private Context context;

    public HomeAdapter() {
        super(R.layout.item_reclerview);
    }

    @Override
    protected void convert(BaseViewHolder helper, ThemeNews.Story item) {
        helper.setText(R.id.item_title, item.getTitle());
        if (item.getImages() == null) {
            helper.setVisible(R.id.item_icon, false);
        } else {
            helper.setVisible(R.id.item_icon, true);
            Glide.with(mContext)
                    .load(item.getImages().get(0))
                    .crossFade()
                    .into((ImageView) helper.getView(R.id.item_icon));
        }
    }

}
