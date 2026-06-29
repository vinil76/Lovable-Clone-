# Lovable Clone

A backend clone of [Lovable.dev](https://lovable.dev) — an AI-powered web application builder. Built with Spring Boot.

## Tech Stack

- **Java 21**
- **Spring Boot 4.1.0**
- **Spring Data JPA**
- **Spring Web MVC**
- **PostgreSQL**
- **MinIO** (file storage)
- **Lombok**

## Domain Overview

| Entity | Description |
|---|---|
| `User` | Core user account with soft delete |
| `Plan` | Subscription tiers (token limits, project limits, etc.) |
| `Subscription` | Links users to plans via Stripe |
| `UsageLog` | Tracks AI token usage and actions per project |
| `Project` | Core project entity with soft delete |
| `ProjectOwnership` | Many-to-many ownership mapping (user ↔ project) |
| `ProjectMember` | Project collaborators with roles (`EDITOR`, `VIEWER`) |
| `ProjectFile` | Project files stored in MinIO |
| `Preview` | Live preview environment (Kubernetes pod per project) |
| `ChatSession` | AI chat session per project-user pair |
| `ChatMessage` | Individual messages with tool call support (JSONB) |

## Project Structure

```
src/
└── main/
    ├── java/com/vinilcode/projects/lovable_clone/
    │   ├── LovableCloneApplication.java
    │   ├── entities/
    │   └── enums/
    └── resources/
        └── application.yaml
```

## Getting Started

### Prerequisites

- Java 21
- PostgreSQL
- Maven

### Run

```bash
./mvnw spring-boot:run
```

## Status

- [x] JPA Entities & Mappings
- [ ] Repositories
- [ ] Service Layer
- [ ] REST Controllers
- [ ] Authentication
- [ ] AI Integration
