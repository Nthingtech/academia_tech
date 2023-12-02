package com.example.academiatech.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.academiatech.model.Exercise;

import java.util.List;

@Dao
public interface ExerciseDao {

    @Query("SELECT * FROM Exercise")
    List<Exercise> getExercises();

    @Query("SELECT * FROM Exercise WHERE id=:idExercise")
    Exercise searchExerciseById(int idExercise);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertExercise(Exercise exercise);

    @Delete
    void deleteExercise(Exercise exercise);

    @Update
    void updateExercise(Exercise exercise);
}
