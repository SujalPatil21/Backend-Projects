# Spring Boot IOC & Dependency Injection Practice

This is a simple Spring Boot practice project created to understand **Inversion of Control (IOC)** and **Dependency Injection (DI)** using Spring’s IOC container.

The project is intentionally minimal so the focus stays on how Spring manages objects and wires dependencies automatically.

---

## Project Purpose

The goal of this project is to understand:

- How Spring creates objects using the IOC container
- How Dependency Injection works in Spring Boot
- Why the `new` keyword is avoided in Spring-managed classes
- How Controller and Component interact through Spring

This is a **concept-focused practice project**, not a feature-heavy application.

---

## Core Concepts

### Inversion of Control (IOC)

- Spring controls object creation
- Classes do not create their own dependencies
- Objects are managed by the Spring IOC container

### Dependency Injection (DI)

- Spring provides required objects automatically
- Dependencies are injected by the framework
- Classes remain loosely coupled

IOC and DI together allow Spring applications to remain clean, testable, and maintainable.

---

## Output

![Program Output](Output.png)

---

## Key Learnings

- `@Component` registers a class as a Spring-managed bean
- Spring handles object creation and dependency wiring
- No manual object creation using `new`
- Clear separation between controller and component
- IOC and DI are foundational concepts in Spring Boot

---

## Author

Sujal Patil  
Email: sujalbpatil21@gmail.com  
GitHub: https://github.com/SujalPatil21

---

## Status

Completed  
IOC container understood  
Dependency Injection practiced  
Spring Boot foundation concept project

