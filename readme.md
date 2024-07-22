Postcode API

============

### Summary

This project is a backend service developed using Java and Spring Boot, designed to manage suburb and postcode combinations. The API allows clients to retrieve suburb information by postcode, retrieve a postcode given a suburb name, and securely add new suburb and postcode combinations.

### Tech Stack

-   Spring Boot
-   Java
-   MySQL
-   JUnit
-   Log4j
-   Swagger

### Documentation

[Swagger API](http://localhost:8080/swagger-ui.html)

### Build Steps

1.  Clone the repository.

```shell
git clone https://github.com/Abbby3/postcode.git
```

2.  Navigate to the backend directory.

```shell
cd postcode/postcode
```

3.  Copy the .env file and set the login info to your mysql database

```shell
cp .env.example .env
```

4.  Run the application.

```shell
mvn spring-boot:run
```

Features

--------

-   **Retrieve Suburb by Postcode**: Provides suburb information based on the given postcode.

-   **Retrieve Postcode by Suburb**: Provides the postcode based on the given suburb name.

-   **API for Adding Combinations**: Allows addition of new suburb and postcode combinations.

-   **Error Handling**: Robust error handling with appropriate status codes and messages.

-   **Logging**: Comprehensive logging using Log4j.

-   **Testing**: Unit tests for controller and service layers using JUnit.

-   **API Documentation**: Automatically generated API documentation using Swagger.