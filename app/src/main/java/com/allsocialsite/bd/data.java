package com.allsocialsite.bd;

public class data {
    public int imageId;
    public String txt;

    data( int imageId, String text) {

        this.imageId = imageId;
        this.txt=text;
    }



    public String getTxt() {

        return txt;
    }

    public int getImageId() {

        return imageId;
    }






}

