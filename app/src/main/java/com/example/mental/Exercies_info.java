package com.example.mental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Exercies_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercies_info);




        Button btn= (Button) findViewById(R.id.abs_ex);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercies_info.this,abs_ex.class));
            }
        });


        Button btn1= (Button) findViewById(R.id.back_ex);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercies_info.this,back_ex.class));
            }
        });


        Button btn3= (Button) findViewById(R.id.biceps_ex);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercies_info.this,biceps_ex.class));
            }
        });


        Button btn4= (Button) findViewById(R.id.calf_ex);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercies_info.this,calf_ex.class));
            }
        });



        Button btn5= (Button) findViewById(R.id.chest_ex);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercies_info.this,chest_ex.class));
            }
        });



        Button btn6= (Button) findViewById(R.id.forarms_ex);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercies_info.this,forearms_ex.class));
            }
        });



        Button btn7= (Button) findViewById(R.id.legs_ex);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercies_info.this,legs_ex.class));
            }
        });



        Button btn8= (Button) findViewById(R.id.shoulders_ex);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercies_info.this,shoulders_ex.class));
            }
        });



        Button btn9= (Button) findViewById(R.id.triceps_ex);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercies_info.this,triceps_ex.class));
            }
        });

        Button btn10= (Button) findViewById(R.id.back_page);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Exercies_info.this,MainActivity.class));
            }
        });

    }
}