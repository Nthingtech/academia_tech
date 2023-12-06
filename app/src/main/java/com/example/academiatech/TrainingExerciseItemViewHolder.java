package com.example.academiatech;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class TrainingExerciseItemViewHolder extends RecyclerView.ViewHolder {

    TextView exerciseItemName;
    TextView exerciseItemSeries;
    TextView exerciseItemQtd;
    TextView exerciseItemRest;
    TextView exerciseItemWeight;
    TextView exerciseItemObs;

    public TrainingExerciseItemViewHolder(View itemView) {
        super(itemView);
        exerciseItemName = itemView.findViewById(R.id.exercise_item_name);
        exerciseItemSeries = itemView.findViewById(R.id.exercise_item_series);
        exerciseItemQtd = itemView.findViewById(R.id.exercise_item_qtd);
        exerciseItemRest = itemView.findViewById(R.id.exercise_item_rest);
        exerciseItemWeight = itemView.findViewById(R.id.exercise_item_weight);
        exerciseItemObs = itemView.findViewById(R.id.exercise_item_obs);
    }
}
