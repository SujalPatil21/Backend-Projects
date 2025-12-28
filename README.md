# Backend Project

A production-oriented backend system built using Spring Boot, designed to evolve step-by-step from a traditional REST + SQL setup to NoSQL data modeling and event-driven systems.

This repository is maintained as a **backend engineering lab**, focusing on fundamentals, correctness, and real-world backend development practices.

---

## 🎯 Purpose

This project exists to:
- Strengthen backend fundamentals
- Learn backend technologies through implementation, not theory
- Understand how backend systems evolve in real-world scenarios
- Practice clean code structure and version control discipline

This is **not** a throwaway or tutorial repository.

---

## 🛠 Tech Stack (Phase-wise)

### Phase 1 — Core Backend (Current)
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven

### Phase 2 — NoSQL Exploration (Planned)
- MongoDB
- Spring Data MongoDB

### Phase 3 — Event-Driven Systems (Planned)
- Apache Kafka
- Asynchronous communication

---

## 🌱 Repository Evolution Strategy

This repository evolves **without changing its identity**:

- `main` branch  
  → Spring Boot with SQL-based persistence

- `mongo` branch  
  → MongoDB-based implementation

- `kafka` branch  
  → Event-driven implementation using Kafka

This approach reflects real backend system evolution.

---

## 🚀 Getting Started

1. Clone the repository
2. Configure database credentials in `application.properties`
3. Run the Spring Boot application
4. Verify application startup using the health endpoint

---

## 📌 Status

🚧 Under active development  
Features are added incrementally with clear, meaningful commits.

---

## 🧠 Philosophy

- Build before optimizing
- One feature at a time
- Depth over breadth
- Engineering discipline over shortcuts

---
# Spring Boot Calculator REST API

A simple REST-based calculator application built using Spring Boot.  
This project exposes basic arithmetic operations as HTTP endpoints and demonstrates core backend concepts like request mapping and query parameter handling.

---

## 🚀 Features

- Addition
- Subtraction
- Multiplication
- Division
- REST API only (no UI, no console input)

---

## 🛠 Tech Stack

- Java 21
- Spring Boot
- Maven
- Embedded Tomcat

---

## ▶️ How to Run the Application

1. Open the project in IntelliJ IDEA
2. Locate `ProjectApplication.java`
3. Right-click → **Run ProjectApplication**
4. Ensure the server starts successfully on port `8080`

---

## 🌐 API Endpoints

- `/calc/add`
- `/calc/sub`
- `/calc/Mul`
- `/calc/Div`

All endpoints accept two query parameters:
- `a`
- `b`

---

## 📸 Screenshots

![Addition Output](add.png)  
![Subtraction Output](sub.png)  
![Multiplication Output](mul.png)  
![Division Output](div.png)

---

## 🧠 Concepts Used

- REST API
- `@RestController`
- `@GetMapping`
- `@RequestParam`
- HTTP Request–Response lifecycle

---

## ⚠️ Notes

- Endpoints are case-sensitive
- Division by zero is not handled
- This is a backend-only application

---

## 👨‍💻 Author

**Sujal Patil**  
🌐 GitHub: [SujalPatil21](https://github.com/SujalPatil21)  
📧 Email: sujalpatil21@gmail.com
