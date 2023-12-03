package com.example.academiatech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);
    }
    
    public void openActivityPrescription(View view) {
        Intent intent = new Intent(this, MainActivityPrescription.class);
        startActivity(intent);
    }

    public void openActivityProfile(View view) {
        Intent intent = new Intent(this, MainActivityProfile.class);
        startActivity(intent);
    }

    public void openActivityCalcFct(View view) {
        Intent intent = new Intent(this, MainActivityCalcFct.class);
        startActivity(intent);
    }
}