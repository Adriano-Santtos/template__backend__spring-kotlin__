# Foo Backend Template (Spring Boot + Kotlin)

> **NOTE:** Replace all occurrences of `Foo`, `foo`, and related names with your actual project name when using this template.

[//]: # (TODO: &#40;Dont forget to update package names and configurations accordingly.&#41;)

## Overview
This repository provides a generic backend template using Spring Boot and Kotlin, designed for rapid project setup and easy customization. It includes a basic REST API structure, PostgreSQL integration, Flyway migrations, and a modular code organization.

## Features
- Spring Boot with Kotlin
- PostgreSQL integration (via Docker Compose)
- Flyway for database migrations
- Layered architecture (Controller, Service, Repository, DTO, Entity, etc.)
- Exception handling and API documentation (Swagger)
- Example unit and integration tests

## Getting Started

### Prerequisites
- Docker & Docker Compose
- Java 17+
- Gradle

### Setup
1. **Clone this repository:**
   ```sh
   git clone <this-repo-url>
   cd <repo-folder>
   ```
2. **Update project name:**
   - Replace all `Foo`, `foo`, and related names with your actual project/module name throughout the codebase and configuration files.
   - Update package names if needed.
3. **Start PostgreSQL and run migrations:**
   ```sh
   docker-compose up -d
   ```
4. **Run the application:**
   ```sh
   ./gradlew bootRun
   ```

## Project Structure
```
├── build.gradle.kts
├── docker-compose.yml
├── flyway/
│   └── sql/
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   └── com/template/change_it/
│   │   │       ├── controller/
│   │   │       ├── dto/
│   │   │       ├── entities/
│   │   │       ├── enums/
│   │   │       ├── exceptions/
│   │   │       ├── mapper/
│   │   │       ├── repository/
│   │   │       └── service/
│   │   └── resources/
│   └── test/
│       └── kotlin/
│           └── com/template/change_it/
└── README.md
```

## Customization
- **Rename all `Foo` references:**
  - Use your IDE's refactor/rename feature or search and replace.
  - Update Docker Compose, Flyway, and configuration files accordingly.
- **Add your business logic:**
  - Implement new endpoints, services, and database entities as needed.

## Useful Commands
- Run tests:
  ```sh
  ./gradlew test
  ```
- Build the project:
  ```sh
  ./gradlew build
  ```
