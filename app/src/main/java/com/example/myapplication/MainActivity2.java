package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        boolean condition;
        int x = 0;

        Intent i = getIntent();
        condition = Boolean.parseBoolean(i.getStringExtra("condition_var"));
        x = i.getIntExtra("INT_MONTHS",0);

        TextView display = findViewById(R.id.txtView);

        switch (x) {
            case 1:
                display.setText("The Month that you encoded is January");
                break;
            case 2:
                display.setText("The Month that you encoded is February");
                break;
            case 3:
                display.setText("The Month that you encoded is March");
                break;
            case 4:
                display.setText("The Month that you encoded is April");
                break;
            case 5:
                display.setText("The Month that you encoded is May");
                break;
            case 6:
                display.setText("The Month that you encoded is June");
                break;
            case 7:
                display.setText("The Month that you encoded is July");
                break;
            case 8:
                display.setText("The Month that you encoded is August");
                break;
            case 9:
                display.setText("The Month that you encoded is September");
                break;
            case 10:
                display.setText("The Month that you encoded is October");
                break;
            case 11:
                display.setText("The Month that you encoded is November");
                break;
            case 12:
                display.setText("The Month that you encoded is December");
                break;
            default:
                display.setText("ERROR: THERE IS NO MONTH IN THIS NUMBER");
                break;

        }

    }