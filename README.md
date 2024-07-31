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
- **Inter-Service Communication**: OpenFeign

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

### Download Links for Requirements

- **Java JDK 21**: [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
- **IntelliJ IDEA**: [JetBrains IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- **Apache Kafka**: [Apache Kafka](https://kafka.apache.org/downloads)
- **MySQL**: [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)
- **MongoDB**: [MongoDB Community Edition](https://www.mongodb.com/try/download/community)
- **Zipkin**: [Zipkin](https://zipkin.io/pages/quickstart)
- **Keycloak**: [Keycloak](https://www.keycloak.org/downloads)
- **Docker**: [Docker](https://www.docker.com/get-started)
- **Docker Compose**: [Docker Compose](https://docs.docker.com/compose/install/)

## Installation and Setup

1. **Install Required Software**:
   - Download and install Java JDK, IntelliJ IDEA, Apache Kafka, MySQL, MongoDB, Zipkin, Keycloak (optional), Docker from the links provided above.

2. **Database Setup**:
   - Start MySQL and MongoDB services.
   - Create databases as needed and configure connections in each microservice.

3. **Start Required Services**:
   - Start Apache Kafka.
   - Start Zipkin for distributed tracing.
   - (Optional) Start Keycloak for identity and access management.

4. **Microservice Setup**:
   - Clone the DigiMarket repository.
   - Build and start each microservice in the following order:
     - Configuration Server
     - Discovery Server
     - Other services (API Gateway, Customer Service, etc.)

5. **Inter-Service Communication**:
   - OpenFeign is used for declarative REST client in Spring Boot, facilitating inter-service communication.

### Using Docker Compose

If you prefer to use Docker Compose, a `docker-compose.yml` file is provided to simplify the setup. This file includes configurations for MySQL, MongoDB, Kafka, Zipkin, and all microservices.

To start the services using Docker Compose:


```sh
   docker-compose up
```
## License

This project is free to use, modify, and sell. It is licensed under the MIT License - see the [LICENSE](https://www.apache.org/licenses/LICENSE-2.0.html) file for details.