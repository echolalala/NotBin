package com.example.echo.notbin.adappters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Echo on 2016/10/11.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.BlogViewHolder> {

    @Override
    public BlogViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(BlogViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class BlogViewHolder extends RecyclerView.ViewHolder{

        public BlogViewHolder(View itemView) {
            super(itemView);
        }
    }
}
