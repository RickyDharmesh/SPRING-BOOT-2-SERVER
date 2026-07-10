Swiggy Order Management System
Overview

The Swiggy Order Management System is a Spring Boot REST API application that manages food orders and their corresponding items. It demonstrates a layered architecture using Controller, Service, Repository, and Entity layers. The application uses an H2 in-memory database to store order and item details, and automatically calculates the total order amount before saving. The uploaded code defines Order and Item entities, persists orders through a JPA repository, calculates totals in the service layer, and configures an H2 in-memory database with the H2 console enabled.

Features
        Create a new food order
        Add multiple items to a single order
        Automatic total amount calculation
        Retrieve all orders
        Retrieve an order by ID
        Delete an order
        H2 Database integration
        RESTful APIs
Technologies Used
        Java
        Spring Boot
        Spring Web
        Spring Data JPA
        H2 Database
        Maven
Project Structure
        
        Swiggy
        │
        ├── controller
        │     └── OrderController.java
        │
        ├── service
        │     └── OrderService.java
        │
        ├── repository
        │     └── OrderRepository.java
        │
        ├── entity
        │     ├── Order.java
        │     └── Item.java
        │
        └── SwiggyApplication.java
        
Database Tables
      Orders
      Column
      order_id
      customer_name
      restaurant_name
      total_amount
Items
      Column
      item_id
      item_name
      quantity
      price
      order_id


