package com.example.academiatech.model;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class UserPrescription {

    @Embedded
    public User user;

    @Relation(
            parentColumn = "id",
            entityColumn = "userId"
    )
    public List<Prescription> prescriptions;
}
