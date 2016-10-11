package com.example.echo.notbin.models;

import java.util.Date;

/**
 * Created by Echo on 2016/10/11.
 */

public class BlogPost {

    private String Img;
    private String Tittle;
    private String Content;
    private Date CTime;


    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }


    public Date getCTime() {
        return CTime;
    }

    public void setCTime(Date CTime) {
        this.CTime = CTime;
    }


}
