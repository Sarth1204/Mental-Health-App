package com.example.mental;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class obesity_info extends AppCompatActivity {
    Button OPENLINK, btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesity_info);


        btn1 = (Button)findViewById(R.id.crunches_bmi);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(obesity_info.this,crunches_abs.class));


            }
        });

        btn2 = (Button)findViewById(R.id.situps_bmi) ;
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(obesity_info.this,situps_abs.class));
            }
        });

        btn3 = (Button)findViewById(R.id.bodyweightpullin_bmi) ;
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(obesity_info.this,bodyweightpullin_abs.class));
            }
        });


        btn4 = (Button)findViewById(R.id.coretwist_bmi) ;
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(obesity_info.this,coretwist_abs.class));
            }
        });


        btn5 = (Button)findViewById(R.id.toetouchh_bmi) ;
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(obesity_info.this,toetouch_abs.class));
            }
        });




        //Youtube Link Added to button in crunches.
        OPENLINK= findViewById(R.id.moreinfo_obesity);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://youtu.be/N_86KHVuZEQ");
            }
        });
    }
    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}