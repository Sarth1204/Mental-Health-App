package com.example.mental;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class bmi_calculator extends AppCompatActivity {

    public Button mButton;
    public TextView mText;
    public  EditText mEditText;
    public String getSting;
    public static final String SHARED_PREF = "shared";
    public static final String TEXT = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);


        mButton  = (Button)findViewById(R.id.savedata);
        mText = (TextView) findViewById(R.id.textviewnew);
        mEditText = (EditText) findViewById(R.id.result);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSting = mEditText.getText().toString();
                mText.setText(getSting);


                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(TEXT,mText.getText().toString());
                editor.apply();
            }
        });
        
        update();


        Button btn10= (Button) findViewById(R.id.back_page1);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bmi_calculator.this,home_main.class));
            }
        });

        TextView btn11= (TextView) findViewById(R.id.obesity_1);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bmi_calculator.this,obesity_info.class));
            }
        });

        TextView btn12= (TextView) findViewById(R.id.overweight_1);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bmi_calculator.this,overweight_info.class));
            }
        });


        TextView btn13= (TextView) findViewById(R.id.underweight);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bmi_calculator.this,underweight_info.class));
            }
        });

    }

    private void update() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        String text = sharedPreferences.getString(TEXT, "Previous BMI was:");
        mText.setText(text);
    }

    public void bmi(View v){
        EditText et1 = (EditText) findViewById(R.id.height);
        EditText et2 = (EditText) findViewById(R.id.weight);
        EditText et3 = (EditText) findViewById(R.id.result);

        float n1 =Integer.parseInt(et1.getText().toString());
        float n2 = Integer.parseInt(et2.getText().toString());
        float n3 = n1/100;
        float n4 = n3*n3;
        float result = n2/n4;

//        if (n1>175 || n2>200){
//            Toast.makeText(bmi_calculator.this,"Please check your input digits",Toast.LENGTH_LONG).show();
//            result=0;
//        }

        if (result<18.5){
            Toast.makeText(bmi_calculator.this,"Under Weight", Toast.LENGTH_LONG).show();
        }else if (result>=18.5 && result<25) {
            Toast.makeText(bmi_calculator.this, "Normal", Toast.LENGTH_LONG).show();
        }else if (result>=25 && result<30){
            Toast.makeText(bmi_calculator.this,"Over Weight", Toast.LENGTH_LONG).show();
        }else Toast.makeText(bmi_calculator.this,"Obesity",Toast.LENGTH_SHORT).show();


        et3.setText("BMI = "+result);
    }

}