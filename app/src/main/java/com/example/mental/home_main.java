package com.example.mental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class home_main extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);


        //for call in 24*7 button
         button = findViewById(R.id.help_call);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Intent.ACTION_DIAL);
                 intent.setData(Uri.parse("tel:9152987821"));
                 startActivity(intent);
             }
         });

        //for toolbar in home screen

        Toolbar toolbar = findViewById(R.id.toolbar_home);
        setSupportActionBar(toolbar);




        Button btn =(Button) findViewById(R.id.sleepbtn_home);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,sleep.class));
            }
        });

        Button btn12 =(Button) findViewById(R.id.game);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,game_home.class));
            }
        });



        Button btn2 =(Button) findViewById(R.id.anxietybtn_home);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,anxiety_home.class));
            }
        });

        Button btn3 =(Button) findViewById(R.id.stressbtn_home);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,stress_home.class));
            }
        });

        Button btn4 =(Button) findViewById(R.id.depressionbtn_home);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,depression_home.class));
            }
        });

        Button btn5 =(Button) findViewById(R.id.addictionbtn_home);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,addiction_home.class));
            }
        });

        Button btn6 =(Button) findViewById(R.id.selflovebtn_home);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,selflove_home.class));
            }
        });

        Button btn7 =(Button) findViewById(R.id.smt_elsebtn);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,physical.class));
            }
        });

        Button btn8 =(Button) findViewById(R.id.dailystart_home);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,mydaily_home.class));
            }
        });

        Button btn9 =(Button) findViewById(R.id.breath_home);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,relax.class));
            }
        });

        Button btn10 =(Button) findViewById(R.id.innerself_home);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,innerself_home.class));
            }
        });

        Button btn11 =(Button) findViewById(R.id.lifestyle_home);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,lifestyle_home.class));
            }
        });


        Button btn13 =(Button) findViewById(R.id.relax);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,relax.class));
            }
        });

        Button btn14 =(Button) findViewById(R.id.sleep);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,sleep.class));
            }
        });

        Button btn15 =(Button) findViewById(R.id.physical);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,physical.class));
            }
        });

        Button btn16 =(Button) findViewById(R.id.home);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,home_main.class));
            }
        });

        Button btn17 =(Button) findViewById(R.id.chat_home);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,chat_home.class));
            }
        });

        Button btn18 =(Button) findViewById(R.id.voice_home);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_main.this,voice_home.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_file,menu);
        return super.onCreateOptionsMenu(menu);

    }

    //MENU
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        switch (item.getItemId()) {

            case R.id.signup:
                Intent intent = new Intent(home_main.this,login_profile.class);
                startActivity(intent);
                Toast.makeText(this,"Sign-up Page",Toast.LENGTH_LONG).show();
                return true;


            case R.id.about:
                Intent intent1 = new Intent(home_main.this,about.class);
                startActivity(intent1);
                Toast.makeText(this,"About",Toast.LENGTH_LONG).show();
                return true;

            case R.id.developers:
                Intent intent2 = new Intent(home_main.this,developers.class);
                startActivity(intent2);
                Toast.makeText(this,"Developers",Toast.LENGTH_LONG).show();



        }
        return super.onOptionsItemSelected(item);

    }
}