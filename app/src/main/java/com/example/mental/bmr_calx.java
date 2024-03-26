package com.example.mental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bmr_calx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr_calx);

        Button bt1 = (Button)findViewById(R.id.male_bmr);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bmr_calx.this,male_bmr.class));
            }
        });

        Button bt2 = (Button)findViewById(R.id.female_bmr);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bmr_calx.this,female_bmr.class));
            }
        });

        Button btn3= (Button) findViewById(R.id.back_page3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bmr_calx.this,MainActivity.class));
            }
        });

    }
}