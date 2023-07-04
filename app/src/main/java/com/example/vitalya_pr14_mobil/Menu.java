package com.example.vitalya_pr14_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    TextView btn_ypraj, btn_stat, btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn_ypraj = findViewById(R.id.btn_ypraj);
        btn_stat = findViewById(R.id.btn_stat);
        btn_exit = findViewById(R.id.btn_exit);

        btn_ypraj.setOnClickListener(this);
        btn_stat.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ypraj:
                startActivity(new Intent(this, Ypraj.class));
                break;
            case R.id.btn_stat:
                startActivity(new Intent(this, Stat.class));
                break;
            case R.id.btn_exit:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}