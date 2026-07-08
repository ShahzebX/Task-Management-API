# Task Management API

A RESTful API built with Java and Spring Boot for managing tasks.

## Tech Stack
- Java 21
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Maven

## Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /tasks | Get all tasks |
| GET | /tasks/{id} | Get task by ID |
| POST | /tasks | Create new task |
| PUT | /tasks/{id} | Update task |
| DELETE | /tasks/{id} | Delete task |

## Setup
1. Clone the repository
2. Configure MySQL database in `application.properties`
3. Run with `./mvnw spring-boot:run`
4. Test endpoints using `requests.http` or Postman
