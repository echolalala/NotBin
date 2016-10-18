package com.example.echo.notbin.activity;

import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.echo.notbin.R;
import com.example.echo.notbin.adappters.RecyclerViewAdapter;
import com.example.echo.notbin.models.BlogPost;
import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter rcAdapter;
    List<BlogPost> list;
    DrawerLayout drawerLayout;
    //ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fresco.initialize(this);
        recyclerView = (RecyclerView) findViewById(R.id.blog_rc);
        initDrawerLayout();
        //new DrawerBuilder().withActivity(this).build();

        InitList();
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rcAdapter = new RecyclerViewAdapter(MainActivity.this, list);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(rcAdapter);




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


    private void initDrawerLayout(){
        drawerLayout=(DrawerLayout)super.findViewById(R.id.drawer_layout);
        drawerLayout.setScrimColor(Color.TRANSPARENT);
//        toggle=new ActionBarDrawerToggle(this,drawerLayout,
//                R.drawable.back_move_details_normal,R.string.drawer_open
//                ,R.string.drawer_close){
//            public void onDrawerClosed(View drawerView) {
//                super.onDrawerClosed(drawerView);
//            }
//            public void onDrawerOpened(View drawerView) {
//                super.onDrawerOpened(drawerView);
//            }
//        };
        //drawerLayout.setDrawerListener(toggle);
    }
}
