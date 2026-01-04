🧩 IT Support Ticket Management System
(Spring Boot REST API)
📌 Project Overview
The IT Support Ticket Management System is a backend application built using Spring Boot that simulates how organizations manage internal IT support requests. The system allows users to create, view, update, and delete support tickets through RESTful APIs.
This project focuses on building a clean backend architecture using industry-standard practices such as controller–service separation, enum-based state management, and API testing.
🎯 Objectives of the Project
To understand Spring Boot fundamentals
To design RESTful APIs using Spring Web
To apply Object-Oriented Programming (OOP) principles
To manage application state using Enums
To test APIs using Postman
To build a backend system similar to real-world IT support tools
⚙️ Tech Stack
Java 17
Spring Boot 3.x
Spring Web (REST APIs)
Maven
Postman (API testing)
JUnit 5 (unit testing)
🏗️ Project Architecture
The project follows a layered architecture:
Controller Layer  →  Service Layer  →  Model Layer
Layer Responsibilities
Controller Layer
Handles HTTP requests and responses
Exposes REST endpoints
Service Layer
Contains business logic
Manages ticket creation, updates, and deletion
Model Layer
Represents core domain objects (Ticket)
Enums
Manage ticket status and priority in a type-safe way
🎫 Ticket Details
Each ticket
🔁 Application Workflow
User sends a request via API (Postman)
Controller receives the request
Service processes the business logic
Ticket data is returned as JSON response
API responses are sent back to the client

🔌 REST API Endpoints
Create a Ticket
POST /tickets
Get All Tickets
GET /tickets
Get Ticket by ID
GET /tickets/{id}
Update Ticket
PUT /tickets/{id}
Delete Ticket
DELETE /tickets/{id}
Health Check
GET /tickets/ping
🧪 API Testing
All endpoints were tested using Postman.
Example request body for creating a ticket:
{
  "title": "WiFi Issue",
  "description": "Office WiFi is not working",
  "priority": "HIGH"
}
🧠 Key Learnings
Through this project, I learned:
How to build REST APIs using Spring Boot
Proper usage of @RestController, @Service, and @RequestMapping
Enum-based state management instead of string values
Layered backend architecture
Debugging Spring Boot configuration issues
Testing APIs using Postman
Managing dependencies using Maven
🚀 Future Enhancements
Integrate MySQL / PostgreSQL database
Add Spring Data JPA
Implement Swagger (OpenAPI) documentation
Add exception handling
Implement user authentication & roles
Add persistence instead of in-memory storage
▶️ How to Run the Project
Prerequisites
Java 17
Maven
Steps
./mvnw clean spring-boot:run
Application will start on:
http://localhost:8080/
🧑‍💻 Author
Juzz
Computer Science Student
Backend & Java Enthusiast
