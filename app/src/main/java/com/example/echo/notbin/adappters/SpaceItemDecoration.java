package com.example.echo.notbin.adappters;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by js on 2016/10/12.
 */

public class SpaceItemDecoration extends RecyclerView.ItemDecoration{
    private int space;
    public  SpaceItemDecoration(int space){
        this.space=space;
    }


    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        if(parent.getChildAdapterPosition(view) != 0)
            outRect.top = space;

    }
}
