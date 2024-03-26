package com.example.mental;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bentlegvup_abs extends AppCompatActivity {
    Button OPENLINK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bentlegvup_abs);

        Button btn = (Button)findViewById(R.id.info_bentleg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bentlegvup_abs.this,info_bentllegvup.class));
            }
        });


        //Youtube Link Added to button in crunches.
        OPENLINK= findViewById(R.id.bentleg_yt);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://youtu.be/5YxbLOTcgbY");
            }
        });
    }

    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}