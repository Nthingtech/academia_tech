package com.example.academiatech.model;

import java.util.Objects;

public class Prescription {

    private Long id;
    private String prescriptionName;
    private Integer totalPrescription;
    private Integer concludedPrescription;

    public Prescription() {
    }

    public Prescription(Long id, String prescriptionName, Integer totalPrescription, Integer concludedPrescription) {
        this.id = id;
        this.prescriptionName = prescriptionName;
        this.totalPrescription = totalPrescription;
        this.concludedPrescription = concludedPrescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
    }

    public Integer getTotalPrescription() {
        return totalPrescription;
    }

    public void setTotalPrescription(Integer totalPrescription) {
        this.totalPrescription = totalPrescription;
    }

    public Integer getConcludedPrescription() {
        return concludedPrescription;
    }

    public void setConcludedPrescription(Integer concludedPrescription) {
        this.concludedPrescription = concludedPrescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", prescriptionName='" + prescriptionName + '\'' +
                ", totalPrescription=" + totalPrescription +
                ", concludedPrescription=" + concludedPrescription +
                '}';
    }
}
