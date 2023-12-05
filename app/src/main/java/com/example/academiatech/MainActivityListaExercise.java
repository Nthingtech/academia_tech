package com.example.academiatech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.academiatech.dao.ExerciseDao;
import com.example.academiatech.db.AppDatabase;
import com.example.academiatech.model.Exercise;

import java.util.List;

public class MainActivityListaExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista_exercise);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewExercise);
        AppDatabase db = AppDatabase.getInstance(this);
        ExerciseDao exerciseDao = db.exerciseDao();
        List<Exercise> exercises = exerciseDao.getExercises();
        recyclerView.setAdapter(new ExerciseAdapter(exercises, this, exerciseDao));
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                        false);
        recyclerView.setLayoutManager(layoutManager);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
        );
        recyclerView.addItemDecoration(dividerItemDecoration);
    }

    public void openActivityPrescription(View view) {
        Intent intent = new Intent(this, MainActivityPrescription.class);
        startActivity(intent);
    }

}