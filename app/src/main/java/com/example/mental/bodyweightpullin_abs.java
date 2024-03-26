package com.example.mental;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bodyweightpullin_abs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyweightpullin_abs);

        Button OPENLINK;


        Button btn = (Button)findViewById(R.id.info_pullin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bodyweightpullin_abs.this,info_bodyweightpullin.class));
            }
        });


        //Youtube Link Added to button in crunches.
        OPENLINK= findViewById(R.id.pullin_yt);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://youtu.be/zZahk7A6k_M");
            }
        });
    }

    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}