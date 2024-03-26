package com.example.mental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class calories_calx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories_calx);


        Button bt1 = (Button)findViewById(R.id.male_cc);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(calories_calx.this,male_calories.class));
            }
        });

        Button bt2 = (Button)findViewById(R.id.female_cc);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(calories_calx.this,female_calx.class));
            }
        });

        Button btn10= (Button) findViewById(R.id.back_page5);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(calories_calx.this,MainActivity.class));
            }
        });




    }



}