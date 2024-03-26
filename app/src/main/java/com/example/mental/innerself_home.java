package com.example.mental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class innerself_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_innerself_home);

        TextView OPENLINK= findViewById(R.id.art1);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://almanac.io/docs/beating-burnout-a-guide-for-supporting-mental-health-at-work-yDLKVF3uJtMdshcZG37HP7OHpAczogYX\n");
            }
        });

        TextView OPENLINK2= findViewById(R.id.art2);
        OPENLINK2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://thenextweb.com/news/are-developers-depressed#gref");
            }
        });

        TextView OPENLINK3= findViewById(R.id.art3);
        OPENLINK3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://joebell.co.uk/blog/do-not-disturb/l");
            }
        });

        TextView OPENLINK4= findViewById(R.id.art4);
        OPENLINK4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://medium.com/learn-love-code/developers-how-to-overcome-imposter-syndrome-48edee803cf4");
            }
        });

        TextView OPENLINK5= findViewById(R.id.art5);
        OPENLINK5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://weworkremotely.com/how-to-keep-your-mental-health-in-check-when-you-work-from-home");
            }
        });
    }

    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}