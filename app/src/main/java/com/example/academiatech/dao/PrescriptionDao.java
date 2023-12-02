package com.example.academiatech.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.academiatech.model.Prescription;

import java.util.List;

@Dao
public interface PrescriptionDao {

    @Query("SELECT * FROM Prescription")
    List<Prescription> getPrescriptions();

    @Query("SELECT * FROM Prescription WHERE id=:idPrescription")
    Prescription searchPrescriptionById(int idPrescription);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPrescription(Prescription prescription);

    @Delete
    void deletePrescription(Prescription prescription);

    @Update
    void updatePrescription(Prescription prescription);
}
