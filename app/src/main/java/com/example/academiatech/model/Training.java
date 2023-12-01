package com.example.academiatech.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.academiatech.model.enums.Status;

import java.time.Instant;
import java.util.Objects;

@Entity
public class Training {

    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String trainingName;
    private Integer totalTraining;
    private Instant concludeAt = Instant.now();
    private Status status;
    private int prescriptionId;

    public Training() {
    }

    public Training(Long id, String trainingName, Integer totalTraining, Instant concludeAt, Status status) {
        this.id = id;
        this.trainingName = trainingName;
        this.totalTraining = totalTraining;
        this.concludeAt = concludeAt;
        this.status = status;
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

    public Instant getConcludeAt() {
        return concludeAt;
    }

    public void setConcludeAt(Instant concludeAt) {
        this.concludeAt = concludeAt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
                ", status=" + status +
                '}';
    }
}
