package com.example.academiatech.model;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class ExerciseItemTraining {

    @Embedded
    public Training training;

    @Relation(
            parentColumn = "id",
            entityColumn = "trainingId"
    )
    public List<ExerciseItem> exerciseItems;
}
