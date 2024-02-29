package com.androidjavaproject;

public class Item {
    private String mName;
    private int mImage;

    public Item(String mName, int mImage) {
        this.mName = mName;
        this.mImage = mImage;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int mImage) {
        this.mImage = mImage;
    }
}