# Object-Relational Mapping with JPA & Hibernate Store Application

## Overview

This project demonstrates the fundamental concepts and functionalities of **Java Persistence API (JPA)** using **Hibernate** as the implementation. The application stores various products, each with attributes like name, description, price, and category, and handles their persistence in a relational database.

## Motivation

The motivation behind this project is to provide a hands-on example of how JPA simplifies database interactions in Java applications by abstracting away the complexities of SQL. This project is ideal for those new to JPA or looking to deepen their understanding of how JPA and Hibernate can be applied in real-world scenarios.

## Project Structure

### Part 1: Introduction and Basic Setup

- **Introduction to JPA and Hibernate**
  - Overview of JPA and its motivation.
  - [Understanding the problems JPA solves compared to JDBC](https://oil-cilantro-ad8.notion.site/JPA-vs-JDBC-f45f07a4f24e4a918492896c3e88cf55?pvs=4)

- **Project Configuration**
  - Configuring JPA with Hibernate.
  - Creating and configuring the `persistence.xml` file to establish the database connection.

- **Entity Mapping**
  - Defining entities and mapping them to database tables.
  - Mapping attributes such as name, description, price, and category.
  - Implementing simple relationships between products and categories.

- **Entity Lifecycle Management**
  - Understanding the lifecycle of an entity (create, read, update, delete).
  - Implementing basic CRUD operations within the application.

- **JPQL Queries**
  - Introduction to Java Persistence Query Language (JPQL).
  - Writing basic JPQL queries for retrieving, updating, and deleting data.

### Part 2: Advanced Features and Optimization

- **Complex Entity Models**
  - Expanding entity models with `many-to-many` relationships and bidirectional mappings.
  - Handling more complex relationships between products and categories.

- **Aggregation Functions and Named Queries**
  - Implementing aggregation functions like sum, average, maximum, and minimum.
  - Utilizing named queries for better code organization.

- **Performance Optimization**
  - Using lazy loading to optimize entity loading and reduce memory overhead.
  - Implementing `join fetch` to pre-load related entities efficiently.

- **Criteria API**
  - Using the Criteria API for building dynamic and type-safe queries.
  - Implementing parameterized queries for enhanced flexibility.

- **Inheritance and Composite Keys**
  - Implementing inheritance strategies within entity models.
  - Managing composite keys for more advanced database schema designs.

## Technology Stack

- **Java**
- **JPA**
- **Hibernate**
- **Eclipse IDE** (recommended, but compatible with other IDEs like IntelliJ or Visual Studio Code)
- **MySQL Database** (or any other relational database)

## How to Run the Project

1. Clone the repository.
2. Import the project into your preferred IDE.
3. Configure the database connection in `persistence.xml`.
4. Run the application.

## Lessons Learned

This project reinforced the importance of understanding both the basic and advanced features of JPA, especially how to map entities and optimize queries. The use of Hibernate as the JPA implementation provided valuable insights into how JPA handles various database operations behind the scenes.

## Future Enhancements

- Integration with a front-end framework for a complete full-stack application.
- Implement additional JPA features like batch processing.
- Explore other JPA implementations for comparison.

## Conclusion

This project serves as a solid foundation for anyone looking to master JPA with Hibernate. It covers everything from setting up a basic project to handling complex entity relationships and query optimizations, making it a valuable resource for both beginners and experienced developers.


Feel free to customize this draft further to suit your project details.
