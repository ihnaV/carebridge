package com.carebridge.entity;

import jakarta.persistence.Entity;

@Entity
public enum UserStatus {
    ACTIVE,
    INACTIVE,
    LOCKED
}
