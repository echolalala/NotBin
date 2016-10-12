package com.example.echo.notbin.adappters;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.echo.notbin.R;
import com.example.echo.notbin.models.BlogPost;

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
        this.inflater= LayoutInflater.from(context);

    }

    @Override
    public BlogViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.blog_item,parent,false);
        BlogViewHolder holder=new BlogViewHolder(view);
        return  holder;
    }


    @Override
    public void onBindViewHolder(BlogViewHolder holder, int position) {
        holder.tittleTV.setText(list.get(position).getTittle());
        holder.contentTv.setText(list.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //自定义ViewHolder
    static class BlogViewHolder extends RecyclerView.ViewHolder {

        TextView tittleTV;
        TextView contentTv;
        ImageView im;

        public  BlogViewHolder(View view){
            super(view);
            tittleTV=(TextView) view.findViewById(R.id.blog_tittle);
            contentTv=(TextView) view.findViewById(R.id.blog_content);
            im=(ImageView) view.findViewById(R.id.im_blogImg);
        }
    }


}
