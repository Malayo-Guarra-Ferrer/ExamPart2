package com.example.exampart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, button2, button3, button4, button5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Members");

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile1();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile2();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile3();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile4();
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile5();
            }
        });
    }

    public void profile1(){
        Intent intent = new Intent(this, Profile1.class);
        startActivity(intent);
        finish();
    }

    public void profile2(){
        Intent intent = new Intent(this, Profile2.class);
        startActivity(intent);
        finish();
    }

    public void profile3(){
        Intent intent = new Intent(this, Profile3.class);
        startActivity(intent);
        finish();
    }
    public void profile4(){
        Intent intent = new Intent(this, Profile4.class);
        startActivity(intent);
        finish();
    }

    public void profile5(){
        Intent intent = new Intent(this, Profile5.class);
        startActivity(intent);
        finish();
    }
}