package com.example.mental;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class superman_abs extends AppCompatActivity {

    Button OPENLINK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superman_abs);

        Button btn = (Button)findViewById(R.id.info_superman);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(superman_abs.this,info_superman.class));
            }
        });


        //Youtube Link Added to button in crunches.
        OPENLINK= findViewById(R.id.superman_yt);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://youtu.be/J9zXkxUAfUA");
            }
        });


    }


    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}