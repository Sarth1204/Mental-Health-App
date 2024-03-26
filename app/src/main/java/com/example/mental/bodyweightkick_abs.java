package com.example.mental;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class
bodyweightkick_abs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyweightkick_abs);


        Button OPENLINK;


        Button btn = (Button)findViewById(R.id.info_kick);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bodyweightkick_abs.this,info_bodyweightscissorkick.class));
            }
        });


        //Youtube Link Added to button in crunches.
        OPENLINK= findViewById(R.id.kick_yt);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://youtu.be/WoNCIBVLbgY");
            }
        });
    }

    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}