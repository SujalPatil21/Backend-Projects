# Quiz Application (Spring Boot + PostgreSQL)

## Description
A backend-driven Quiz Application built using Spring Boot that allows creating quizzes dynamically, fetching random questions, storing quiz-question relationships, and retrieving quiz questions without exposing correct answers.

---

## Features
- Create quiz using category and number of questions
- Fetch random questions from database
- Many-to-Many mapping between Quiz and Questions
- Return questions without exposing correct answers
- RESTful API design

---

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok

---

## API Endpoints

### Create Quiz
POST /quiz/create

Request Params:
category=java  
numQ=5  
title=JQuiz  

---

### Get Quiz Questions
GET /quiz/{id}

Example:
/quiz/6

---

## Database Design

### Quiz Table
- id (Primary Key)
- title

### Questions Table
- id
- question_title
- option1
- option2
- option3
- option4
- correct_answer
- category

### Join Table: quiz_questions
- quiz_id
- questions_id

---

## Key Concepts Used
- JPA Entity Mapping
- Many-to-Many Relationship
- DTO Pattern (questionsWrapper)
- Lazy vs Eager Loading
- Transaction Management
- REST API Design

---

## Important Learnings
- Data must be properly assigned before saving entities
- Incorrect setters can silently break persistence
- Lazy loading requires transaction handling
- Debugging should follow data flow, not assumptions

---

## Author
Sujal Patil 