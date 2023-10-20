package com.example.academiatech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
    }

    public void openActivityMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openActivityPrincipaAdmin(View view) { //TODO PROVISÓRIO - SOMENTE PARA TESTES VIEW REGISTER
        Intent intent = new Intent(this, MainActivityPrincipaAdmin.class);
        startActivity(intent);
    }


}