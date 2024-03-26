package com.example.mental;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class rotatingtextension_abs extends AppCompatActivity {

    Button OPENLINK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotatingtextension_abs);

        Button btn1 = (Button) findViewById(R.id.info_rotatextension);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rotatingtextension_abs.this,info_rotatingextension.class));
            }
        });

        OPENLINK= findViewById(R.id.rotatextension__yt);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://youtube.com/shorts/i_QzLf1_CNc?feature=share");
            }
        });
    }
    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}