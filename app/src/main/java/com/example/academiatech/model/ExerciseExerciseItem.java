package com.example.academiatech.model;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class ExerciseExerciseItem {

    @Embedded
    public Exercise exercise;

    @Relation(
            parentColumn = "id",
            entityColumn = "exerciseId"
    )
    public List<ExerciseItem> exerciseItems;
}
