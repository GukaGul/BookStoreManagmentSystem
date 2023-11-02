# BookStoreManagmentSystem
## Home Page
A welcoming gateway where users can navigate to various sections of the bookstore.

![HomePagePNG](https://github.com/GukaGul/BookStoreManagmentSystem/assets/121638498/ba11298a-af15-4495-b341-f439e34762e6)


## Available Books
A comprehensive list of all books currently available in the bookstore.
Users can browse through this list to discover and select books they are interested in, they can also remove books from the list.

![AvailableBooksPNG](https://github.com/GukaGul/BookStoreManagmentSystem/assets/121638498/45d49fa9-760d-4fa0-a0a7-d100e7248943)


## Book Registration
Allows users or administrators to add new books to the store, including details like the book's name, author, and price.

![NewBookRegisterPNG](https://github.com/GukaGul/BookStoreManagmentSystem/assets/121638498/0a3f5c8b-f9bb-4cd1-a279-12d7a80aeb50)


## My Books
A personalized section where users can view and manage their own book collection.

![MyBooks,png](https://github.com/GukaGul/BookStoreManagmentSystem/assets/121638498/354484ab-f973-4f59-bd17-f2978633eee8)


## Edit Book
Users are able to edit any book according to it's preferences.

![EditBookPNG](https://github.com/GukaGul/BookStoreManagmentSystem/assets/121638498/09c19af1-0c23-4fe6-9c4f-478ff1fbfa75)


# Documentation

## Prerequisites
Java 17
MySQL Server
Maven (For dependency management and running the application)

# Setup
## Database Configuration
Install MySQL if it is not already installed.
Create a database named book.
Ensure MySQL is running on port 3306.

## Application Configuration
Clone the repository to your local machine.

Open the application.properties file located in the src/main/resources directory.

Update the following properties with your MySQL credentials:

spring.datasource.username: Your MySQL username.

spring.datasource.password: Your MySQL password.

## Build and Run
Navigate to the root directory of the project where the pom.xml file is located.

Run the following command to build the project: mvn clean install

Once the build is successful, run the application with: mvn spring-boot:run

The application will start on port 1001. You can access it at http://localhost:1001.













