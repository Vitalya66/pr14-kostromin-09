package com.example.vitalya_pr14_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Stat extends AppCompatActivity implements View.OnClickListener {
    ImageView menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat);
        menu = findViewById(R.id.imageView14);
        menu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView14:
                startActivity(new Intent(this, Menu.class));
                break;
        }
    }
}