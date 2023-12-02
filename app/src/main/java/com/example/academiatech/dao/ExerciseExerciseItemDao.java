package com.example.academiatech.dao;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.academiatech.model.ExerciseExerciseItem;

import java.util.List;

@Dao
public interface ExerciseExerciseItemDao {

    @Transaction
    @Query("SELECT * FROM Exercise")
    public List<ExerciseExerciseItem> getExerciseExerciseItem();
}
