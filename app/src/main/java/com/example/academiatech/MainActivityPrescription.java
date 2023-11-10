package com.example.academiatech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.textfield.TextInputLayout;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MainActivityPrescription extends AppCompatActivity {


    TextInputLayout til_client;
    AutoCompleteTextView act_clients;

    ArrayList<String> arrayList_client;
    ArrayAdapter<String> arrayAdapter_client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prescription);

        Button button = findViewById(R.id.datePicker);

        TextView textView = findViewById(R.id.tv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialDatePicker<Long> materialDatePicker = MaterialDatePicker.Builder.datePicker()
                        .setTitleText("Selecione a data")
                        .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                        .setTheme(R.style.MyDatePickerTheme) //TODO teste de cor
                        .build();
                materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener<Long>() {
                    @Override
                    public void onPositiveButtonClick(Long selection) {
                        String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date(selection));
                        textView.setText(MessageFormat.format("{0}", date));
                    }
                });
                materialDatePicker.show(getSupportFragmentManager(), "tag");
            }
        });

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

}