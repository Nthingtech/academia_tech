package com.example.academiatech;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.academiatech.db.AppDatabase;
import com.example.academiatech.model.User;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.textfield.TextInputLayout;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
                        .setTheme(R.style.MyDatePickerTheme)
                        .build();
                materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener<Long>() {
                    @Override
                    public void onPositiveButtonClick(Long selection) {
                        String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date(selection));
                        textView.setText(MessageFormat.format("{0}", date)); //TODO instaciar prescription para persistir a data
                    }
                });
                materialDatePicker.show(getSupportFragmentManager(), "tag");
            }
        });

        til_client = (TextInputLayout) findViewById(R.id.til_client);
        act_clients = (AutoCompleteTextView) findViewById(R.id.act_client);

        AppDatabase database = AppDatabase.getInstance(this);
        List<User> users = database.userDao().getUsers();

        arrayList_client = new ArrayList<>();
        for (User user : users) {
            arrayList_client.add(user.getName());
        }

        arrayAdapter_client = new ArrayAdapter<>(getApplicationContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, arrayList_client);
        act_clients.setAdapter(arrayAdapter_client);

        act_clients.setThreshold(1); // quantos caracteres ele vai começar a pesquisar

        act_clients.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    return true;
                }
                return false;
            }
        });
    }

    public void openActivityRegisterExercise(View view) {
        Intent intent = new Intent(this, MainActivityRegisterExercise.class);
        startActivity(intent);
    }

    public void openActivityMainTraining(View view) {
        Intent intent = new Intent(this, MainActivityTraining.class);
        startActivity(intent);
    }

}