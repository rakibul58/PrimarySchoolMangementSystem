# Primary School Management System

A desktop application for managing student and staff information in a primary school, built using **Java Swing** and integrated with a relational database.

---

## Features
- **Student Management**: Add, edit, view, and delete student records.
- **Teacher Management**: Manage staff records and assignments.
- **Class Scheduling**: Create and manage class timetables.
- **Attendance Tracking**: Track attendance for students and staff.
- **Reports**: Generate academic or administrative reports.

---

## Prerequisites
1. **Java Development Kit (JDK)**: Ensure you have JDK 8 or higher installed.
2. **IDE**: Preferably NetBeans, IntelliJ IDEA, or Eclipse for running the project.
3. **Database**: SQLite (or specify the database system used).

---

## Setup Instructions

### Step 1: Clone the Repository
```bash
git clone https://github.com/rakibul58/PrimarySchoolMangementSystem.git
cd PrimarySchoolMangementSystem
```

### Step 2: Open in IDE
1. Open the project in your preferred Java IDE.
2. Resolve any missing libraries/dependencies.

### Step 3: Set Up the Database
1. Import the database:
   - Locate the `Database.sql` or `PrimarySchool.db` file in the repository.
   - Follow these steps to set it up:
     - **SQLite**: No configuration needed; just ensure the `.db` file is in the correct directory.
     - **MySQL**:
       - Import the `Database.sql` file into your MySQL server.
       - Update the connection settings in the `db.properties` file (if provided).
       ```properties
       db.url=jdbc:mysql://localhost:3306/PrimarySchoolDB
       db.username=root
       db.password=yourpassword
       ```

### Step 4: Run the Project
1. Compile and run the project from your IDE.
2. The application should start, and you can log in using the default credentials:
   - **Username**: `admin`
   - **Password**: `password` (if applicable).

---

## Technologies Used
- **Programming Language**: Java
- **GUI Framework**: Swing
- **Database**: SQLite
- **JDBC**: For database connectivity

---
