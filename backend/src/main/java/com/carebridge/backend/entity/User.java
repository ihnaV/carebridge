package com.carebridge.backend.entity;
import java.time.Instant;
import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
@Table(name = "users")
public class User{
    @NotBlank
    @Column(nullable=false, length=100)
    private String firstName;

    @Column(length=100)
    private String middleName;
    
    @NotBlank
    @Column(nullable=false, length=100)
    private String lastName;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length=20)
    private String mobileNumber;
    
    @NotBlank
    @Email
    @Column(nullable=false, unique = true)
    private String email;
    private boolean emailVerified = false;

    @NotBlank
    @Column(nullable=false)
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role; //PATIENT, DOCTOR, ADMIN

    @Enumerated(EnumType.STRING)
    private UserStatus status; //ACTIVE, INACTIVE, LOCKED
    
    private Instant createdAt;
    private Instant updatedAt;

    @PrePersist
    public void onPrePersist() {
        Instant now = Instant.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    public void onPreUpdate() {
        this.updatedAt = Instant.now();
    }


    public User(String firstName, String middleName, String lastName, String mobileNumber, String email, String password, UserRole role, UserStatus status) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
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

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getPassword() {
        return password;
    }

    public UserRole getRole() {
        return role;
    }

    public UserStatus getStatus() {
        return status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
