package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.widget.*;
import android.view.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch sw;
    RadioGroup rg;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.sw);
        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        btn=findViewById(R.id.btn);
    }

    public void onRadioClick(View view) {
        if(!sw.isChecked()){
            if(rb1.isChecked()) rg.setBackgroundColor(Color.RED);
            if(rb2.isChecked()) rg.setBackgroundColor(Color.YELLOW);
            if(rb3.isChecked()) rg.setBackgroundColor(Color.GREEN);
            if(rb4.isChecked()) rg.setBackgroundColor(Color.BLUE);
        }
    }

    public void onClick(View view) {
        if(sw.isChecked()){
            if(rb1.isChecked()) rg.setBackgroundColor(Color.RED);
            if(rb2.isChecked()) rg.setBackgroundColor(Color.YELLOW);
            if(rb3.isChecked()) rg.setBackgroundColor(Color.GREEN);
            if(rb4.isChecked()) rg.setBackgroundColor(Color.BLUE);
        }
    }
}