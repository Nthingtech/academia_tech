package com.example.academiatech;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openActivityRegister(View view) { //TODO PROVISÓRIO - SOMENTE PARA TESTES VIEW REGISTER
        Intent intent = new Intent(this, MainActivityRegister.class);
        startActivity(intent);
    }

    public void openActivityPrincipal(View view) {
        Intent intent = new Intent(this, MainActivityPrincipal.class);
        startActivity(intent);
    }

}