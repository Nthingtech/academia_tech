package com.example.academiatech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.academiatech.dao.TrainingExerciseItemDao;
import com.example.academiatech.db.AppDatabase;
import com.example.academiatech.model.TrainingExerciseItem;

import java.util.List;

public class MainActivityTraining extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_training);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewTraining);//todo ok
        AppDatabase db = AppDatabase.getInstance(this);
        TrainingExerciseItemDao trainingExerciseItemDao = db.trainingExerciseItemDao();//todo ok
        List<TrainingExerciseItem> trainingExerciseItems = trainingExerciseItemDao.getTrainingExerciseItem();//todo ok
        TrainingExerciseItemAdapter trainingExerciseItemAdapter = new TrainingExerciseItemAdapter(trainingExerciseItems);
        recyclerView.setAdapter(trainingExerciseItemAdapter);
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