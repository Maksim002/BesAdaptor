package com.example.besadaptor;

import android.os.Parcel;
import android.os.Parcelable;

public class Model  {

    private String title;

    public Model(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
