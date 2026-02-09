# 🎬 Cinélogue API

[![Java Version](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Postgres](https://img.shields.io/badge/Database-PostgreSQL-blue.svg)](https://www.postgresql.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](#-license)

**Cinélogue** is a production-grade RESTful API designed for movie enthusiasts to archive, track, and rate their cinematic journeys. Built with a focus on clean architecture and high performance, it serves as a robust backend service for modern movie-cataloging applications.

## 🚀 Key Features

- **RESTful Resource Management**: Full CRUD operations for movie entries.
- **Data Integrity**: Strict server-side validation using Jakarta Validation and Java Enums.
- **Versioned Database**: Managed schema migrations via **Flyway**.
- **Layered Architecture**: Industry-standard separation between Controller, Service, and Repository layers.
- **DTO Pattern**: Secure data transfer using **Lombok** for boilerplate reduction.
- **Global Error Handling**: Standardized JSON error responses for better API consumption.

## 🛠️ Tech Stack

- **Language**: Java 21 (LTS)
- **Framework**: Spring Boot 3.x
- **Database**: PostgreSQL
- **Migration**: Flyway
- **Build Tool**: Maven
- **Containerization**: Docker & Docker Compose

## 📂 Project Structure

```text
cinelogue-api/
├── src/main/java/io/github/nasrul78/cinelogue/
│   ├── controller/      # Web Layer: Handles HTTP requests
│   ├── service/         # Business Layer: Logic and Transactions
│   ├── repository/      # Data Layer: JPA/Database access
│   ├── domain/          # Domain Layer: Entities, DTOs, and Enums
│   └── exception/       # Error Handling: Global exception advice
└── src/main/resources/
    ├── db/migration/    # Flyway SQL migration scripts
    └── application.yml  # Application configuration (YAML)
```

## 🚦 Getting Started (Local Development)

### Prerequisites

- **JDK 21** or higher
- **Docker & Docker Compose** (for PostgreSQL)
- **Maven** (or `mvnd` for faster builds)

### 1. Clone the repository

```bash
git clone [https://github.com/nasrul78/cinelogue-api.git](https://github.com/nasrul78/cinelogue-api.git)
cd cinelogue-api
```

### 2. Spin up the infrastucture

```bash
docker-compose up -d
```

### 3. Run the application

```bash
./mvnw spring-boot:run
```

The API will be available at: http://localhost:8080/api/v1/movies

## 📖 API Documentation

TODO: add API Documentation;

### Maintained by **Nasrul Illah**
