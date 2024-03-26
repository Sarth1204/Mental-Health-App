package com.example.mental;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class female_bmr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_bmr);


    }


    public void bmr(View v){
        EditText et1 = (EditText) findViewById(R.id.height);
        EditText et2 = (EditText) findViewById(R.id.weight);
        EditText et3 = (EditText)findViewById(R.id.age);
        EditText et4 = (EditText) findViewById(R.id.result);

        double n1 =Integer.parseInt(et1.getText().toString());
        double n2 = Integer.parseInt(et2.getText().toString());
        double n3 = Integer.parseInt((et3.getText().toString()));
        double n4 = 10*n2;
        double n5 = 6.25*n1;
        double n6 = (5*n3)-161;
        double n7 = n4+n5-n6;
        double result = n7;


//
//        if (result<18.5){
//            Toast.makeText(male_bmr.this,"Under Weight", Toast.LENGTH_LONG).show();
//        }else if (result>=18.5 && result<25) {
//            Toast.makeText(bmi_calculator.this, "Normal", Toast.LENGTH_LONG).show();
//        }else if (result>=25 && result<30){
//            Toast.makeText(bmi_calculator.this,"Over Weight", Toast.LENGTH_LONG).show();
//        }else Toast.makeText(bmi_calculator.this,"Error",Toast.LENGTH_SHORT).show();


        et4.setText(result+"Calories/day");
    }
}