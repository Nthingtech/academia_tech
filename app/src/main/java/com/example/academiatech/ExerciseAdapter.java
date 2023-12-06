package com.example.academiatech;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.academiatech.dao.ExerciseDao;
import com.example.academiatech.model.Exercise;

import java.util.List;

public class ExerciseAdapter extends RecyclerView.Adapter {

    private List<Exercise> exercises;
    private Context context;
    private ExerciseDao exerciseDao;

    public ExerciseAdapter(List<Exercise> exercises, Context context, ExerciseDao exerciseDao) {
        this.exercises = exercises;
        this.context = context;
        this.exerciseDao = exerciseDao;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_exercise,
                parent, false);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ExerciseViewHolder exerciseViewHolder = (ExerciseViewHolder) holder;
        Exercise exercise = exercises.get(position);
        exerciseViewHolder.id.setText(Long.toString(exercise.getId()));
        exerciseViewHolder.exerciseName.setText(exercise.getExerciseName());
        exerciseViewHolder.machineNumber.setText(Integer.toString(exercise.getMachineNumber()));
        exerciseViewHolder.muscleGroup.setText(exercise.getMuscleGroup());
        exerciseViewHolder.videoUri.setText(exercise.getVideoUri());

        exerciseViewHolder.deleteExercise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int adapterPosition = holder.getAdapterPosition();
                exerciseDao.deleteExercise(exercise);
                exercises.remove(adapterPosition);
                notifyItemRemoved(adapterPosition);


                exercises = exerciseDao.getExercises();

            }
        });


    }

    @Override
    public int getItemCount() {
        return exercises.size();
    }

}
