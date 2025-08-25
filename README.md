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


