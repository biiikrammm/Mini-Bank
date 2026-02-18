# 💳 MiniBank — Console Banking System in Java

MiniBank is a menu-driven banking application that simulates core banking operations such as account creation, deposits, withdrawals, and balance inquiry while ensuring precise financial calculations using `BigDecimal`.

The project focuses on writing safe, predictable, and maintainable Java code rather than just implementing features.

---

## 🧩 What This Project Solves

Many beginner Java programs handle money using `double`, which leads to rounding errors:

```
0.1 + 0.2 ≠ 0.3
```

MiniBank avoids this by implementing currency-safe calculations and validating every operation to prevent invalid states like negative balance or corrupted input.

---

## ⚙️ Core Functionality

* Create multiple accounts
* Unique account number enforcement
* Deposit and withdraw funds
* Prevent overdrawing
* Accurate currency calculations using `BigDecimal`
* Continuous multi-account session handling
* Graceful handling of invalid user input
* Interactive menu-driven interface

---

## 🏗️ Program Design

### 🔹 Account Class

Represents a single bank account and handles:

* Balance management
* Validation logic
* Money operations using `BigDecimal`

### 🔹 MiniBank (Main Controller)

Responsible for:

* User interaction
* Account lookup (linear search)
* Flow control & navigation
* Exception handling

---

## 🧠 Key Technical Decisions

### Why BigDecimal?

Financial systems require exact decimal precision.
Using floating-point numbers introduces rounding errors.
`BigDecimal` guarantees predictable currency behavior.

### Why Validation Inside the Class?

Business rules belong to the data they protect.
This prevents invalid operations regardless of where the method is called.

---

## ▶️ Running the Program

```bash
git clone https://github.com/biiikrammm/Mini-Bank
cd Mini-Bank
javac MiniBank.java
java MiniBank
```

---

## 🖥 Example Interaction

```
Enter Account number: 101
1. Show Balance
2. Deposit
3. Withdraw
4. Exit

Enter Amount: 500.25
Deposit successful!
Balance: ₹500.25
```

---

## 📈 Possible Extensions

* Replace array with dynamic storage (`ArrayList` or database)
* Add transaction history tracking
* Implement account deletion
* Add persistent data storage
* Implement sorting + binary search for faster lookup

---

## 🎯 Learning Focus

This project practices writing reliable software by combining:

* Object-Oriented Programming
* Defensive programming
* Data validation
* Precise arithmetic handling
* Menu-driven program design

---

## 📜 License

This project is developed for educational and practice purposes.
