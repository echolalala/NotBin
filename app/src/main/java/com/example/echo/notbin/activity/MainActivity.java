package com.example.echo.notbin.activity;

import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;

import com.example.echo.notbin.R;
import com.example.echo.notbin.adappters.RecyclerViewAdapter;
import com.example.echo.notbin.listener.HidingScrollListener;
import com.example.echo.notbin.models.BlogPost;
import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter rcAdapter;
    List<BlogPost> list;
    DrawerLayout drawerLayout;
    Toolbar mToolbar;
    ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
        Fresco.initialize(this);
        recyclerView = (RecyclerView) findViewById(R.id.blog_rc);
        initDrawerLayout();
        //new DrawerBuilder().withActivity(this).build();


        InitList();

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rcAdapter = new RecyclerViewAdapter(MainActivity.this, list);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(rcAdapter);

        //setOnScrollListener已过时   用addOnScrollListener替代
        recyclerView.addOnScrollListener(new HidingScrollListener() {
            @Override
            public void onHide() {
                hideViews();
            }
            @Override
            public void onShow() {
                showViews();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //测试git1234
    }

    private void hideViews() {
        mToolbar.animate().translationY(-mToolbar.getHeight()).setInterpolator(new AccelerateInterpolator(2));
        //FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) mFabButton.getLayoutParams();
        //int fabBottomMargin = lp.bottomMargin;
        //mFabButton.animate().translationY(mFabButton.getHeight()+fabBottomMargin).setInterpolator(new AccelerateInterpolator(2)).start();
    }

    private void showViews() {
        mToolbar.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2));
        //mFabButton.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2)).start();
    }

    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        setTitle(getString(R.string.app_name));
        //mToolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
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
    }
}
