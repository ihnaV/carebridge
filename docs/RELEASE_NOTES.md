# CareBridge — Release Notes
**Version:** v0.1.0 (Initial Release)
**Date:** July 13, 2026

---

## Overview

This is the first release of **CareBridge**, a secure patient management platform designed to streamline appointment scheduling, patient record management, and provider collaboration.

---

## What's New

### 🏗️ Backend Foundation
- Bootstrapped a **Spring Boot 3.5.16** backend (Java 21) with Maven as the build tool.
- Configured the application to connect to a **PostgreSQL** database via **Supabase**.

### 🔐 Security
- Added **Spring Security** configuration with basic security endpoints.
- Exposed a `/health` endpoint for uptime/connectivity checks.

### 👤 User Entity & API
- Implemented a full `User` JPA entity with:
  - Fields: `firstName`, `middleName`, `lastName`, `email`, `mobileNumber`, `password`
  - UUID-based primary key (`@GeneratedValue` strategy)
  - `UserRole` enum: `PATIENT`, `DOCTOR`, `ADMIN`
  - `UserStatus` enum: `ACTIVE`, `INACTIVE`, `LOCKED`
  - Email uniqueness constraint and `@Email` validation
  - Automatic `createdAt` / `updatedAt` timestamps via JPA lifecycle hooks
- Exposed a `POST /api/users` endpoint to create users.
- Added `UserRepository` (Spring Data JPA) and `UserService` / `UserServiceImpl` layers.
- Added **H2** as an in-memory database for testing; configured a test datasource.

### ⚙️ CI/CD
- Added a **GitHub Actions** workflow (`build-backend`) to build the backend and produce a JAR artifact on every push.
- Added a separate workflow to **attach the backend JAR to GitHub Releases** automatically.
- Fixed several CI issues: executable bit on `mvnw`, duplicate `@SpringBootApplication` entry point, and `.gitignore` configuration for workflow files.

---

## Known Limitations / Coming Soon
- Authentication is not yet fully implemented (Spring Security is in place but not wired to users).
- No appointment scheduling or patient record management features yet.
- Frontend is not yet included in this release.

---

> **Note:** Passwords are stored as plain text in this early build — authentication hardening (hashing, JWT, etc.) is planned for an upcoming sprint.
