package com.example.academiatech;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ExerciseViewHolder extends RecyclerView.ViewHolder {

    final TextView id;
    final TextView exerciseName;
    final TextView machineNumber;
    final TextView muscleGroup;
    final TextView videoUri;

    Button deleteExercise;

    public ExerciseViewHolder(View itemExerciseview) {
        super(itemExerciseview);
        id = itemExerciseview.findViewById(R.id.exe_item_id);
        exerciseName = itemExerciseview.findViewById(R.id.exe_item_exerc);
        machineNumber = itemExerciseview.findViewById(R.id.exe_item_ap);
        muscleGroup = itemExerciseview.findViewById(R.id.exe_item_gr_musc);
        videoUri = itemExerciseview.findViewById(R.id.exe_item_link);

        deleteExercise = itemExerciseview.findViewById(R.id.deleteExercise);
    }


}
