### ✅ **🔥 Sealed Classes in Java (Introduced in Java 15)**

---

### 🚦 **1️⃣ What is a Sealed Class?**

A **sealed class** is a class that **restricts which other classes can inherit from it**.  
It provides **more control over inheritance** by explicitly specifying the allowed subclasses.

✅ **Introduced in:**  
- **Java 15** (Preview feature)  
- **Java 17** (Standard feature)

---

### 🚦 **2️⃣ Why Do We Need Sealed Classes?**

Before sealed classes, Java only had **three inheritance control mechanisms**:
1. `public`: Any class could extend it.
2. `protected` or `package-private`: Limited to the same package.
3. `final`: Prevented inheritance entirely.

💡 **Problem:**  
You couldn't specify **a list of specific subclasses** that are allowed to extend the class.  

✅ **Sealed classes solve this** by:
- Restricting inheritance to only **permitted subclasses**.
- Improving **maintainability and security** by controlling which classes can extend the base class.
- Enhancing **pattern matching** in `switch` expressions.

---

### 🚦 **3️⃣ How to Declare a Sealed Class**

A sealed class uses the `sealed` keyword followed by the `permits` clause to specify its permitted subclasses.

✅ **Syntax:**
```java
sealed class Parent permits Child1, Child2 {
    // Class content
}

final class Child1 extends Parent {
    // Cannot be extended further
}

non-sealed class Child2 extends Parent {
    // Can be extended by any other class
}
```

---

### 🚦 **4️⃣ Sealed Class Rules**

- **A sealed class** → Must specify all its permitted subclasses using the `permits` keyword.
- **Permitted subclasses** must be:
    - `final` → No further inheritance.
    - `sealed` → Further restricted inheritance.
    - `non-sealed` → Open for inheritance.
- **Compile-time enforcement:**  
  - The compiler ensures only the permitted subclasses can extend the sealed class.

---

### 🚦 **5️⃣ Example of Sealed Classes**

✅ **Example with `final`, `sealed`, and `non-sealed` subclasses:**
```java
sealed class Shape permits Circle, Rectangle, Triangle {
    public abstract double area();
}

// Final subclass: No further inheritance
final class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Sealed subclass: Restricts inheritance further
sealed class Rectangle extends Shape permits Square {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// Final subclass: No further inheritance
final class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}

// Non-sealed subclass: Can be extended by any class
non-sealed class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
```

✅ **Explanation:**
1. **Sealed Class**: `Shape`
   - Only `Circle`, `Rectangle`, and `Triangle` are allowed to extend it.
2. **`final` subclass**: `Circle`
   - Cannot be extended by any other class.
3. **`sealed` subclass**: `Rectangle`
   - Only `Square` can extend it.
4. **`non-sealed` subclass**: `Triangle`
   - Any class can extend it.

---

### 🚦 **6️⃣ Benefits of Sealed Classes**

✅ **1. Enhanced Inheritance Control:**  
- You define **exactly which classes** can extend the sealed class.

✅ **2. Better Pattern Matching:**  
- Works seamlessly with **pattern matching in switch expressions** (Java 17+).

✅ **3. Improved Security:**  
- Prevents **unintentional inheritance** and ensures only authorized subclasses exist.

✅ **4. Runtime Safety:**  
- The compiler checks inheritance rules, ensuring that no unexpected classes extend the sealed class.

---

### 🚦 **7️⃣ Pattern Matching with Sealed Classes**

Sealed classes work well with **pattern matching** in Java 17+.

✅ **Example:**
```java
sealed interface Shape permits Circle, Rectangle, Triangle { }

final class Circle implements Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
}

final class Rectangle implements Shape {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

final class Triangle implements Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(10);

        // Pattern matching with switch expression
        String result = switch (shape) {
            case Circle c -> "Circle with radius " + c.radius;
            case Rectangle r -> "Rectangle with dimensions " + r.width + "x" + r.height;
            case Triangle t -> "Triangle with base " + t.base + " and height " + t.height;
        };

        System.out.println(result);
    }
}
```

✅ **Explanation:**
1. Sealed `Shape` interface ensures only `Circle`, `Rectangle`, and `Triangle` are valid shapes.
2. Pattern matching in `switch` handles all cases without needing `default`.

