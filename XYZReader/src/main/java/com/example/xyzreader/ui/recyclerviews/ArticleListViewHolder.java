package com.example.xyzreader.ui.recyclerviews;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xyzreader.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArticleListViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.thumbnail)
    public ImageView thumbnailView;
    @BindView(R.id.article_title)
    public TextView titleView;
    @BindView(R.id.article_subtitle)
    public TextView subtitleView;

    ArticleListViewHolder(View v) {
        super(v);
        ButterKnife.bind(this, v);
    }
}