package com.example.ieee;
public class ScreenItem {
    String MainTittle ,Title,Description;
    int ScreenImg ;
     int Layout ;


    public ScreenItem(  String title, String mainTittle, String description, int screenImg ) {
        MainTittle =mainTittle ;
        Title = title;
        Description = description;
        ScreenImg = screenImg;

    }



    public ScreenItem( String title , int screenImg ,int layout ) {
        Title = title;
        ScreenImg = screenImg;
        Layout =layout;
    }



    public void setTitle(String title) {
        Title = title;
    }


    public void setMainTittleTitle(String mainTittle) {

        MainTittle = mainTittle;
    }



    public void setDescription(String description) {

        Description = description;
    }



    public void setScreenImg(int screenImg) {

        ScreenImg = screenImg;
    }



    public String getTitle() {

        return Title;
    }



    public String getDescription() {

        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }



    public String getMainTittleTitle() {

        return MainTittle;

    }



}