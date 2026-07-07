package com.carebridge.backend.models;

public class Patient extends User{
    private String medicalRecordNumber;
    private String dateOfBirth;
    private String gender;

    public Patient() {
        super();
    }

    public Patient(String firstName, String lastName, String mobileNumber, String medicalRecordNumber, String dateOfBirth, String gender) {
        super(firstName, lastName, mobileNumber);
        this.medicalRecordNumber = medicalRecordNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
