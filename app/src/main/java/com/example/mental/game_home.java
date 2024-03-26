package com.example.mental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class game_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_home);



         Button OPENLINK= findViewById(R.id.game1);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://dhimath.org/games/brainvita/brainvita.html");
            }
        });

        Button OPENLINK2= findViewById(R.id.game2);
        OPENLINK2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://poki.com/en/g/ultimate-sudoku");
            }
        });

        Button OPENLINK3= findViewById(R.id.game3);
        OPENLINK3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://wordlegame.org/");
            }
        });

        Button OPENLINK4= findViewById(R.id.game4);
        OPENLINK4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://wordlegame.org/");
            }
        });


        Button OPENLINK5= findViewById(R.id.game5);
        OPENLINK5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://poki.com/en/g/brain-test-tricky-puzzles");
            }
        });


        Button OPENLINK6= findViewById(R.id.game6);
        OPENLINK6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://poki.com/en/g/word-city-crossed");
            }
        });

    }

    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }

}