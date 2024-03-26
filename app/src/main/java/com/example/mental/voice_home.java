package com.example.mental;

import static android.Manifest.permission.RECORD_AUDIO;
import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.Locale;

public class voice_home extends AppCompatActivity {

    private static final int REQUEST_CODE_SPEECH_INPUT = 100;
    private static final int REQUEST_CODE_CALL_PHONE = 101;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice_home);

        textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSpeechToText();
            }
        });
    }

    private void startSpeechToText() {
        // Check permission
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, REQUEST_CODE_SPEECH_INPUT);
        } else {
            // Start speech recognition intent
            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Speak something...");

            try {
                startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this, "Speech to text not supported", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_SPEECH_INPUT) {
            if (resultCode == RESULT_OK && data != null) {
                ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                if (result != null && !result.isEmpty()) {
                    String spokenText = result.get(0);
                    textView.setText(spokenText);
                    processCommand(spokenText);
                }
            }
        }
    }

    private void processCommand(String command) {
        if (command.contains("call")) {
            String number = command.replaceAll("[^0-9]", "");
            if (!number.isEmpty()) {
                makePhoneCall(number);
            } else {
                Toast.makeText(this, "Invalid phone number", Toast.LENGTH_SHORT).show();
            }
        } else if (command.contains("anxiety")) {
            String website3 = command.replaceAll("\\s+", "").replace("open", "");
            anxiety(website3);

        } else if (command.contains("stress")) {
            String website4 = command.replaceAll("\\s+", "").replace("open", "");
            stress(website4);

        } else if (command.contains("anger")) {
            String website5 = command.replaceAll("\\s+", "").replace("open", "");
            anger(website5);

        } else if (command.contains("phone addiction")) {
            String website6 = command.replaceAll("\\s+", "").replace("open", "");
            phone(website6);
        }else if (command.contains("depression")) {
            String website2 = command.replaceAll("\\s+", "").replace("open", "");
            iamindepression(website2);

        }else if (command.contains("help me with")) {
            String query = command.replace("search", "").trim();
            googleSearch(query);

        }else {
            Toast.makeText(this, "Command not recognized", Toast.LENGTH_SHORT).show();
        }
    }

    private void makePhoneCall(String number) {
        String mnumber = "9111111"; // Set the phone number here
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CODE_CALL_PHONE);
        } else { String dial = "tel:" + number;
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
        }
    }

    private void anxiety(String website3) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=pYILH3QAHkI&ab_channel=TherapyinaNutshell");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void stress(String website4) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=-hwxBBChA2c&ab_channel=AsapSCIENCE");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void googleSearch(String query) {
        String searchUrl = "https://www.google.com/search?q=" + Uri.encode(query);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(searchUrl));
        startActivity(intent);
    }

    private void anger(String website5) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=F22ZvJR2mss&ab_channel=JockoPodcast");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void phone(String website6) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=Ry0OOpHc1AA&ab_channel=AmanDhattarwal");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void iamindepression(String website2) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=alke79UiljQ&ab_channel=BloombergQuicktake");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_CODE_CALL_PHONE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission granted, call again", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
