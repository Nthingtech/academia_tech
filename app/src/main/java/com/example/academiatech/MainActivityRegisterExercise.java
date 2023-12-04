package com.example.academiatech;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityRegisterExercise extends AppCompatActivity {

    private EditText editMachineNumber;
    private EditText editMuscleGroup;
    private EditText editExerciseName;
    private EditText editVideoUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register_exercise);

        editMachineNumber = findViewById(R.id.editMachineNumber);
        editMuscleGroup = findViewById(R.id.editMuscleGroup);
        editExerciseName = findViewById(R.id.editExerciseName);
        editVideoUri = findViewById(R.id.editVideoUri);
    }

    public void registerExercise(View view) {
        
    }
}