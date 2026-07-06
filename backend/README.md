# CareBridge Backend (Spring Boot)

This folder contains a minimal Spring Boot backend scaffold for local development.

Prerequisites
- Java 17+
- Maven

Run locally

1. From the workspace root (recommended):

```bash
cd backend
mvn clean package
mvn spring-boot:run
```

2. Or build and run the jar:

```bash
cd backend
mvn clean package
java -jar target/backend-0.0.1-SNAPSHOT.jar
```

Health endpoint: `GET /api/health`
