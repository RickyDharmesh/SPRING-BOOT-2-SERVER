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

API Endpoints
Create Order

POST
        
        /api/v1/orders/create
Request
            ```
            {
                  "customerName": "Ricky",
                  "restaurantName": "Domino's",
                  "items": [
                    {
                      "itemName": "Pizza",
                      "quantity": 2,
                      "price": 299
                    },
                    {
                      "itemName": "Garlic Bread",
                      "quantity": 1,
                      "price": 149
                    }
                  ]
                }
                ```
Get All Orders

GET

        /api/v1/orders/getorders
Get Order By ID

GET

    /api/v1/orders/{id}

Example:

     /api/v1/orders/1
Delete Order

DELETE

        /api/v1/orders/{id}
Business Logic
                
                One order can contain multiple food items.
                Total amount is calculated automatically using:
                Total = Σ (Price × Quantity)
                Orders and items are stored using a One-to-Many relationship.
                H2 Database

H2 Console:

http://localhost:8080/h2-console

JDBC URL:

jdbc:h2:mem:swiggydb

Username:

sa

Password:

(empty)
Running the Application

                Clone the repository.
                git clone https://github.com/your-username/Swiggy-Order-Management.git
                Navigate to the project directory.
                cd Swiggy-Order-Management
                Run the Spring Boot application.
Open the H2 Console:

http://localhost:8080/h2-console
Test the APIs using Postman.

Future Enhancements

        Update Order API
        Search Orders by Customer Name
        Restaurant Management
        Customer Management
        Order Status Tracking
        Payment Integration
        MySQL Support
        Authentication and Authorization
        API Documentation using Swagger
