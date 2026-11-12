# Commercial management API with Spring Boot

REST API study project for users, products, categories and orders, with entity relationships and H2 persistence.

## Features

- User and product queries and management.
- Category and order queries.
- Models for order items, payments and order status.
- Exception handling with HTTP responses.

## Technologies

Java 17, Spring Boot, Spring Web, Spring Data JPA, Hibernate and H2.

## Run locally

```bash
sh mvnw spring-boot:run
```

Check src/main/resources/application.properties and application-test.properties for the active profile and database settings. Study-environment data is configured in TestConfig.

## Tests

```bash
sh mvnw test
```

## Structure

- `resources/`: REST interface.
- `services/`: operations and exceptions.
- `repositories/`: data access.
- `entities/`: domain and relationships.
- `config/`: test-environment data configuration.

## Scope

A learning project covering APIs and relational modeling. It does not include financial checkout, real payment processing or all requirements of a production commercial platform.
