package com.example.academiatech.model;

import java.util.Objects;

public class ExerciseItem {

    private Long id;
    private Integer seriesNumber;
    private Integer measurementType;
    private Integer rest;
    private Integer concluded;
    private Integer quantityNumber;

    public ExerciseItem() {
    }

    public ExerciseItem(Long id, Integer seriesNumber, Integer measurementType, Integer rest, Integer concluded, Integer quantityNumber) {
        this.id = id;
        this.seriesNumber = seriesNumber;
        this.measurementType = measurementType;
        this.rest = rest;
        this.concluded = concluded;
        this.quantityNumber = quantityNumber;
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

    public Integer getConcluded() {
        return concluded;
    }

    public void setConcluded(Integer concluded) {
        this.concluded = concluded;
    }

    public Integer getQuantityNumber() {
        return quantityNumber;
    }

    public void setQuantityNumber(Integer quantityNumber) {
        this.quantityNumber = quantityNumber;
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
                ", concluded=" + concluded +
                ", quantityNumber=" + quantityNumber +
                '}';
    }
}
