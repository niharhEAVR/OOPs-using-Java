Great! Let’s break down **Data Hiding** — it's closely related to **encapsulation**, but they are not exactly the same.

---

## 🔒 What is **Data Hiding** in Java?

**Data Hiding** means:
> Restricting access to the internal details of a class so that outside code **cannot directly change or misuse** it.

This is done using **access modifiers** (like `private`) so that data (variables) can't be accessed directly.

---

### 📦 Real-Life Example:
Think of your **bank account**:
- You can’t directly change your account balance — you use deposit/withdraw methods.
- The **balance is hidden** (you can't directly change it from your phone or laptop).
  
That's data hiding: **protecting sensitive info and only allowing controlled access.**

---

### ✅ How to do it in Java?

Use `private` access modifier for data, and control access through `public` **getters and setters**.

---

### 💻 Code Example:

```java
class Account {
    private double balance = 1000;  // 👈 this is hidden from outside

    // public method to safely view the balance
    public double getBalance() {
        return balance;
    }

    // public method to safely update the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

### 🧪 Main class:

```java
public class Main {
    public static void main(String[] args) {
        Account myAcc = new Account();

        // myAcc.balance = 99999; ❌ This will give an error (data hidden)

        myAcc.deposit(500);  // ✅ safe way to modify
        System.out.println("Current Balance: ₹" + myAcc.getBalance());
    }
}
```

---

### 🎯 Difference: Encapsulation vs Data Hiding

| Feature           | Encapsulation                           | Data Hiding                            |
|------------------|------------------------------------------|----------------------------------------|
| Scope            | Bundling data and methods                | Protecting data from unauthorized access |
| Goal             | Organize code and structure              | Security and data protection           |
| Uses             | Classes, methods                         | Access modifiers (like `private`)      |
