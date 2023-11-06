package com.example.academiatech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivityPrescription extends AppCompatActivity {


    TextInputLayout til_client;
    AutoCompleteTextView act_clients;

    ArrayList<String> arrayList_client;
    ArrayAdapter<String> arrayAdapter_client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prescription);

        //mock list TODO refatorar
        arrayList_client=new ArrayList<>();
        arrayList_client.add("André Caio Ribeiro");
        arrayList_client.add("André Caio Augusto");
        arrayList_client.add("André Feitosa Augusto");
        arrayList_client.add("Feliipe Justino Orlandino");
        arrayList_client.add("Fabricio Juliano Penteado");
        arrayList_client.add("Gabriela dos Santos e Silva");
        arrayList_client.add("Naira Galvão Tetsuo");

        til_client=(TextInputLayout) findViewById(R.id.til_client);
        act_clients=(AutoCompleteTextView) findViewById(R.id.act_clients);

        arrayAdapter_client=new ArrayAdapter<>(getApplicationContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arrayList_client);
        act_clients.setAdapter(arrayAdapter_client);

        act_clients.setThreshold(1); // TODO How many character requires to load suggestion spinner


    }

    //TODO 6:42 MIN
}