package com.example.academiatech.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.academiatech.model.Training;

import java.util.List;

@Dao
public interface TrainingDao {

    @Query("SELECT * FROM Training")
    List<Training> getTrainings();

    @Query("SELECT * FROM Training WHERE id=:idTraining")
    Training searchTrainingById(int idTraining);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTraining(Training training);

    @Delete
    void deleteTraining(Training training);

    @Update
    void updateTraining(Training training);
}
