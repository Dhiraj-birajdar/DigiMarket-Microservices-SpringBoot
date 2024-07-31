# DigiMarket Microservices Backend

DigiMarket is a microservices-based e-commerce platform built using Spring Boot. It includes various services such as customer management, product catalog, order processing, payment handling, and more. The project uses a range of technologies to provide a robust and scalable solution.

## Microservices

1. **API Gateway**: Central entry point for the system.
2. **Configuration Server**: Centralized configuration management using Spring Cloud Config.
3. **Customer Service**: Manages customer-related operations.
4. **Discovery Server**: Service registry and discovery using Eureka.
5. **Notification Service**: Handles notifications to users.
6. **Order Service**: Manages order processing.
7. **Payment Service**: Handles payment transactions.
8. **Product Service**: Manages the product catalog.

## Tech Stack

- **Backend**: Java, Spring Boot
- **Persistence**: Hibernate, MongoDB, MySQL
- **Messaging**: Apache Kafka
- **Tracing**: Zipkin
- **Security**: Keycloak
- **Containerization**: Docker
- **Service Discovery**: Eureka Discovery Server

## Tools & Libraries

- **IDE**: IntelliJ IDEA
- **API Testing**: Postman
- **Containerization**: Docker
- **Optional**: Docker Compose for running the project infrastructure in Docker containers

## Requirements

- **Java**: JDK 21
- **IDE**: IntelliJ IDEA or any other preferred IDE
- **Apache Kafka**: For messaging and event-driven architecture
- **MySQL**: Relational database for structured data
- **MongoDB**: NoSQL database for unstructured data
- **Zipkin**: Distributed tracing system
- **Keycloak**: (Optional) Open source Identity and Access Management
- **Docker**: For containerization (optional)
- **Docker Compose**: For orchestrating Docker containers (optional)

## Running the Project

To run the project, ensure all required services are up and running:

1. Start the MySQL and MongoDB databases.
2. Start Apache Kafka.
3. Start Zipkin for distributed tracing.
4. (Optional) Start Keycloak for identity and access management.
5. Start each microservice in the following order:
   - Configuration Server
   - Discovery Server
   - Other services (API Gateway, Customer Service, etc.)

### Using Docker Compose

If you prefer to use Docker Compose, a `docker-compose.yml` file is provided to simplify the setup. This file includes configurations for MySQL, MongoDB, Kafka, Zipkin, and all microservices.

To start the services using Docker Compose:

```sh
docker-compose up
