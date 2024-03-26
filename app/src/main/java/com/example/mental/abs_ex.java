package com.example.mental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class abs_ex extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_ex);

        Button btn = (Button) findViewById(R.id.crunches_abss);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,crunches_abs.class));
            }
        });

        Button btn1 = (Button) findViewById(R.id.situps_abs);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,situps_abs.class));
            }
        });


        Button btn2 = (Button) findViewById(R.id.seated_jackknife_abs);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,seated_jackknife_abs.class));
            }
        });

        Button btn3 = (Button) findViewById(R.id.handing_l_raises);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,hanging_leg.class));
            }
        });

        Button btn4 = (Button) findViewById(R.id.dumbell_sidebend);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,dumbell_sidebend.class));
            }
        });


        Button btn5 = (Button) findViewById(R.id.coretwist_abs);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,coretwist_abs.class));
            }
        });

        Button btn6 = (Button) findViewById(R.id.toetouch_abs );
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,toetouch_abs.class));
            }
        });

        Button btn7 = (Button) findViewById(R.id.supeman_abs );
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,superman_abs.class));
            }
        });

        Button btn8 = (Button) findViewById(R.id.bentleg_vup );
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,bentlegvup_abs.class));
            }
        });

        Button btn9 = (Button) findViewById(R.id.incline_benchsitups);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,incline_benchsitups.class));
            }
        });


        Button btn10 = (Button) findViewById(R.id.rotat_textension );
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,rotatingtextension_abs.class));
            }
        });


        Button btn11 = (Button) findViewById(R.id.bodyweight_pullin);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,bodyweightpullin_abs.class));
            }
        });


        Button btn12 = (Button) findViewById(R.id.bodyweight_kick );
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(abs_ex.this,bodyweightkick_abs.class));
            }
        });


    }
}