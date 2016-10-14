package com.example.echo.notbin.tools;

/**
 * Created by js on 2016/10/14.
 */

import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
