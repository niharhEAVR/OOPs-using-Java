Polymorphism in Java is one of the four main principles of **Object-Oriented Programming (OOP)**. The word **polymorphism** means *"many forms."* In Java, it allows objects to take on **multiple forms**, meaning a single function or object can behave differently based on the context.

---

### 🔑 Types of Polymorphism in Java

There are **two types** of polymorphism in Java:

---

### 1. **Compile-Time Polymorphism (Static Polymorphism)**

This is achieved using **method overloading**, where **multiple methods have the same name** but differ in:

- Number of parameters
- Type of parameters
- Order of parameters

📌 **Example:**
```java
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

### 2. **Runtime Polymorphism (Dynamic Polymorphism)**

This is achieved using **method overriding**, where a **subclass provides a specific implementation** of a method that is already defined in its parent class.

📌 **Example:**
```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.makeSound();  // Output: Dog barks

        a = new Cat();
        a.makeSound();  // Output: Cat meows
    }
}
```

---

### ✅ Why Use Polymorphism?
- **Code reusability** and cleaner code
- **Extensibility** – easy to add new behaviors
- **Flexibility** in invoking different methods at runtime

---

In Java, there are **two main types of polymorphism**:

---

### 🔹 1. **Compile-Time Polymorphism (Static Polymorphism)**

📌 Achieved through: **Method Overloading**

This happens when **multiple methods in the same class** have the **same name** but **different parameters**.

#### ✅ Example:
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```
🧠 At **compile time**, the compiler decides which `add()` method to call based on arguments.

---

### 🔹 2. **Runtime Polymorphism (Dynamic Polymorphism)**

📌 Achieved through: **Method Overriding**

This occurs when a **subclass provides its own implementation** of a method that is already defined in its parent class.

#### ✅ Example:
```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();  // Output: Dog barks

        a = new Cat();
        a.sound();  // Output: Cat meows
    }
}
```
🧠 At **runtime**, Java decides which version of `sound()` to call based on the object type.

---

### 🧾 Summary Table:

| Type                   | Mechanism            | Decision Time  | Example               |
|------------------------|----------------------|----------------|------------------------|
| Compile-time Polymorphism | Method Overloading    | During Compile | `add(int, int)` vs `add(double, double)` |
| Runtime Polymorphism   | Method Overriding     | During Runtime | `Animal a = new Dog(); a.sound();`        |
