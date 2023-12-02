package com.example.academiatech.dao;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.academiatech.model.TrainingExerciseItem;

import java.util.List;

@Dao
public interface TrainingExerciseItemDao {
    @Transaction
    @Query("SELECT * FROM Training")
    public List<TrainingExerciseItem> getTrainingExerciseItem();
}
