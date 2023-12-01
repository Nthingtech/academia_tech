package com.example.academiatech.model;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class PrescriptionTraining {

    @Embedded
    public Prescription prescription;

    @Relation(
            parentColumn = "id",
            entityColumn = "prescriptionId"
    )
    public List<Training> trainings;
}
