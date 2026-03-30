# 🚆 Train Consist Management App

## 📌 Overview

The **Train Consist Management App** is a console-based Java application that simulates how railway systems manage a train’s consist — the sequence of bogies attached to an engine.

This project demonstrates core **Java concepts, Data Structures, and Object-Oriented Programming (OOP)** through real-world railway scenarios.

---

## 🎯 Features

* Manage passenger and goods bogies
* Track seating and load capacities
* Ensure uniqueness of bogies
* Maintain train formation order
* Map bogies to operational attributes
* Sort bogies based on capacity

---

## 🏗️ Concepts Covered

| Use Case | Concept                                      |
| -------- | -------------------------------------------- |
| UC1      | Application setup, ArrayList initialization  |
| UC2      | ArrayList operations (add, remove, contains) |
| UC3      | HashSet (uniqueness)                         |
| UC4      | OOP (Bogie class, objects)                   |
| UC5      | LinkedHashSet (order + uniqueness)           |
| UC6      | HashMap (key-value mapping)                  |
| UC7      | Comparator (custom sorting)                  |

---

## 📂 Project Structure

```
TrainConsistManagement/
│
└── TrainConsistManagement.java
```

---

## 🚀 How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/TrainConsistManagement.git
```

2. Open in IDE (IntelliJ / Eclipse)

3. Compile and run:

```
javac TrainConsistManagement.java
java TrainConsistManagement
```

---

## 🧪 Sample Functionalities

### ✅ Add Passenger Bogies

* Sleeper
* AC Chair
* First Class

### ✅ Ensure Unique Bogies

* Duplicate bogies automatically ignored using Set

### ✅ Maintain Order

* Train formation preserved using LinkedHashSet

### ✅ Map Capacity

* Sleeper → 72
* AC Chair → 50
* First Class → 30

### ✅ Sort Bogies

* Sorted based on capacity using Comparator

---

## 📊 Sample Output

```
=== Train Consist Management App ===

Before Sorting:
Sleeper (Capacity: 72)
AC Chair (Capacity: 50)
First Class (Capacity: 30)

After Sorting:
First Class (Capacity: 30)
AC Chair (Capacity: 50)
Sleeper (Capacity: 72)
```

---

## 💡 Key Learnings

* Difference between List, Set, and Map
* Importance of data uniqueness in real systems
* Object-Oriented design using classes and objects
* Custom sorting using Comparator
* Real-world application of Java collections

---

## 👨‍💻 Author

* Your Name

---

## 📌 Notes

This project is part of coursework demonstrating practical implementation of Java collections and OOP concepts using a railway system simulation.

---
