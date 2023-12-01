package com.example.academiatech.model;

import androidx.room.Embedded;
import androidx.room.Relation;

public class ExerciseItemTraining {

    @Embedded
    public Training training;

    @Relation() //Todo
}
