package com.example.services;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStart = findViewById(R.id.btn_start);
        Button buttonStop = findViewById(R.id.btn_stop1);

        buttonStart.setOnClickListener(view -> startService(new Intent(MainActivity.this, MyServices.class)));
        buttonStop.setOnClickListener(view -> stopService(new Intent(MainActivity.this, MyServices.class)));


    }}