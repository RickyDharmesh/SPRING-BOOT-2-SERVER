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