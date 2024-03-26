package com.example.mental;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class female_calx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_calx);
    }

    public void bodyfat_fem(View v){
        EditText et1 = (EditText) findViewById(R.id.age_cc);
        EditText et2 = (EditText) findViewById(R.id.weight_cc);
        EditText et3 = (EditText) findViewById(R.id.height_cc);
        EditText et4 = (EditText) findViewById(R.id.result_cc);

        double n1 =Integer.parseInt(et1.getText().toString());
        double n2 = Integer.parseInt(et2.getText().toString());
        double n3 = Integer.parseInt(et3.getText().toString());

        //Calculating calories intake
        double n4 = 9.6*n2;
        double n5 = 1.8*n3;
        double n6 = 4.7*n1;
        double n7 = 655;
        double result = (n7+n4+n5)-n6;







//
//        if (result<18.5){
//            Toast.makeText(bmi_calculator.this,"Under Weight", Toast.LENGTH_LONG).show();
//        }else if (result>=18.5 && result<25) {
//            Toast.makeText(bmi_calculator.this, "Normal", Toast.LENGTH_LONG).show();
//        }else if (result>=25 && result<30){
//            Toast.makeText(bmi_calculator.this,"Over Weight", Toast.LENGTH_LONG).show();
//        }else Toast.makeText(bmi_calculator.this,"Error",Toast.LENGTH_SHORT).show();
//

        et4.setText(" "+result);
    }
}