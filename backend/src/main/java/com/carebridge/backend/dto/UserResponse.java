package com.carebridge.backend.dto;

import java.util.UUID;
import com.carebridge.backend.entity.UserRole;
import com.carebridge.backend.entity.UserStatus;

public class UserResponse {
    private UUID id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private boolean emailVerified;
    private UserRole role;
    private UserStatus status;
    private String createdAt;
    private String updatedAt;

    public UserResponse(UUID id, String firstName, String middleName, String lastName, String mobileNumber, String email, boolean emailVerified, UserRole role, UserStatus status, String createdAt, String updatedAt) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.emailVerified = emailVerified;
        this.role = role;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters
    public UUID getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public UserRole getRole() {
        return role;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public UserStatus getStatus() {
        return status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}

