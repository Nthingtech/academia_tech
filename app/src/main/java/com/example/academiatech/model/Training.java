package com.example.academiatech.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.Objects;

@Entity
public class Training {

    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String trainingName;
    private Integer totalTraining;
    private Date concludeAt;
    private int prescriptionId;

    public Training() {
    }

    public Training(Long id, String trainingName, Integer totalTraining, Date concludeAt) {
        this.id = id;
        this.trainingName = trainingName;
        this.totalTraining = totalTraining;
        this.concludeAt = concludeAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public Integer getTotalTraining() {
        return totalTraining;
    }

    public void setTotalTraining(Integer totalTraining) {
        this.totalTraining = totalTraining;
    }

    public Date getConcludeAt() {
        return concludeAt;
    }

    public void setConcludeAt(Date concludeAt) {
        this.concludeAt = concludeAt;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Training training = (Training) o;
        return Objects.equals(id, training.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", trainingName='" + trainingName + '\'' +
                ", totalTraining=" + totalTraining +
                ", concludeAt=" + concludeAt +
                ", prescriptionId=" + prescriptionId +
                '}';
    }
}
