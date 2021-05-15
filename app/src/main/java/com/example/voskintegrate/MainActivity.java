package com.example.voskintegrate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dewimodule3.DewiClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DewiClass dewilass = new DewiClass();
    }
}