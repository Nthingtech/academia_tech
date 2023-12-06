package com.example.academiatech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityCalcFct extends AppCompatActivity {

    private EditText editTextfreq1;
    private EditText editTextfreq2;
    private EditText editTextfreq3;
    private EditText editTextIdade;

    private EditText editTextMedia;
    private EditText editTextFct1;
    private EditText editTextFct2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc_fct);
        editTextfreq1 = findViewById(R.id.editTextfreq1);
        editTextfreq2 = findViewById(R.id.editTextfreq2);
        editTextfreq3 = findViewById(R.id.editTextfreq3);
        editTextIdade = findViewById(R.id.editTextIdade);
        editTextMedia = findViewById(R.id.editTextMedia);
        editTextFct1 = findViewById(R.id.editTextFct1);
        editTextFct2 = findViewById(R.id.editTextFct2);


    }

    public void fct1(View view) {
        double fRepo1, fRepo2, fRepo3, idade, fct1;
        fRepo1 = Double.parseDouble(editTextfreq1.getText().toString());
        fRepo2 = Double.parseDouble(editTextfreq2.getText().toString());
        fRepo3 = Double.parseDouble(editTextfreq3.getText().toString());
        idade = Double.parseDouble(editTextIdade.getText().toString());

        double max = 208 - (0.7 * idade);
        double repo = (fRepo1 + fRepo2 + fRepo3) / 3;
        double reserv = max - repo;
        fct1 = reserv * 0.8 + repo;
        editTextFct1.setText(Double.toString(fct1));
    }

    public void fct2(View view) {
        double fRepo1, fRepo2, fRepo3, idade, fct1;
        fRepo1 = Double.parseDouble(editTextfreq1.getText().toString());
        fRepo2 = Double.parseDouble(editTextfreq2.getText().toString());
        fRepo3 = Double.parseDouble(editTextfreq3.getText().toString());
        idade = Double.parseDouble(editTextIdade.getText().toString());

        double max = 208 - (0.7 * idade);
        double repo = (fRepo1 + fRepo2 + fRepo3) / 3;
        double reserv = max - repo;
        fct1 = reserv * 0.9 + repo;
        editTextFct2.setText(Double.toString(fct1));
    }

    public void openActivityPrincipal(View view) {
        Intent intent = new Intent(this, MainActivityPrincipal.class);
        startActivity(intent);
    }
}