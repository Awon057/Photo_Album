package com.example.user.retrofitdemo.activity;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user.retrofitdemo.util.ApiInterface;
import com.example.user.retrofitdemo.data.DatabaseHelper;
import com.example.user.retrofitdemo.adapter.GallaryAdapter;
import com.example.user.retrofitdemo.R;
import com.example.user.retrofitdemo.model.photo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;

public class PhotoGallery extends AppCompatActivity {


    private Retrofit mRetrofit;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private GallaryAdapter adapter;
    private List<photo> photos;
    private ApiInterface apiInterface;
    private DatabaseHelper myHelper;
    private SQLiteDatabase sqliteDB;
    private ArrayList<String> photoData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_gallery);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new GallaryAdapter(this);
        recyclerView.setAdapter(adapter);


        photoData = getIntent().getStringArrayListExtra("DataArray");
        final int value = getIntent().getIntExtra("ID",0);
        //Log.d("DataId", String.valueOf(value));

        adapter.setLinks(photoData);

    }

}