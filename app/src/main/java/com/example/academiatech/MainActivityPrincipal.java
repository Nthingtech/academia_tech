package com.example.academiatech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);
    }

    public void openActivityLogin(View view) {
        Intent intent = new Intent(this, MainActivityLogin.class);
        startActivity(intent);
    }

    public void openActivityPrescription(View view) {
        Intent intent = new Intent(this, MainActivityPrescription.class);
        startActivity(intent);
    }
}