package com.example.academiatech.model;

import java.util.Objects;

public class Exercise {

    private Long id;
    private String exerciseName;
    private String machineNumber;
    private String muscleGroup;
    private String videoUri;

    public Exercise() {
    }

    public Exercise(Long id, String exerciseName, String machineNumber, String muscleGroup, String videoUri) {
        this.id = id;
        this.exerciseName = exerciseName;
        this.machineNumber = machineNumber;
        this.muscleGroup = muscleGroup;
        this.videoUri = videoUri;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public String getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(String videoUri) {
        this.videoUri = videoUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return Objects.equals(id, exercise.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", exerciseName='" + exerciseName + '\'' +
                ", machineNumber='" + machineNumber + '\'' +
                ", muscleGroup='" + muscleGroup + '\'' +
                ", videoUri='" + videoUri + '\'' +
                '}';
    }
}
