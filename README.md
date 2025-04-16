# 🏦 Banking Management System (Java Console App)

A simple **Java-based banking management system** showcasing core **Object-Oriented Programming (OOP)** principles through a menu-driven console interface. Users can perform essential banking operations like creating accounts, depositing, withdrawing, and checking balance — all implemented with clean OOP design patterns.

---

## 📌 OOP Concepts Used

| Concept          | Applied Through                                                                 |
|------------------|----------------------------------------------------------------------------------|
| **Abstraction**   | `BankAccount` abstract class with abstract method `withdraw()`                   |
| **Encapsulation** | Private/protected fields with getters/setters (`holderName`, `balance`, etc.)   |
| **Inheritance**   | `CurrentAccount` inherits from `BankAccount`                                    |
| **Polymorphism**  | Abstract reference to subclass instance + method overriding (`withdraw()`)       |

---

## ✨ Features

- 🔐 Create a **Current Account** with an initial deposit  
- ✏ Update account holder’s name  
- ❌ Delete an existing account  
- 📋 View account details (account number, name, balance)  
- 💰 Deposit money into the account  
- 💸 Withdraw money (supports overdraft up to 1000 for Current Account)  
- 📊 Check account balance  
- 📎 Simple, user-friendly menu-driven console interface  

---

## 🎯 Project Objectives

- Develop a basic Banking Management System using Java  
- Provide users the ability to open accounts, deposit, withdraw, and check balance  
- Allow secure logoff and smooth program exit  
- Demonstrate key OOP concepts for educational purposes  

---

## 🛠 Problem It Solves

Many real-world banking systems are overly complex or costly for small institutions or learners. This project simplifies the concept, making it easy for **students and beginners** to grasp basic banking operations and how to model them using **OOP in Java**.

---

## 💡 Significance of OOP

Object-Oriented Programming breaks down complex systems into small, manageable parts (like `Account`, `Transaction`, etc.). Each class serves a purpose, making the system easier to:

- Build
- Understand
- Maintain
- Expand  

---

## 🎯 Main Goals

- Securely manage financial transactions  
- Automate routine banking tasks  
- Improve customer experience  
- Ensure compliance with best coding practices  
- Enable future scalability and integration  

---

## 🔑 Key Features to Implement

- **Account Management**: Create, update, view, and delete accounts  
- **Transaction Management**: Deposit and withdraw funds  
- **Balance Inquiry**: View current account balance  
- **Exit/Logout**: Gracefully exit the system with message confirmation  

---

## 💻 Technologies Used

- **Programming Language**: Java  
- **Frameworks/Libraries**: Core Java (no external libraries)  
- **Database**: *Not implemented yet* (Data stored using in-memory `ArrayList`)  
  - Future plan: Integrate MySQL or file-based storage  

---

## 🧱 OOP Implementation Breakdown

### i. Encapsulation
> **Definition**: Wrapping data and methods in a single class, hiding implementation details  
**In Practice**: The `Account` class uses private fields with getters/setters  

### ii. Inheritance
> **Definition**: One class inherits properties and behaviors from another  
**In Practice**: `CurrentAccount` extends `BankAccount`, allowing shared functionality  

### iii. Polymorphism
> **Definition**: Use of a method in different forms (overriding/overloading)  
**In Practice**: Methods like `withdraw()` behave differently in subclasses  

### iv. Abstraction
> **Definition**: Hiding internal logic and exposing only necessary functionality  
**In Practice**: Users interact with high-level operations (Deposit, Withdraw)  

---

## 📆 Project Development Timeline

| Week | Task |
|------|------|
| Week 1 | Design class structure (`Account`, `Bank`, `MainApp`) |
| Week 2 | Implement account creation, deposit, withdrawal |
| Week 3 | Add balance inquiry, exit function, and error handling |
| Week 4 | Final testing, debugging, and documentation |

---

## 🎯 Expected Outcome

By the end of this project, users should be able to:

- Open a bank account  
- Deposit and withdraw funds  
- View their account balance  
- Exit the application smoothly  

---

## 👥 User Benefits

- Easy-to-use menu interface  
- Simulates a real-world banking environment  
- Enhances understanding of Java and OOP  

---

## 📌 Project Summary & Impact

The Banking Management System allows users to perform basic financial operations in a simulated console environment. Built with Java and OOP, it helps learners write modular, reusable, and maintainable code.

---

## 🧩 Problems Faced

- Handling `Scanner` input properly (`nextInt()` vs `nextLine()`)  
- Preventing negative balances after withdrawal  
- Structuring multi-class OOP design  

---

## 📚 References

1. [Tutorials Point – Java](https://www.tutorialspoint.com/java/index.htm)  
2. [GeeksforGeeks – OOPs Concepts](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)  
3. [Programiz – Java OOPs](https://www.programiz.com/java-programming/object-oriented-programming)  
4. [W3Schools – Java OOP](https://www.w3schools.com/java/java_oop.asp)  

---

## 🚀 Getting Started

```bash
git clone https://github.com/yourusername/BankingManagementSystem.git
cd BankingManagementSystem
javac BankingManagementSystem.java
java BankingManagementSystem
