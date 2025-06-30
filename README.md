
# Symbiosis_project

Institute Management System
This is an Institute Management System built with Java and Spring Boot. It helps to manage attendance and analyze students’ marks in schools and colleges. Administrators can manage student data, monitor attendance, and track academic performance in a user-friendly way.

# Features
- ✅ Student attendance tracking
- ✅ Marks management
- ✅ Student record management
- ✅ Role-based access for teachers and administrators
- ✅ Reports and analysis

# Tech Stack
- Java (Spring Boot framework)

- MySQL (or any relational database; update this if different)

- Maven for dependency management

# Prerequisites
- Java 17 (or your target JDK version)

- Maven (latest stable version)

- MySQL (running on default port 3306 or your configured port)

# Getting Started
**1. Clone the repository:**

 - git clone https://github.com/yourusername/InstituteManagementSystem.git
 - cd InstituteManagementSystem

**2. Configure the database:**

 - Create a database in MySQL:
 - CREATE DATABASE institute_db;
 - Edit src/main/resources/application.properties (or application.yml) with your DB credentials:

 - spring.datasource.url=jdbc:mysql://localhost:3306/institute_db
 - spring.datasource.username=YOUR_USERNAME
 - spring.datasource.password=YOUR_PASSWORD

**3. Build the project:**

 - mvn clean install

**4. Run the application:**
 - mvn spring-boot:run

**5. Access the application:**

 - Typically: http://localhost:8080
 - Update if you have a different port

# Usage
- Login with admin/teacher credentials (hardcoded or seeded in DB)

- Manage student attendance

- Manage and analyze marks

- Generate reports

# Future Enhancements
- ✅ Add RESTful API endpoints
- ✅ Integrate front-end (React/Angular/Vue)
- ✅ Add JWT-based authentication
- ✅ Dockerize for easier deployment

# Contributors
- Shambhu Sharma

- Bagan Sarfaraj Nisar

- Syed Sohail Syed Asif

- Kumthe Javeriya Jameel Ahemad
