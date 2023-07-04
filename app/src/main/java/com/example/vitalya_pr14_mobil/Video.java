package com.example.vitalya_pr14_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Video extends AppCompatActivity implements View.OnClickListener {
    ImageView stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        stop = findViewById(R.id.imageView12);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView12:
                startActivity(new Intent(this, Ypraj.class));
                break;
        }
    }
}