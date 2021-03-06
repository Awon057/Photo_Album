package com.example.user.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 8/2/2017.
 */

public class photo {
    @SerializedName("albumName")
    private String albumName;
    @SerializedName("userName")
    private String userName;
    @SerializedName("images")
    private ArrayList<String> images;

    public photo(String name, String user) {
        this.albumName=name;
        this.userName=user;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getUserName() {
        return userName;
    }
}
