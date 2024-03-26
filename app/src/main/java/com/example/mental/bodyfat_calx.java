package com.example.mental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bodyfat_calx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyfat_calx);


        Button bt1 = (Button)findViewById(R.id.male_bodyfat);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bodyfat_calx.this,male_bodyfat.class));
            }
        });

        Button bt2 = (Button)findViewById(R.id.female_bodyfat);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bodyfat_calx.this,female_bodyfat.class));
            }
        });
        Button btn3= (Button) findViewById(R.id.back_page4);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bodyfat_calx.this,MainActivity.class));
            }
        });

    }
}