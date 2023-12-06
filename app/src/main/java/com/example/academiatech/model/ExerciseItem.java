package com.example.academiatech.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity
public class ExerciseItem {

    @PrimaryKey(autoGenerate = true)
    private Long id;
    private Integer seriesNumber;
    private Integer measurementType;
    private Integer rest;
    private Integer quantityNumber;
    private String obs;


    private int trainingId;

    private int exerciseId;

    public ExerciseItem() {
    }

    public ExerciseItem(Long id, Integer seriesNumber, Integer measurementType, Integer rest, Integer quantityNumber, String obs) {
        this.id = id;
        this.seriesNumber = seriesNumber;
        this.measurementType = measurementType;
        this.rest = rest;
        this.quantityNumber = quantityNumber;
        this.obs = obs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(Integer seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public Integer getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(Integer measurementType) {
        this.measurementType = measurementType;
    }

    public Integer getRest() {
        return rest;
    }

    public void setRest(Integer rest) {
        this.rest = rest;
    }

    public Integer getQuantityNumber() {
        return quantityNumber;
    }

    public void setQuantityNumber(Integer quantityNumber) {
        this.quantityNumber = quantityNumber;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExerciseItem that = (ExerciseItem) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ExerciseItem{" +
                "id=" + id +
                ", seriesNumber=" + seriesNumber +
                ", measurementType=" + measurementType +
                ", rest=" + rest +
                ", quantityNumber=" + quantityNumber +
                ", obs='" + obs + '\'' +
                ", trainingId=" + trainingId +
                ", exerciseId=" + exerciseId +
                '}';
    }
}
