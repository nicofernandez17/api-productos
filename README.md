# 🛒 Meli-Challenge

A lightweight REST API built with **Spring Boot**.
It provides read-only access to product data stored locally in a JSON file — no database required.

---

##  Architecture Overview

The project follows a **simple layered architecture**, designed for clarity and maintainability:

* **Controller Layer** → Handles HTTP requests and responses (`ProductController`).
* **Service Layer** → Contains the business logic and coordinates data retrieval (`ProductService`).
* **Repository Layer** → Reads and parses product data from a local JSON file (`ProductRepository`).
* **Domain Layer** → Defines the `Product` model used across the application.

This structure keeps responsibilities separated and makes it easy to extend or replace components.

---

##  Features

* **Spring Boot 3 + Java 17**
* Products stored in **JSON** (no DB setup)
* Integrated **Swagger/OpenAPI** documentation
* Simple and fast to run with **Maven**

---

##  Tech Stack

* Java 17
* Spring Boot 3
* Spring Web
* Springdoc OpenAPI (Swagger UI)
* Maven

---

##  API Endpoints

| Method | Endpoint         | Description                      |
| ------ | ---------------- | -------------------------------- |
| GET    | `/products`      | Returns all available products   |
| GET    | `/products/{id}` | Returns a specific product by ID |

---

##  API Documentation

You can explore the API using Swagger UI:

* **Swagger UI:** [http://localhost:8090/swagger-ui/index.html](http://localhost:8090/swagger-ui/index.html)
* **Redirect:** [http://localhost:8090/documentation](http://localhost:8090/documentation)

---

##  How to Run

See the [RUN.md](./RUN.md) file for quick start instructions.

---

##  Author

Developed by **Nicolás Fernández**
