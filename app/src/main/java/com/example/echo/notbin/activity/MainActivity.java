package com.example.echo.notbin.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.echo.notbin.R;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context=getBaseContext();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.blog_rc);

        LinearLayoutManager llm=new LinearLayoutManager(context);
        recyclerView.setLayoutManager(llm);


        //1111112345555555566667777
    }
}
