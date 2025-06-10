# Job Application Tracker

A RESTful backend application built using **Spring Boot** for tracking and managing job applications. This project demonstrates clean architecture principles, input validation, and CRUD operations with in-memory storage for rapid iteration and testing.

---

## 🚀 Features

| Feature             | Description                                                                 |
|---------------------|-----------------------------------------------------------------------------|
| Create Job          | Add a new job entry with fields like company, role, status, and notes       |
| Read All Jobs       | Fetch all saved job applications                                            |
| Read by ID          | Retrieve a specific job entry using its ID                                 |
| Update Job          | Modify details of an existing job application                              |
| Delete Job          | Remove a job entry using its ID                                             |
| Input Validation    | Ensures required fields like company name and status are properly validated |
| Auto-Type Conversion| Converts input strings like dates into `LocalDate` format automatically     |

---

## 🛠️ Tech Stack

- **Spring Boot**  
- **Spring Web (REST)**
- **Spring Security** (for structure, not auth)
- **H2 Database** (in-memory, fast testing)
- **Lombok** (for cleaner Java code)
- **Maven** (build tool)

---

## 🧱 Architecture Overview

- Follows **Layered Architecture**: Controller → Service → Repository  
- Uses **DTOs** to separate entity and API structure  
- Exception handling with global `@ControllerAdvice`  
- Validations via `@NotNull`, `@NotBlank`, etc.  
- Clean REST mappings using `/api/jobs` endpoints  

---
🔧 Technical Enhancements
--------------------------

    🔐 JWT Authentication: Secure the API with user login & registration capabilities using JSON Web Tokens.

    📦 PostgreSQL Integration: Replace H2 with a robust, production-grade PostgreSQL database.

    📄 Swagger/OpenAPI Documentation: Auto-generate interactive API docs for better collaboration and testing.

    📊 Pagination & Filtering: Handle large datasets with pagination, sorting, and advanced filters by job status, company, and application date.

   (not decided yet) - 📁 Resume Upload Support: Allow file uploads (e.g., resumes or cover letters) associated with each job entry using Spring Multipart handling.

    📅 Reminder Service: Integrate scheduled tasks (via Quartz or Spring Scheduler) to send follow-up reminders for pending applications.

🌐 User Experience Expansion
-------------------------------

    🧑‍💼 Multi-user Support: Allow different users to register, log in, and manage their own job applications securely.

    📈 Analytics Dashboard: Build a visual dashboard (with React or Angular frontend) showing application success rate, follow-up stats, and more.

    📧 Email Notifications: Use email service (e.g., SendGrid) to notify users of upcoming deadlines or follow-up prompts.

    📲 Mobile App Integration: Expose APIs for a future React Native or Flutter mobile client.

## 🧪 How to Run

### Prerequisites:
- Java 17+  
- Maven

### Steps:
```bash
git clone https://github.com/your-username/job-application-tracker.git
cd job-application-tracker
mvn spring-boot:run


