package com.example.academiatech;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.academiatech.model.TrainingExerciseItem;

import java.util.List;

public class TrainingExerciseItemAdapter extends RecyclerView.Adapter<TrainingExerciseItemViewHolder> {

    private List<TrainingExerciseItem> trainingExerciseItemList;
    public TrainingExerciseItemAdapter(List<TrainingExerciseItem> trainingExerciseItemList) {
        this.trainingExerciseItemList = trainingExerciseItemList;
    }

    @Override
    public TrainingExerciseItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.training_exercise_item, parent, false);

        return new TrainingExerciseItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TrainingExerciseItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return trainingExerciseItemList.size();
    }

}
