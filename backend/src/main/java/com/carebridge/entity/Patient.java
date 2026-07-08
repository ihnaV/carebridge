package com.carebridge.entity;

public class Patient extends User{
    private String medicalRecordNumber;
    private String dateOfBirth;
    private String gender;

    public Patient() {
        super();
    }

    public Patient(String firstName, String middleName, String lastName, String mobileNumber, String email, String password, UserRole role, UserStatus status, String medicalRecordNumber, String dateOfBirth, String gender) {
        super(firstName, middleName, lastName, mobileNumber, email, password, role, status);
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