✅ **Output:**
```
Circle with radius 10.0
```

---

### 🚦 **8️⃣ Key Differences Between `final`, `sealed`, and `non-sealed`:**

| **Keyword**    | **Meaning**                             | **Inheritance Rule**           |
|----------------|-----------------------------------------|-------------------------------|
| `final`        | No further inheritance allowed.          | Cannot be extended.            |
| `sealed`       | Restricted inheritance.                  | Only specified subclasses can extend. |
| `non-sealed`   | Open inheritance (opposite of `sealed`). | Any class can extend.          |

---

### 🚦 **9️⃣ Use Cases of Sealed Classes**
✅ **1. Domain Modeling:**  
- When you have a **fixed set of types** that should implement an interface or extend a class.  
- Example: `Shape`, `Color`, `Vehicle` with fixed types.

✅ **2. Improved Type Safety:**  
- Restricting inheritance ensures **better runtime safety**.

✅ **3. Enhanced Performance:**  
- The compiler can **optimize pattern matching** and `switch` expressions with sealed classes.

---

### 🚦 **10️⃣ Key Takeaways**
✅ **Sealed Classes:**
- Introduced in **Java 15** (preview) → Standard in **Java 17**.  
- Allow **controlled inheritance**.  
- Improve **pattern matching** and type safety.  

✅ **Use When:**
- You want to **limit inheritance** to specific classes.  
- You need **better pattern matching**.  
- You want to prevent **unintended inheritance**.

---

### 💡 **🔥 Conclusion**
Sealed classes in Java give you **fine-grained control over inheritance**, making your code **more secure, maintainable, and optimized** for pattern matching. 🚀

---
---
---

### ✅ **🔥 Sealed Interface in Java (Java 15+)**

---

### 🚦 **1️⃣ What is a Sealed Interface?**

A **sealed interface** is an interface that **restricts which classes or interfaces can implement it**.  
It gives you **fine-grained control** over the inheritance hierarchy by specifying **permitted implementors**.

✅ **Introduced in:**  
- **Java 15** (Preview)  
- **Java 17** (Standard feature)  

---

### 🚦 **2️⃣ Why Do We Need Sealed Interfaces?**

Before Java 15, interfaces had **no control** over which classes could implement them.  
✅ **Problem:**  
- Any class could **implement an interface**, leading to **unintended implementations**.  
- No way to define a **fixed set of implementors**.  

✅ **Sealed interfaces solve this** by:
- Allowing only **specific classes or interfaces** to implement the interface.  
- Improving **type safety** and **maintainability**.  
- Enhancing **pattern matching** in `switch` expressions.  

---

### 🚦 **3️⃣ How to Declare a Sealed Interface**

✅ **Syntax:**
```java
sealed interface Vehicle permits Car, Bike, Truck {
    void drive();
}

final class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }
}

non-sealed class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike is driving...");
    }
}

sealed class Truck implements Vehicle permits MiniTruck {
    @Override
    public void drive() {
        System.out.println("Truck is driving...");
    }
}

final class MiniTruck extends Truck {
    @Override
    public void drive() {
        System.out.println("MiniTruck is driving...");
    }
}
```

✅ **Explanation:**
1. **Sealed Interface:** `Vehicle`
   - Only `Car`, `Bike`, and `Truck` are allowed to implement it.
2. **`final` class:** `Car`
   - Cannot be implemented by any other class.
3. **`non-sealed` class:** `Bike`
   - Open for inheritance.
4. **`sealed` class:** `Truck`
   - Only `MiniTruck` is allowed to extend it.

---

### 🚦 **4️⃣ Rules for Sealed Interfaces**

✅ **1. Permitted Classes:**  
- A sealed interface must explicitly specify its **permitted implementors** using the `permits` keyword.

✅ **2. Implementing Classes:**  
- The implementing classes must either be:
  - `final`: No further inheritance.
  - `sealed`: Further restricted inheritance.
  - `non-sealed`: Open for inheritance by any class.

✅ **3. Compile-Time Check:**  
- The compiler **verifies the permitted implementors** at compile time.

