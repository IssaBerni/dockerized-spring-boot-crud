<<<<<<< HEAD
dockerized-spring-boot-crud

Project Overview

This project is a basic Spring Boot application that includes CRUD functionality for managing User entities. The application interacts with a PostgreSQL database using JPA and Spring Data. It provides RESTful endpoints to create, read, update, and delete users.

The application is designed with Docker and includes configuration files for building and running containers using docker-compose. The backend service exposes APIs that can be consumed by any client.
Project Structure
1. DemoApplication.java

    Description: The main entry point of the Spring Boot application. It contains the main method to launch the application.
    Key Features:
        Annotated with @SpringBootApplication to enable Spring Boot’s auto-configuration and component scanning.
        Contains a simple console message hello world to confirm application startup.

2. User.java

    Description: This is a JPA entity class that represents a User in the system.
    Key Features:
        Mapped to the users table in the database.
        Includes properties such as id, name, and email.
        Includes getter and setter methods for each property.

3. UserController.java

    Description: This is the controller class that handles HTTP requests related to User entities.
    Key Features:
        Provides RESTful APIs to perform CRUD operations on users:
            GET /api/users: Retrieve all users.
            GET /api/users/{id}: Retrieve a user by their ID.
            POST /api/users: Create a new user.
            PUT /api/users/{id}: Update an existing user.
            DELETE /api/users/{id}: Delete a user by their ID.

4. UserRepository.java

    Description: This is a Spring Data repository interface that handles the database operations for User entities.
    Key Features:
        Extends JpaRepository<User, Long> to provide built-in CRUD functionality.
        No implementation is needed since Spring Data JPA generates it automatically.

5. application.properties

    Description: The configuration file for the Spring Boot application.
    Key Features:
        Configures database connection settings such as URL, username, and password for PostgreSQL.
        Configures the port on which the application runs.

6. Dockerfile

    Description: Defines the instructions to build a Docker image for the Java application.
    Key Features:
        Starts with a base image of OpenJDK 17.
        Copies the application JAR file into the image.
        Specifies the command to run the application using java -jar.

7. docker-compose.yml

    Description: Defines a multi-container Docker application.
    Key Features:
        Contains two services: java_app and java_db.
        java_app: Builds and runs the Java application.
        java_db: Runs a PostgreSQL database container.
        Specifies port mappings for both services and environment variables for database credentials.
        Uses a named volume pgdata to persist the database data.

Installation Instructions
Prerequisites

    Java: OpenJDK 17 or later installed.
    Docker: Docker must be installed on the system to run the containers.
    Docker Compose: Docker Compose is used to orchestrate multi-container applications.

Steps to Run the Application

    Clone the Repository: Clone the project repository from GitHub (or any other source).

    Build the Docker Image:
        Navigate to the project root directory where the Dockerfile is located.
        Run the following command to build the Docker image:

    docker compose build

Run the Application with Docker Compose:

    Use Docker Compose to start both the Java application and the PostgreSQL database:

    docker compose up

    This will start both containers and bind the application’s port 8081 to port 8080 in the container.

Access the Application:

    Once the containers are running, access the Java application through:

        http://localhost:8081

        The API endpoints will be available at:
            GET /api/users: Fetch all users.
            GET /api/users/{id}: Fetch a user by ID.
            POST /api/users: Create a new user.
            PUT /api/users/{id}: Update a user.
            DELETE /api/users/{id}: Delete a user.

API Endpoints
1. GET /api/users

    Description: Fetch all users from the database.
    Response: A list of users in JSON format.

2. GET /api/users/{id}

    Description: Fetch a single user by their ID.
    Response: A single user in JSON format.

3. POST /api/users

    Description: Create a new user.
    Request Body:

    {
      "name": "John Doe",
      "email": "john.doe@example.com"
    }

    Response: The created user object in JSON format.

4. PUT /api/users/{id}

    Description: Update an existing user by ID.
    Request Body:

    {
      "name": "Updated Name",
      "email": "updated.email@example.com"
    }

    Response: The updated user object in JSON format.

5. DELETE /api/users/{id}

    Description: Delete a user by their ID.
    Response: A confirmation message, e.g., "User deleted successfully".

Database Configuration

The application uses PostgreSQL as its database. The database is configured in the docker-compose.yml file with the following credentials:

    Database URL: jdbc:postgresql://java_db:5432/postgres
    Username: postgres
    Password: postgres

Troubleshooting
Common Issues

    Port Conflicts:
        If the port 8080 is already in use on your system, you can modify the docker-compose.yml file to use a different port:

        ports:
          - "8081:8080"

    Database Connection Issues:
        Ensure that the PostgreSQL container is running and the DATABASE_URL, DATABASE_USERNAME, and DATABASE_PASSWORD environment variables are correctly configured in the docker-compose.yml file.

Conclusion

This is a basic Spring Boot application demonstrating the use of JPA for database operations and Docker for containerization. The application provides a REST API for performing CRUD operations on a User entity, making it easy to interact with the database via HTTP requests. You can extend this project by adding more functionality, such as authentication, advanced database operations, or frontend integration
=======
# Java API Service Starter

This is a minimal Java API service starter based on [Google Cloud Run Quickstart](https://cloud.google.com/run/docs/quickstarts/build-and-deploy/deploy-java-service).

## Getting Started

Server should run automatically when starting a workspace. To run manually, run:
```sh
mvn spring-boot:run
```
>>>>>>> 733584a (Initial commit)
