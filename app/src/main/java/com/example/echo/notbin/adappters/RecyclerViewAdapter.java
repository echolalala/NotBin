package com.example.echo.notbin.adappters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.echo.notbin.R;
import com.example.echo.notbin.models.BlogPost;
import com.example.echo.notbin.tools.HttpTools;
import com.facebook.drawee.view.SimpleDraweeView;

import java.io.Console;
import java.net.URL;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Echo on 2016/10/11.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.BlogViewHolder> {
    private Context context;
    private List<BlogPost> list;
    private LayoutInflater inflater;

    public RecyclerViewAdapter(Context _context, List<BlogPost> _list) {
        this.context = _context;
        this.list = _list;
        this.inflater = LayoutInflater.from(context);

    }

    @Override
    public BlogViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.blog_item, parent, false);
        BlogViewHolder holder = new BlogViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(BlogViewHolder holder, int position) {
        Bitmap img=null;
        holder.tittleTV.setText(list.get(position).getTittle());
        holder.tittleTV.setBackgroundColor(Color.argb(100, 144, 144, 144));
        //holder.tittleTV.setBackgroundColor(new Color().alpha(20));
        holder.contentTv.setText(list.get(position).getContent());

        holder.im.setImageURI("http://images.csdn.net/20130609/zhuanti.jpg");

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //自定义ViewHolder
    static class BlogViewHolder extends RecyclerView.ViewHolder {

        TextView tittleTV;
        TextView contentTv;
        SimpleDraweeView im;

        public BlogViewHolder(View view) {
            super(view);
            tittleTV = (TextView) view.findViewById(R.id.blog_tittle);
            contentTv = (TextView) view.findViewById(R.id.blog_content);
            im = (SimpleDraweeView) view.findViewById(R.id.im_blogImg);
        }
    }


}
