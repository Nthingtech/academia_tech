package com.example.academiatech.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.academiatech.model.ExerciseItem;

import java.util.List;

@Dao
public interface ExerciseItemDao {

    @Query("SELECT * FROM ExerciseItem")
    List<ExerciseItem> getExerciseItems();

    @Query("SELECT * FROM ExerciseItem WHERE id=:idExerciseItem")
    ExerciseItem searchExerciseItemById(int idExerciseItem);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertExerciseItem(ExerciseItem exerciseItem);

    @Delete
    void deleteExerciseItem(ExerciseItem exerciseItem);

    @Update
    void updateExerciseItem(ExerciseItem exerciseItem);
}
