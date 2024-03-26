package com.example.mental;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class mydaily_home extends AppCompatActivity {

    private Button play, pause, play2, pause2;

    MediaPlayer mediaPlayer, mp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mydaily_home);

        mediaPlayer  = MediaPlayer.create(getApplicationContext(),R.raw.music_fordaily);
        play = (Button) findViewById(R.id.playmusic);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast.makeText(mydaily_home.this, "Music Finished", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        //For second music file
        mp2 = MediaPlayer.create(getApplicationContext(), R.raw.music_second);
        play2 = (Button) findViewById(R.id.playmusic2);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
                mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast.makeText(mydaily_home.this, "Music Finished", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        pause = (Button) findViewById(R.id.stop_music);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
                mp2.pause();

            }
        });

        pause2 = (Button) findViewById(R.id.stop_music2);
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.pause();

            }
        });

    }
}