# Spring Boot SSR Project 🍃

## Project Overview

This is a Spring Boot web application built using **Gradle** as the build tool and implements **Server-Side Rendering (SSR)** for improved SEO, faster initial load times, and better user experience. SSR allows rendering HTML on the server side before it is sent to the client, making the application accessible to users with slower connections or older devices.

## Features

- **Server-Side Rendering (SSR):** Delivers pre-rendered HTML content, improving page load speed and SEO.
- **Spring Boot:** Lightweight framework that makes building Java-based web applications easier and faster.
- **Gradle Build Tool:** Simplifies dependency management and build automation.
- **Thymeleaf (or other view engines):** Used for rendering HTML views.

## Technologies

- **Java 21**
- **Spring Boot 3.x**
- **Gradle**
- **Thymeleaf (or other SSR template engine)**
- **H2 Database (or another database if applicable)**

## Prerequisites

- Java 17+
- Gradle 7.x+
- IDE with Gradle support (IntelliJ IDEA, Eclipse, etc.)

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ChathuminiBandara/NoteCollectorV2.git
   ```
2. Navigate to the project directory:
   ```bash
   cd https://github.com/ChathuminiBandara/NoteCollectorV2.git
   ```
3. Build the project:
   ```bash
   ./gradlew build
   ```
4. Run the application:
   ```bash
   ./gradlew bootRun
   ```

## Usage

Access the application by opening your browser and navigating to:
```
http://localhost:8080
```

## Folder Structure

```
src/
├── main/
│   ├── java/
│   ├── resources/
│   │   ├── static/
│   │   ├── templates/
│   └── application.properties
```


---
