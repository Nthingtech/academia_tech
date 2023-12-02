package com.example.academiatech.dao;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.academiatech.model.PrescriptionTraining;

import java.util.List;

@Dao
public interface PrescriptionTrainingDao {

    @Transaction
    @Query("SELECT * FROM Prescription")
    public List<PrescriptionTraining> getPrescriptionTraining();
}
