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
    │   ├── entity/
    │   ├── enums/
    │   ├── dto/
    │   │   ├── auth/
    │   │   ├── member/
    │   │   ├── project/
    │   │   └── subscription/
    │   ├── service/
    │   └── controller/
    └── resources/
        └── application.yaml
```

## API Endpoints (scaffolded)

| Controller | Routes |
|---|---|
| `AuthController` | `POST /api/auth/signup`, `POST /api/auth/login`, `GET /api/auth/me` |
| `ProjectController` | `GET /api/project`, `GET /api/project/{id}`, `POST /api/project`, `DELETE /api/project/{id}` |
| `ProjectMemberController` | `GET /api/projects/{projectId}/members`, `POST /api/projects/{projectId}/members`, `DELETE /api/projects/{projectId}/members/{memberId}` |
| `FileController` | `GET /api/projects/{projectId}/files`, `GET /api/projects/{projectId}/files/*path*` |
| `BillingController` | `GET /api/plans`, `GET /api/me/subscription`, `POST /api/stripe/checkout`, `POST /api/stripe/portal` |
| `UsageController` | `GET /api/usage/today`, `GET /api/usage/limits` |

> Service layer is currently interfaces only — implementations and repositories are not yet wired up.

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
- [~] Service Layer — interfaces defined (Auth, Project, ProjectMember, File, Plan, Subscription, Usage, User); implementations pending
- [~] REST Controllers — endpoints scaffolded (Auth, Project, ProjectMember, File, Billing, Usage)
- [ ] Authentication
- [ ] AI Integration
