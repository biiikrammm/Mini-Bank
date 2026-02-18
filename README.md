# 💳 MiniBank – Java Console Banking System

A console-based banking application developed to demonstrate **Object-Oriented Programming (OOP)** principles, fundamental **Data Structures & Algorithms**, and robust **Exception Handling** in Java.

This project simulates a basic banking system where users can create accounts, deposit money, withdraw funds, and check balances with accurate financial calculations using `BigDecimal`.




## 🚀 Features

* Create multiple bank accounts dynamically
* Unique account number validation
* Deposit & withdraw money with validation checks
* Accurate currency handling using `BigDecimal`
* Prevent overdrawing
* Exception handling for invalid user inputs
* Menu-driven interactive interface
* Search functionality using linear search algorithm




## 🧠 Concepts Demonstrated

### 🔹 Object-Oriented Programming

* Classes & Objects
* Encapsulation
* Constructors
* Method abstraction

### 🔹 Data Structures & Algorithms

* Array of objects
* Linear search implementation
* Loop-based menu control

### 🔹 Exception Handling

* Handling invalid numeric inputs
* Preventing program crashes
* Defensive programming practices




## 🛠 Technologies Used

* Java
* BigDecimal (for precise financial calculations)
* Scanner (for user input)




## 📂 Project Structure

```
MiniBank
│
├── Account class
│   ├── deposit()
│   ├── withdraw()
│   ├── getBalance()
│   └── toString()
│
└── MiniBank (Main class)
    ├── Account creation
    ├── Search functionality
    ├── Menu-driven operations
    └── Exception handling
```




## ▶️ How to Run

1. Clone the repository

   ```
   git clone <your-repo-link>
   ```

2. Open in your preferred IDE (IntelliJ / Eclipse / VS Code)

3. Compile and run:

   ```
   javac MiniBank.java
   java MiniBank
   ```




## 📌 Sample Flow

```
Number of Accounts: 2
Enter Account Number: 101
Enter Account Holder Name: Bikram

Enter Account Number: 102
Enter Account Holder Name: Rahul

Enter Account number (0 to exit): 101
1. Show Balance
2. Deposit Money
3. Withdraw Money
4. Exit
```




## 🔒 Why BigDecimal?

Financial applications require precise decimal calculations.
Using `BigDecimal` ensures:

* No floating-point rounding errors
* Accurate currency representation
* Controlled rounding behavior




## 📈 Future Improvements

* Replace array with `ArrayList` for dynamic resizing
* Add transaction history tracking
* Implement account deletion
* Add persistent storage (file/database)
* Implement binary search for sorted accounts




## 🎯 Learning Outcome

This project strengthens understanding of:

* Designing real-world object models
* Implementing search algorithms
* Writing safe and defensive Java code
* Handling financial calculations correctly




## 📜 License

This project is for educational and practice purposes.
