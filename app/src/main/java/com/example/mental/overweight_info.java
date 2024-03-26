package com.example.mental;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class overweight_info extends AppCompatActivity {

    Button OPENLINK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overweight_info);

        Button btn1 = (Button)findViewById(R.id.legraises_bmi);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(overweight_info.this,hanging_leg.class));
            }
        });

        Button btn11 = (Button)findViewById(R.id.dumbell_bmi);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(overweight_info.this,dumbell_sidebend.class));
            }
        });

        Button btn1112 = (Button)findViewById(R.id.superman_bmi);
        btn1112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(overweight_info.this,superman_abs.class));
            }
        });

        Button btn111 = (Button)findViewById(R.id.crunches_bmii);
        btn111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(overweight_info.this,crunches_abs.class));
            }
        });

        Button btn1111 = (Button)findViewById(R.id.legvup_bmi);
        btn1111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(overweight_info.this,bentlegvup_abs.class));
            }
        });

        OPENLINK= findViewById(R.id.moreinfo_overweight);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://youtu.be/WUswdSlGj_s");
            }
        });
    }
    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}