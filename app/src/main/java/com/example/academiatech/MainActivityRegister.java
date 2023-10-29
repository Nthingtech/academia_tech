package com.example.academiatech;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register);
        RadioButton radioButton = findViewById(R.id.radioButtonMasc);
        ColorStateList colorStateList = ColorStateList.valueOf(Color.BLACK);
        radioButton.setButtonTintList(colorStateList);
        RadioButton radioButton1 = findViewById(R.id.radioButtonFem);
        ColorStateList colorStateList1 = ColorStateList.valueOf(Color.BLACK);
        radioButton1.setButtonTintList(colorStateList1);
    }

    public void abrirDatabase( View view ) {
        Intent intent = new Intent(this, DatabaseActivity.class);
        startActivity(intent);
    }
}