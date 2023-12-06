package com.example.academiatech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityCalcFct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc_fct);
    }

    public void openActivityPrincipal(View view) {
        Intent intent = new Intent(this, MainActivityPrincipal.class);
        startActivity(intent);
    }
}