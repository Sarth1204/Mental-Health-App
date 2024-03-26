package com.example.mental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.mental.R;

public class physical extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical);

        getWindow().setStatusBarColor(ContextCompat.getColor(physical.this,R.color.black));



        Button btn = (Button) findViewById(R.id.bmi_calx);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(physical.this,bmi_calculator.class));

            }
        });

        Button btn1 = (Button) findViewById(R.id.calories_calx);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(physical.this,calories_calx.class));

            }
        });

        Button btn2 = (Button) findViewById(R.id.bodyfat_calx);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(physical.this,bodyfat_calx.class));

            }
        });


        Button btn3 = (Button) findViewById(R.id.bmr_calx);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(physical.this,bmr_calx.class));

            }
        });

        Button btn4 = (Button) findViewById(R.id.excercies_info);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(physical.this,Exercies_info.class));

            }
        });







    }
}