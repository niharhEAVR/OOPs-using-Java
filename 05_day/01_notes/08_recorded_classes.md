### ✅ **🔥 Record Class in Java (Java 14+)**

---

### 🚦 **1️⃣ What is a Record Class?**

A **record class** is a special type of class in Java introduced to **reduce boilerplate code** for data models.  
It **automatically generates**:
- A **constructor**
- `equals()`
- `hashCode()`
- `toString()`  
- **Getters** (no setters)

✅ **Introduced in:**  
- **Java 14** (Preview feature)  
- **Java 16** (Standard feature)  

---

### 🚦 **2️⃣ Why Do We Need Record Classes?**

In traditional Java classes, you often write a lot of **boilerplate code** for:
- Declaring fields  
- Creating constructors  
- Generating `equals()`, `hashCode()`, and `toString()` methods  

✅ **Problem:**  
- Tedious and repetitive code.  
- More chances of introducing bugs.  

✅ **Solution: Record Classes**
- Record classes **automatically generate** the necessary methods.
- They are **immutable** by default.
- Provide a clean and concise way to represent **data models**.

---

### 🚦 **3️⃣ Syntax of a Record Class**

✅ **Basic Syntax:**
```java
record ClassName(type field1, type field2) { }
```
- `record` → Declares a record class.  
- `ClassName` → The name of the record.  
- Fields are defined within parentheses.  
- **Immutable** by default.

✅ **Example:**
```java
public record Person(String name, int age) { }
```

Equivalent to:
```java
public final class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    @Override
    public boolean equals(Object o) { 
        // Auto-generated equals
    }

    @Override
    public int hashCode() { 
        // Auto-generated hashCode
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
```

---

### 🚦 **4️⃣ Features of Record Classes**

✅ **1. Immutable by Default:**  
- Fields are `final` by default.  
- You cannot modify the fields once the object is created.  

✅ **2. Automatically Generated Methods:**  
- **Constructor**
- **Getters** (field name as method name)
- **`equals()`**
- **`hashCode()`**
- **`toString()`**

✅ **3. Concise Syntax:**  
- No need for manual field declarations, constructor, or methods.

✅ **4. Better Readability and Maintainability:**  
- Ideal for **data transfer objects (DTO)** and simple data carriers.

---

### 🚦 **5️⃣ Example of Using a Record Class**

✅ **Basic Example:**
```java
public class Main {
    public static void main(String[] args) {
        
        // Creating a record object
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);

        // Using auto-generated methods
        System.out.println(p1);                   // Person[name=Alice, age=25]
        System.out.println(p1.equals(p2));        // false
        System.out.println(p1.name());            // Alice (getter method)
        System.out.println(p1.age());             // 25 (getter method)
    }
}
```

✅ **Explanation:**
1. **Record `Person`:**
   - Contains two fields: `name` and `age`.
2. **Automatic Methods:**
   - `toString()` → Prints `Person[name=Alice, age=25]`.
   - `equals()` → Compares the contents.
   - `hashCode()` → Auto-generated hash code.
   - Getters → `name()` and `age()`.

---

### 🚦 **6️⃣ Adding Methods in Record Classes**

You can add **custom methods** in record classes.

✅ **Example:**
```java
public record Person(String name, int age) {

    // Custom method
    public String greet() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
    
    // Static method
    public static Person createAdult(String name) {
        return new Person(name, 18);
    }
    
    // Instance method
    public boolean isAdult() {
        return age >= 18;
    }
    
    // Overriding default method
    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }
    
    public static void main(String[] args) {
        Person p = new Person("John", 20);
        System.out.println(p.greet());             // Hello, my name is John and I am 20 years old.
        System.out.println(p.isAdult());           // true
        System.out.println(p);                     // John is 20 years old.
    }
}
```

✅ **Explanation:**
1. Added **custom methods**: `greet()`, `isAdult()`.  
2. Added a **static factory method**: `createAdult()`.  
3. Overridden `toString()` method.

---

### 🚦 **7️⃣ Custom Constructor in Record Classes**

You can define **custom constructors** in record classes, but you must call the **canonical constructor**.

✅ **Example:**
```java
public record Employee(String name, double salary) {

    // Custom constructor
    public Employee {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
    }
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 50000);
        System.out.println(e1);  // Employee[name=Alice, salary=50000.0]

        // Throws exception
        Employee e2 = new Employee("Bob", -1000);  
    }
}
```

✅ **Explanation:**
1. The custom constructor **validates the salary**.  
2. The canonical constructor (`Employee(String, double)`) is automatically called.  
3. If the salary is negative, it throws an exception.

---

### 🚦 **8️⃣ Key Differences Between `Record` and `Class`**

| **Feature**        | **Record Class**                          | **Regular Class**                        |
|---------------------|-----------------------------------------|-----------------------------------------|
| **Boilerplate Code** | Automatically generates constructor, `equals()`, `hashCode()`, and `toString()`. | Manual implementation required.         |
| **Immutability**     | Fields are `final` by default.           | Fields can be mutable or immutable.     |
| **Inheritance**      | Cannot extend other classes.             | Can extend other classes.               |
| **Use Case**         | Used for data models or DTOs.            | Used for business logic and complex structures. |
| **Performance**      | More efficient due to auto-generated methods. | Slightly less efficient.                |

---

### 🚦 **9️⃣ When to Use Record Classes?**

✅ **1. Data Transfer Objects (DTOs):**
- Used to **carry data** between processes or layers.
```java
record UserDTO(String name, String email) { }
```

✅ **2. Value-Based Classes:**
- For **immutable data models**.
```java
record Point(int x, int y) { }
```

✅ **3. Configuration or Settings:**
- Store **configuration data**.
```java
record Config(String key, String value) { }
```

✅ **4. Database Entities or Responses:**
- Represent **database query results**.
```java
record User(int id, String name, String email) { }
```

---

### 🚦 **🔥 10️⃣ Key Takeaways**

✅ **Record Classes:**
- Introduced in **Java 14** (Preview) → Standard in **Java 16**.  
- Reduce **boilerplate code** by auto-generating methods.  
- Fields are **immutable** by default.  
- Cannot extend other classes.  

✅ **Use When:**
- You need **data carriers** with minimal code.  
- You want **immutable objects**.  
- You require **clean and readable code**.

---

### 💡 **🔥 Conclusion**
Record classes in Java provide a **concise and efficient way** to create data-holding classes, making your code **cleaner, safer, and more maintainable**. 🚀