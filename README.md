# Spring Boot REST API for Book Management with File Upload

This Spring Boot project demonstrates the creation of REST APIs for managing book entities, featuring CRUD operations and file upload functionality. The `Book` entity includes a one-to-one relationship with the `Author` entity.

## Features

- RESTful API endpoints for book and author management:
  - Create book (POST)
  - Retrieve book (GET)
  - Update book (PUT)
  - Delete book (DELETE)
- One-to-one relationship between book and author
- File upload functionality
- Auto-generated IDs for entities
- Validation and error handling in file upload

## Technologies Used

- Spring Boot
- Spring Data JPA
- MySQL Database
- Maven
- Devtools
- Jackson (for JSON serialization/deserialization)

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- MySQL

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/VarshaRani9/SpringBoot_REST.git
    cd SpringBoot_REST
    ```

2. Set up your MySQL database:

3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

The application will start on `http://localhost:8080`.
