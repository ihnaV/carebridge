package com.carebridge.backend.models;

public class User{
    private String firstName;
    private String lastName;
    private String id;
    private String mobileNumber;
    private String email;
    private String password;
    private String role; //PATIENT, DOCTOR, ADMIN
    private String status; //ACTIVE, INACTIVE, LOCKED

    public User() {
    }

    public User(String firstName, String lastName, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.id = java.util.UUID.randomUUID().toString();
        this.email = "";
        this.password = "";             
        this.role = "";
        this.status = "ACTIVE"; // Default status is ACTIVE
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
