package com.example.mental;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class crunches_abs extends AppCompatActivity {
//    private TextView textView;
//    private Button addplusone;
//
//
//    public static final String SHARED_PREF = "sharedPreds";
//    public static final String TEXT = "text";

    Button OPENLINK ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crunches_abs);

//        textView = (TextView) findViewById(R.id.display_date);
//        addplusone = (Button) findViewById(R.id.add_date);
//
//        addplusone.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                saveData();
//            }
//        });







      Button btn = (Button)findViewById(R.id.info_crunches);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(crunches_abs.this,info_crunches.class));
          }
      });

        //Youtube Link Added to button in crunches.
        OPENLINK= findViewById(R.id.crunches_yt);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://youtu.be/0t4t3IpiEao");
            }
        });

    }

    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

//    public void saveData();{
//
//        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//
//       editor.putString(TEXT,textView.getText().toString());
//
//
//
//    }
//
//    public void loadData(){
//
//        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
//          text = sharedPreferences.getString(TEXT,"");
//
//    }
//    public void updateViews(){
//
//        textView.setText(text);
//    }

}