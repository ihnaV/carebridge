package com.carebridge.entity;

import jakarta.persistence.Entity;

@Entity
public enum UserRole {
    PATIENT,
    DOCTOR,
    ADMIN
}
