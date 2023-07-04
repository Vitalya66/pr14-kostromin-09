package com.example.baluev_pr14_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ypraj extends AppCompatActivity implements View.OnClickListener {

    ImageView btn_menu, btn_video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ypraj);
        btn_menu = findViewById(R.id.imageView3);
        btn_menu.setOnClickListener(this);
        btn_video = findViewById(R.id.imageView4);
        btn_video.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView3:
                startActivity(new Intent(this, Menu.class));
                break;
            case R.id.imageView4:
                startActivity(new Intent(this, Video.class));
                break;
        }
    }
}