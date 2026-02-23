# 🚀 Smart Job Application Tracker

A secure, production-ready Spring Boot backend system that enables users to manage, track, and analyze job applications across multiple hiring stages with role-based authentication, analytics, and audit logging.

---

## 📌 Overview

The **Smart Job Application Tracker** is designed to help users organize their job search efficiently by providing:

- 🔐 Secure JWT Authentication
- 👤 Role-Based Authorization (USER / ADMIN)
- 📂 Job Application Management
- 🔄 Status Pipeline Tracking
- 📊 Analytics & Insights
- 🧾 Audit Logging
- 🗄 PostgreSQL Persistence

This project demonstrates clean architecture, security best practices, and scalable backend design.

---

## 🏗 Architecture
Controller → Service → Repository → Database
↓
Security Layer (JWT Filter)


### Layers

- **Controller** → Handles HTTP requests  
- **Service** → Business logic  
- **Repository** → Data access layer (Spring Data JPA)  
- **Security Layer** → JWT authentication & role protection  
- **Global Exception Handler** → Standardized API responses  

---

## 🛠 Tech Stack

- Java 17
- Spring Boot 3
- Spring Security (JWT)
- Spring Data JPA
- Hibernate
- PostgreSQL
- Swagger / OpenAPI
- Maven

---

## 🔐 Authentication & Authorization

### Features

- User Registration (Email + Password)
- BCrypt password encryption
- JWT Access Token generation
- Role-based endpoint protection
- Refresh Token support (planned)

### Roles

- `USER`
- `ADMIN`

---

## 📂 Job Application Management

Users can:

- Create job applications
- Update application details
- Track hiring status
- Soft delete applications
- Filter by status or company
- Sort by application date
- Access paginated results

---

## 🔄 Status Pipeline

Supported statuses:

- Applied
- OA
- Interview
- HR Round
- Offer
- Rejected
- Withdrawn

Status transitions are validated to maintain consistency.

---

## 📊 Analytics (Planned / In Progress)

- Monthly application trends
- Offer ratio calculation
- Interview conversion rate
- Company-wise analytics
- Response time analysis

---

## 🧾 Audit & Logging

The system logs:

- Application creation
- Status changes
- Login attempts
- System-level actions

---

## ⚙ Error Handling

- Global exception handling
- Standardized API response wrapper
- Validation error handling
- Authentication error handling
- Resource not found handling

---

## 📑 API Documentation

Swagger UI available at:
http://localhost:8080/swagger-ui.html

All endpoints are documented using OpenAPI.

---

## 🗄 Database

- PostgreSQL
- Indexed fields:
  - `user_id`
  - `company_name`
  - `status`
  - `application_date`

---

## 🚀 Running the Application

### 1️⃣ Clone the repository


git clone https://github.com/vibha-2001/job-application-tracker.git

### 2️⃣ Configure database

- Create your own application.yml (not committed for security).

Example:

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/jobtracker
    username: your_username
    password: your_password


### 3️⃣ Build and Run
- mvn clean install
- mvn spring-boot:run

## 👩‍💻 Author

- Vibha Pandey
- Backend Developer | Java | Spring Boot | 