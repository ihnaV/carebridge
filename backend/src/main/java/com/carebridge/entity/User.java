package com.carebridge.entity;
import java.time.Instant;
import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
    private String firstName;
    private String middleName;
    @NotBlank
    private String lastName;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(unique = true)
    private String mobileNumber;
    
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    private boolean emailVerified = false;
    @NotBlank
    private String password;
    private UserRole role; //PATIENT, DOCTOR, ADMIN
    private UserStatus status; //ACTIVE, INACTIVE, LOCKED
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Instant createdAt;
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
        
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
        
    }
}
