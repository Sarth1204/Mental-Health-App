package com.example.mental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class lifestyle_start extends AppCompatActivity {

    CheckBox ch1,ch2,ch3,ch4,ch5,ch20,ch6,ch7,ch8,ch9,ch10,ch11;
    Button submit;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifestyle_start);

        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);
        ch20 = findViewById(R.id.ch5);
        ch6 = findViewById(R.id.ch6);
        ch7 = findViewById(R.id.ch7);
        ch8 = findViewById(R.id.ch8);
        ch9 = findViewById(R.id.ch9);
        ch10 = findViewById(R.id.ch10);
        ch11 = findViewById(R.id.ch11);
        submit = findViewById(R.id.submit);
        txt = findViewById(R.id.txt);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chkb1 = ch1.getText().toString();
                String chkb2 = ch2.getText().toString();
                String chkb3 = ch3.getText().toString();
                String chkb4 = ch4.getText().toString();
                String chkb5 = ch20.getText().toString();
                String chkb6 = ch6.getText().toString();
                String chkb7 = ch7.getText().toString();
                String chkb8 = ch8.getText().toString();
                String chkb9 = ch9.getText().toString();
                String chkb10 = ch10.getText().toString();
                String chk11 = ch11.getText().toString();

                if (ch1.isChecked()&&ch2.isChecked()&&ch3.isChecked()){

                    txt.setText("Moderate, you can do better");

                }else if (ch4.isChecked()&&ch20.isChecked()&&ch6.isChecked()) {

                    txt.setText("Please call the 24*7 helpline");



                }else if (ch7.isChecked()&&ch8.isChecked()&&ch9.isChecked()) {

                    txt.setText("Please Relax your mind, listen to some music");


                }else if (ch10.isChecked()&&ch11.isChecked()){

                    txt.setText("Please consult a doctor");


                }else{

                    txt.setText("Please Select any Check Box");
                }

            }
        });
    }
}