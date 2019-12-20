package com.example.ieee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ComputerSocietyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_computer_society);
    }
}
