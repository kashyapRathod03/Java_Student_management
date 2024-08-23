# Student Management System

## Introduction

The Student Management System is a Java-based web application designed to manage student data efficiently. This system allows users to store, edit, view, and delete student records. It's an ideal solution for educational institutions looking to maintain student data in a structured and accessible manner.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#Prerequisites)
- [step](#step)
- [Technologies Used](#technologies-used)
- [Dependencies](#dependencies)
- [Contributors](#contributors)

## Features

- **Add Student Data:** Users can add new student records to the system.
- **Edit Student Data:** Users can update existing student information.
- **View Student Data:** Users can view the list of all students stored in the system.
- **Delete Student Data:** Users can remove student records as needed.

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven 3.6 or higher
- MySQL Server
- Apache Tomcat 9 or higher

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/student-management-system.git
   
2. Navigate to the project directory:
     cd student-management-system
   
3. Setup the MySQL database.
      Create a database named student_management.
      Import the SQL schema from the database/student_management.sql file.
   
4.Update database configuration:
      Open the src/main/resources/db.properties file.
      Update the database URL, username, and password.

5.Build the project using Maven: mvn clean install

6.Deploy the project on Apache Tomcat:
      Copy the generated WAR file from the target directory to the Tomcat webapps directory.
      Start the Tomcat server.

### Dependencies
  MySQL Connector/J: JDBC driver for MySQL.
  Servlet API: For handling HTTP requests and responses.
  JSP API: For rendering dynamic web pages.
  JSTL: For simplifying JSP development.

### Contributors
Kashya Rathod - Initial work

