package com.example.academiatech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;

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
}