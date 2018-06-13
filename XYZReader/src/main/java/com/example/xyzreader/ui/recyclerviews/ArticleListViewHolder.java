package com.example.xyzreader.ui.recyclerviews;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.xyzreader.R;
import com.example.xyzreader.ui.DynamicHeightNetworkImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArticleListViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.thumbnail)
    public DynamicHeightNetworkImageView thumbnailView;
    @BindView(R.id.article_title)
    public TextView titleView;
    @BindView(R.id.article_subtitle)
    public TextView subtitleView;

    public ArticleListViewHolder(View v) {
        super(v);
        ButterKnife.bind(this, v);
    }
}