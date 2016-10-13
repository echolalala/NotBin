package com.example.echo.notbin.activity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.echo.notbin.R;
import com.example.echo.notbin.adappters.RecyclerViewAdapter;
import com.example.echo.notbin.adappters.SpaceItemDecoration;
import com.example.echo.notbin.models.BlogPost;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter rcAdapter;
    List<BlogPost> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.blog_rc);

        InitList();
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rcAdapter = new RecyclerViewAdapter(MainActivity.this, list);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(rcAdapter);
        //recyclerView.addItemDecoration(new SpaceItemDecoration(20));
    }


    public List<BlogPost> InitList() {
        list = new ArrayList<BlogPost>();


        for (int i = 0; i < 500; i++) {
            BlogPost model = new BlogPost();
            model.setContent("我是内容我是内容我是内容我是内容我是内容我是内容我是内容我是内容我是内容*" + i);
            model.setTittle("我是标题*" + i);
            list.add(model);
        }
        return list;
    }


}
