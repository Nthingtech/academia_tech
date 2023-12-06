package com.example.academiatech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityTraining extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_training);
    }

    public void openActivityPrescription(View view) {
        Intent intent = new Intent(this, MainActivityPrescription.class);
        startActivity(intent);
    }
}