
# How to Run the Meli-Challenge Spring Boot Project

## Requirements

* Java 17+
* Maven 3.8+

## Steps

1. Open a terminal in the project's root folder:

```bash
cd meli-challenge
```

2. Compile and run with Maven:

```bash
mvn clean install
mvn spring-boot:run
```

3. Or build a JAR and run:

```bash
mvn clean package
java -jar target/meli-challenge-1.0.jar
```

## API Documentation

You can access and explore the API documentation using Swagger UI:

* Swagger UI (interactive): `http://localhost:8090/swagger-ui/index.html`
* Alternative redirect: `http://localhost:8090/documentation`
* Raw OpenAPI JSON: `http://localhost:8090/v3/api-docs`
* OpenAPI YAML: `http://localhost:8090/v3/api-docs.yaml`

