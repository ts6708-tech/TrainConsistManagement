🚆 Train Consist Management App
📌 Overview

The Train Consist Management App is a console-based Java application that simulates how railway systems manage a train’s consist — the sequence of bogies attached to an engine.

This project demonstrates Core Java, Data Structures, Streams, Exception Handling, Searching & Sorting Algorithms, Regex, and OOP concepts through real-world railway scenarios.

🎯 Features
Manage passenger and goods bogies
Track seating and load capacities
Ensure uniqueness of bogies
Maintain train formation order
Map bogies to operational attributes
Sort bogies using both manual and built-in techniques
Search bogies using Linear and Binary Search
Filter and group bogies using Streams
Calculate total seating capacity
Validate Train ID and Cargo Codes using Regex
Enforce safety compliance rules for goods bogies
Handle invalid inputs using custom exceptions
Implement fail-fast validation for system safety
Compare performance of loops vs streams
🏗️ Concepts Covered
Use Case	Concept
UC1	Application setup, ArrayList initialization
UC2	ArrayList operations (add, remove, contains)
UC3	HashSet (uniqueness)
UC4	OOP (Bogie class, objects)
UC5	LinkedHashSet (order + uniqueness)
UC6	HashMap (key-value mapping)
UC7	Comparator (custom sorting)
UC8	Stream API – filter()
UC9	Stream API – groupingBy()
UC10	Stream API – map() + reduce()
UC11	Regex validation (Pattern & Matcher)
UC12	Stream API – allMatch() (safety compliance)
UC13	Performance benchmarking (nanoTime, loops vs streams)
UC14	Custom Exception (InvalidCapacityException)
UC15	try-catch-finally, Runtime Exception handling
UC16	Bubble Sort (manual sorting algorithm)
UC17	Arrays.sort() (optimized sorting)
UC18	Linear Search (O(n))
UC19	Binary Search (O(log n), divide & conquer)
UC20	Fail-fast validation using IllegalStateException
📂 Project Structure
TrainConsistManagement/
│
├── App/
│   └── src/
│       └── main/
│       └── test/
│
├── .gitignore
└── README.md
🚀 How to Run
Open project in IntelliJ / Eclipse
Navigate to your main/test classes

OR using terminal:

javac *.java
java ClassName
🧪 Sample Functionalities
✅ Add Passenger Bogies
Sleeper
AC Chair
First Class
✅ Ensure Unique Bogies
Duplicate bogies automatically ignored using HashSet
✅ Maintain Order
Train formation preserved using LinkedHashSet
✅ Map Capacity
Sleeper → 72
AC Chair → 50
First Class → 30
✅ Sort Bogies
Comparator (UC7)
Bubble Sort (UC16)
Arrays.sort() (UC17)
✅ Search Bogies
Linear Search (UC18)
Binary Search (UC19)
✅ Filter Bogies (UC8)
Using filter()
✅ Group Bogies (UC9)
Using groupingBy()
✅ Total Capacity (UC10)
Using map() + reduce()
✅ Regex Validation (UC11)
Train ID → TRN-1234
Cargo Code → PET-AB
✅ Safety Compliance (UC12)
Validated using allMatch()
✅ Performance Comparison (UC13)
Loop vs Stream execution time using System.nanoTime()
✅ Exception Handling (UC14–UC15)
Custom Exception for invalid capacity
Runtime exception for unsafe cargo
try-catch-finally for safe execution
✅ Defensive Programming (UC20)
Prevent search on empty data using fail-fast approach
📊 Sample Output
=== Train Consist Management App ===

All Bogies:
Sleeper (Capacity: 72)
AC Chair (Capacity: 50)
First Class (Capacity: 30)

Total Seating Capacity: 152

Sorted Capacities:
[24, 56, 60, 70, 72]

Sorted Bogie Names:
[AC Chair, First Class, General, Luxury, Sleeper]

Search Result:
BG309 FOUND

Train ID is VALID
Cargo Code is VALID

Train is SAFETY COMPLIANT
💡 Key Learnings
Difference between List, Set, and Map
Importance of uniqueness and ordering
Object-Oriented design using classes
Custom vs built-in sorting techniques
Linear vs Binary Search (performance difference)
Functional programming using Streams
Exception handling (checked vs runtime)
Fail-fast and defensive programming
Real-world system validation and safety rules
🔧 Technologies Used
Java (JDK 17+ / 21+)
Collections Framework
Stream API
Exception Handling
Regex (Pattern & Matcher)
Sorting & Searching Algorithms
👨‍💻 Author

Sigeni Tejas
RA2411003011282
