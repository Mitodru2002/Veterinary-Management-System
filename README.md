
# 🐾 Veterinary Management System (Java + MySQL)

This is a **Veterinary Management System** built using **Java (JDBC)** and **MySQL**.  
It allows a veterinary clinic to manage pets, their owners, and medical records efficiently.  

The system is **menu-driven**, supporting operations like adding new pets, owners, updating records, and deleting entries.

---

## 🔧 Features

- ✅ Add new pets and owners  
- ✅ View all pets and owners  
- ✅ Update any field of pets or owners  
- ✅ Delete pets and owners  
- ✅ Track pets linked to their respective owners  
- ✅ Menu-driven interface for ease of use  

---

## 🗃️ Database Structure

### 🐶 `pets` Table:
| Column     | Type     | Description              |
|------------|----------|--------------------------|
| pet_id     | INT      | Primary Key              |
| name       | VARCHAR  | Pet's name               |
| species    | VARCHAR  | Pet species (Dog, Cat)   |
| age        | INT      | Age of the pet           |
| owner_id   | INT      | Foreign key (Owner link) |

### 👤 `owners` Table:
| Column    | Type     | Description                |
|-----------|----------|----------------------------|
| owner_id  | INT      | Primary Key                |
| name      | VARCHAR  | Owner's name               |
| phone     | VARCHAR  | Owner's contact number     |
| email     | VARCHAR  | Owner's email address      |

---

## 💻 Technologies Used

- Java (JDK 8+)  
- JDBC (Java Database Connectivity)  
- MySQL 8.0+  
- MySQL Workbench or phpMyAdmin (for DB setup)  

---

## 🚀 Getting Started

### 1. Clone this repository

```bash
git clone https://github.com/your-username/veterinary-management-system.git
cd veterinary-management-system
````

### 2. Set up the MySQL Database

```sql
CREATE DATABASE veterinary_db;

USE veterinary_db;

CREATE TABLE owners (
    owner_id INT PRIMARY KEY,
    name VARCHAR(100),
    phone VARCHAR(20),
    email VARCHAR(100)
);

CREATE TABLE pets (
    pet_id INT PRIMARY KEY,
    name VARCHAR(100),
    species VARCHAR(50),
    age INT,
    owner_id INT,
    FOREIGN KEY (owner_id) REFERENCES owners(owner_id)
);
```

### 3. Insert Sample Data

```sql
INSERT INTO owners VALUES (1, 'Alice Johnson', '9876543210', 'alice@example.com');
INSERT INTO owners VALUES (2, 'Bob Smith', '8765432109', 'bob@example.com');

INSERT INTO pets VALUES (101, 'Max', 'Dog', 5, 1);
INSERT INTO pets VALUES (102, 'Whiskers', 'Cat', 3, 2);
```

### 4. Update DB Credentials in Code

In `Main.java`:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/veterinary_db", "root", "your-password");
```

### 5. Compile & Run the Program

```bash
javac -d . *.java
java mypack.Main
```

---

