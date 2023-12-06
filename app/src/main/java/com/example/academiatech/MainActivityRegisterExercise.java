package com.example.academiatech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.academiatech.dao.ExerciseDao;
import com.example.academiatech.db.AppDatabase;
import com.example.academiatech.model.Exercise;

public class MainActivityRegisterExercise extends AppCompatActivity {

    private EditText editMachineNumber;
    private EditText editMuscleGroup;
    private EditText editExerciseName;
    private EditText editVideoUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register_exercise);
        Exercise exercise = new Exercise();

        editMachineNumber = findViewById(R.id.editMachineNumber);
        editMuscleGroup = findViewById(R.id.editMuscleGroup);
        editExerciseName = findViewById(R.id.editExerciseName);
        editVideoUri = findViewById(R.id.editVideoUri);
    }

    public void registerExercise(View view) {
        AppDatabase db = AppDatabase.getInstance(this);
        ExerciseDao exerciseDao = db.exerciseDao();
        int machineNumber = Integer.parseInt(editMachineNumber.getText().toString());
        String muscleGroup = editMuscleGroup.getText().toString();
        String exerciseName = editExerciseName.getText().toString();
        String videoUri = editVideoUri.getText().toString();

        Exercise e = new Exercise(exerciseName, machineNumber, muscleGroup, videoUri);
        exerciseDao.insertExercise(e);

        Intent intent = new Intent(this, MainActivityRegisterExercise.class);
        startActivity(intent);
        finish();

    }

    public void openActivityPrescription (View view) {
        Intent intent = new Intent(this, MainActivityPrescription.class);
        startActivity(intent);
    }
}