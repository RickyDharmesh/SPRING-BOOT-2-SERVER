# SPRING-BOOT-2-SERVER

Student & Marks Management System (Microservices)
Project Overview

This project is a Spring Boot Microservices Application consisting of two independent services:

Student Service (Port 8080)
Marks Service (Port 8081)

The application demonstrates communication between two Spring Boot applications using RestTemplate.

Technologies Used
Java 21
Spring Boot
Spring Web
Spring Data JPA
H2 Database / MySQL
Maven
RestTemplate
Architecture



                                         Client (Postman)
                                                │
                                ┌───────────────┴───────────────┐
                                ▼                               ▼
                         Student Service (8080)          Marks Service (8081)
                                │                               │
                         Student Database                 Marks Database
                                ▲                               │
                                └──────────── REST API ─────────┘



APIs
Method	URL	Description
POST	/api/v1/marks	Add Marks
GET	/api/v1/marks/getmarks	Get All Marks
GET	/api/v1/marks/getmarks/{id}	Get Marks by ID
DELETE	/api/v1/marks/{id}	Delete Marks
Communication Between Services

The Marks Service communicates with the Student Service using RestTemplate.

Flow:

Student information is stored in Student Service.
Marks are stored in Marks Service.
Marks Service sends an HTTP GET request to Student Service using the studentId.
Student Service returns the student's name and email.
Marks Service combines student details with marks and returns the final response.

Project Structure
Student Service

    StudentService
    │
    ├── controller
    ├── service
    ├── repository
    ├── entity
    └── StudentApplication.java
    
Marks Service

    MarksService
    │
    ├── controller
    ├── service
    ├── repository
    ├── dto
    ├── entity
    ├── config
    └── MarksApplication.java
    
Running the Project
Step 1

Start Student Service.

http://localhost:8080
Step 2

Start Marks Service.

http://localhost:8081
Step 3

Create a student using the Student Service.

Step 4

Create marks using the generated studentId.

Step 5

The Marks Service calls the Student Service internally and returns the combined student and marks information.

Features
    Two independent Spring Boot services
    REST API communication using RestTemplate
    Separate databases for each service
    CRUD operations
    Student and Marks management
    Automatic total marks calculation
    Layered architecture (Controller → Service → Repository → Entity)
    Microservices communication using HTTP
Future Enhancements
    Grade calculation (A, B, C, etc.)
    Pass/Fail status
    JWT Authentication
    API Gateway
    Service Discovery (Eureka)
    OpenFeign instead of RestTemplate
    MySQL deployment
    Docker support
