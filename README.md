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

## 🧪 How to Run

### Prerequisites:
- Java 17+  
- Maven

### Steps:
```bash
git clone https://github.com/your-username/job-application-tracker.git
cd job-application-tracker
mvn spring-boot:run

🔧 Example Payload
POST /api/jobs

{
  "company": "Google",
  "title": "Software Engineer",
  "status": "Applied",
  "notes": "Referral from a friend",
  "dateApplied": "2025-06-08"
}

📌 Future Enhancements

    PostgreSQL integration

    JWT-based authentication

    Frontend dashboard (React or Angular)

    Email reminders for follow-ups

📄 License
MIT License — Free to use for personal and educational purposes.

👩‍💻 Author
Vibha Pandey
