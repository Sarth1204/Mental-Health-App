package com.example.mental;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class male_bmr extends AppCompatActivity {

    public Button mButton;
    public TextView mText;
    public  EditText mEditText;
    public String getSting;
    public static final String SHARED_PREF = "shared";
    public static final String TEXT = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_bmr);

        mButton  = (Button)findViewById(R.id.savedatamale);
        mText = (TextView) findViewById(R.id.textviewmale);
        mEditText = (EditText) findViewById(R.id.result1);

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
    }

    private void update() {

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        String text = sharedPreferences.getString(TEXT, "Previous BMI was:");
        mText.setText(text);
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
        double n6 = (5*n3)+5;
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