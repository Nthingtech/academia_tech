package com.example.academiatech.dao;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.academiatech.model.UserPrescription;

import java.util.List;

@Dao
public interface UserPrescriptionDao {

    @Transaction
    @Query("SELECT * FROM User")
    public List<UserPrescription> getUserPrescription();
}