✅ **4. Pattern Matching Compatibility:**  
- Works seamlessly with **pattern matching** in `switch` expressions (Java 17+).

---

### 🚦 **5️⃣ Example: Sealed Interface with Pattern Matching**

Sealed interfaces are particularly useful when combined with **pattern matching** in `switch` expressions.

✅ **Example:**
```java
sealed interface Vehicle permits Car, Bike, Truck {}

final class Car implements Vehicle {}
non-sealed class Bike implements Vehicle {}
sealed class Truck implements Vehicle permits MiniTruck {}

final class MiniTruck extends Truck {}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        // Using pattern matching with switch expression
        String result = switch (vehicle) {
            case Car c -> "It's a Car";
            case Bike b -> "It's a Bike";
            case Truck t -> "It's a Truck";
            case MiniTruck m -> "It's a MiniTruck";
        };

        System.out.println(result);  // Output: It's a Car
    }
}
```

✅ **Explanation:**
1. `Vehicle` is a **sealed interface**.
2. The `switch` expression uses **pattern matching** to handle all permitted types.
3. No need for a `default` case because the compiler **knows all permitted classes**.

---

### 🚦 **6️⃣ Key Differences Between Sealed Interfaces and Sealed Classes**

| **Feature**         | **Sealed Interface**                     | **Sealed Class**                          |
|----------------------|----------------------------------------|------------------------------------------|
| **Inheritance**      | Restricts which classes can implement it. | Restricts which classes can extend it.   |
| **Permitted Types**   | Can be implemented by specific classes or interfaces. | Can only be extended by specific classes. |
| **Use Cases**         | Use for polymorphism and abstraction.   | Use for class inheritance control.       |
| **Keyword**           | `permits` specifies allowed implementors. | `permits` specifies allowed subclasses. |

---

### 🚦 **7️⃣ When to Use Sealed Interfaces?**

✅ **1. Domain-Specific Modeling:**  
- When you want to define **specific types** that implement an interface.
- Example:  
    ```java
    sealed interface PaymentMethod permits CreditCard, DebitCard, UPI { }
    ```

✅ **2. Pattern Matching:**  
- Makes pattern matching in `switch` expressions **more efficient** and type-safe.

✅ **3. Improved Security and Maintenance:**  
- Prevents **unintended implementations** of the interface.
- Helps in **future-proofing** your code.

✅ **4. Better Code Optimization:**  
- The compiler can **optimize pattern matching** and other operations by knowing the permitted implementors.

---

### 🚦 **8️⃣ Advantages of Sealed Interfaces**

✅ **1. Controlled Inheritance:**  
- You specify which classes are allowed to implement the interface.

✅ **2. Improved Readability and Maintainability:**  
- Explicitly defines the relationship between interfaces and implementors.

✅ **3. Pattern Matching Benefits:**  
- Enhances **type safety** and eliminates the need for `default` cases.

✅ **4. Compile-Time Safety:**  
- The compiler checks the permitted implementors, avoiding runtime surprises.

---

### 🚦 **9️⃣ Use Cases of Sealed Interfaces**

✅ **1. Modeling Restricted Hierarchies:**  
- Example:  
    ```java
    sealed interface Animal permits Dog, Cat, Bird { }
    ```
- Only `Dog`, `Cat`, and `Bird` can implement the `Animal` interface.

✅ **2. Secure API Design:**  
- Ensure that only **authorized classes** implement your interface.

✅ **3. Improved Pattern Matching:**  
- More concise and error-free `switch` expressions.

✅ **4. Code Maintainability:**  
- Makes the codebase **easier to maintain** and refactor.

---

### 🚦 **🔥 10️⃣ Key Takeaways**

✅ **Sealed Interfaces:**
- Introduced in **Java 15** (Preview) → Standard in **Java 17**.  
- Allow you to **restrict which classes** can implement the interface.  
- Enhance **pattern matching** and **compile-time safety**.

✅ **Use When:**
- You need **controlled polymorphism**.  
- You want **pattern matching with sealed types**.  
- You need **secure and maintainable code**.

---

### 💡 **🔥 Conclusion**
Sealed interfaces in Java give you **fine-grained control over inheritance**, making your code **more secure, maintainable, and optimized** for pattern matching. 🚀
