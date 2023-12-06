package com.example.academiatech;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.academiatech.db.AppDatabase;
import com.example.academiatech.model.Exercise;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewExerciseItem extends AppCompatActivity {

    TextInputLayout til_exercise_item_training;

    AutoCompleteTextView act_exercise_item_training;

    ArrayList<String> arrayList_exercise_item_training;

    ArrayAdapter<String> arrayAdapter_exercise_item_training;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_exercise_item);

        /*arrayList_exercise_item_training = new ArrayList<>();
        arrayList_exercise_item_training.add("Cadeira Extensora");
        arrayList_exercise_item_training.add("Cadeira Flexora");
        arrayList_exercise_item_training.add("Cadeira Adutora");
        arrayList_exercise_item_training.add("Supino");
        arrayList_exercise_item_training.add("Leg Press 45");
        arrayList_exercise_item_training.add("Leg Press Horizontal");
        arrayList_exercise_item_training.add("Supino Reto Articulado");*/

        til_exercise_item_training = (TextInputLayout) findViewById(R.id.til_exercise_item_training);
        act_exercise_item_training = (AutoCompleteTextView) findViewById(R.id.act_exercise_item_training);

        AppDatabase database = AppDatabase.getInstance(this);
        List<Exercise> exercises = database.exerciseDao().getExercises();

        arrayList_exercise_item_training = new ArrayList<>();
        for(Exercise exercise : exercises) {
            arrayList_exercise_item_training.add(exercise.getExerciseName());
        }

        arrayAdapter_exercise_item_training = new ArrayAdapter<>(getApplicationContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, arrayList_exercise_item_training);
        act_exercise_item_training.setAdapter(arrayAdapter_exercise_item_training);

        act_exercise_item_training.setThreshold(1);

        act_exercise_item_training.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    return true;
                }
                return false;
            }
        });
    }
}
