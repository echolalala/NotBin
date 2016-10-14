package com.example.echo.notbin.tools;

import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by js on 2016/10/14.
 */

public class HttpTools {

    public static Bitmap GetHttpBitmap(String url) {
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(url).build();
            Response response = client.newCall(request).execute();
            InputStream is = response.body().byteStream();
            Bitmap bm = BitmapFactory.decodeStream(is);
            return bm;
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
