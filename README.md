# Final Project

[FoodieHour](/Frontend/Images/logo2.jpg)

## Requirements

Your project must meet all of the requirements below:

1. Include a microservices Java/Spring Boot back-end and an Angular frontend.
2. Include at least 2 SQL database tables.
3. Include at least 4 services plus at least 1 edge service.
4. Include at least 1 GET, POST, PUT/PATCH, and DELETE route.
5. Include adequate and complete documentation.
6. Include at least 1 technology, tool, framework, or library that has not been covered in class


## 📊 Diagrams
[Methods Diagram](/Frontend/Images/methods_diagram.jpg)

[Use Case Diagram](/Frontend/Images/classes_diagram.jpg)

## 💻 How to Use
First of all, **run the database script included in the project** in MySQL Workbench. You can find the scripts [here](/backend/resources/). This is where all the data will be persisted.

Then, you will have to **run the services**. The fastest way to do so is to run all services through the console. The easiest way to do that **requires having Maven installed** in your computer.

**Having Maven installed**, go to the service root directory, open the terminal of your choice (cmd, Powershell or git bash) and run the following command:
`mvn spring-boot:run`

If you **don't have Maven installed**, run the service Application file. It will usually be called `<ServiceName>Application.java`. For example, `EurekaServiceApplication.java`.

The appropriate order to run every service is as follows:
1. Run the [Eureka server service](/backend/eureka-service)
2. Run the three proxy services: [purchase user service](/Backend/purchase-user-service), [seller user service](/Backend/seller-user-service) and [product service](/Backend/product-service)
3. Run the [edge service](/Backend/edge-service)

Finally, **run the frontend**. This requires having both [npm](https://nodejs.org/es/) and [Angular](https://angular.io/start) installed. npm will take care of the necessary dependencies for you.

Go to the root of the [Angular project](/frontend-app) and execute the following command in the terminal:
`npm install`.
This will install the necessary node modules. Then, execute:
`ng serve`.
This will run the frontend in [localhost:4200](http://localhost:4200/) by default. There, you will find the application running.
 
---


## ♥️ Thanks
