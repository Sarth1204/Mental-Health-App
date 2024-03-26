package com.example.mental;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.Locale;

public class relax extends AppCompatActivity {

    Button button;

    VideoView videoView;

    private Button Start,Stop;
    private Vibrator vibrator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relax);

        //For music played from button

//        button = findViewById(R.id.start_vib);
//        button.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                MediaPlayer mp = MediaPlayer.create(relax.this,R.raw.wake_up);
//                mp.start();
//                return false;
//            }
//        });



        //for background video

        videoView = findViewById(R.id.vid_view);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.back_vid);
        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        //For Vibrating the phone for inhale and exhale

        Start =findViewById(R.id.start_vib);
        Stop =findViewById(R.id.stop_vib);

        vibrator=(Vibrator) getSystemService(VIBRATOR_SERVICE);
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a waveform pattern
                long[] timings = {0, 1000, 2000, 3000}; // Timings for vibration on and off in milliseconds
                int[] amplitudes = {255, 0, 255, 0}; // Amplitudes (strength) of vibration
                if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){

                    vibrator.vibrate(
                    VibrationEffect.createWaveform(timings,amplitudes,0)
                    );


            }else {

                    long[] pattern = {0, 2000, 10, 5000};
                    vibrator.vibrate(pattern, -1);
                }
            }
        });

        Stop.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vibrator.cancel();

            }
        }));
    }






    @Override
    protected void onPostResume() {
        videoView.resume();
        super.onPostResume();
    }

    @Override
    protected void onRestart() {
        videoView.start();
        super.onRestart();
    }

    @Override
    protected void onPause() {
        videoView.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        videoView.stopPlayback();
        super.onDestroy();
    }
}