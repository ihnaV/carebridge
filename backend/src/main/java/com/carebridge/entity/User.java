package com.carebridge.entity;
import java.time.Instant;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name = "users")
public class User{
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Id
    @Column(name = "id")
    private UUID id;
    private String mobileNumber;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
    private UserRole role; //PATIENT, DOCTOR, ADMIN
    private UserStatus status; //ACTIVE, INACTIVE, LOCKED
    @GeneratedValue
    private Instant createdAt;
    @GeneratedValue
    private Instant updatedAt;


    public User(String firstName, String lastName, String mobileNumber, String email, String password, UserRole role, UserStatus status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.id = java.util.UUID.randomUUID();
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    public User() {
        //TODO Auto-generated constructor stub
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        this.updatedAt = Instant.now();
    
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        this.updatedAt = Instant.now();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        this.updatedAt = Instant.now();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
        this.updatedAt = Instant.now();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.updatedAt = Instant.now();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        this.updatedAt = Instant.now();
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
        this.updatedAt = Instant.now();
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
        this.updatedAt = Instant.now();
    }
}
