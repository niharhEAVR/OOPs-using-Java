### ✅ **1. Method Overloading**
The code you shared demonstrates **method overloading**, which is a feature in Java that allows you to define **multiple methods with the same name** but with different parameter lists (different types, numbers, or both).

In your code:
```java
public void add(int a, int b) {
    System.out.println(a + b);
}
```
- This is the first `add` method, which takes **two `int` parameters** and prints their sum.

```java
public void add(int a, int b, int c) {
    System.out.println(a + b + c);
}
```
- This is the second `add` method, which takes **three `int` parameters** and prints their sum.

### 💡 **Why is this allowed?**
Because the **parameter list** is different, Java considers these as **two separate methods**, even though they have the same name. This is the essence of **method overloading**.

---

### ✅ **2. Using the Methods**
When you call:
```java
calc.add(2, 2);
```
- The **first `add` method** (which takes two parameters) is called, so it outputs:
```
4
```

When you call:
```java
calc.add(10, 20, 30);
```
- The **second `add` method** (which takes three parameters) is called, so it outputs:
```
60
```

---

### 🔥 **Key Takeaway**
- **Method overloading** allows you to create multiple methods with the same name but different parameter lists.
- The compiler distinguishes between the methods based on their **parameter count and types**.
- This improves **code readability and flexibility** because you can use the same method name for different operations.

---

### ✅ **Example with Different Parameter Types**
You can also overload methods by using different data types:
```java
public class Calculator {
    // Overloaded methods
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void add(String a, String b) {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        calc.add(2, 3);                  // Calls int version → 5
        calc.add(2.5, 3.7);              // Calls double version → 6.2
        calc.add("Hello", "World");      // Calls String version → Hello World
    }
}
```

---

💡 **Key Benefits of Method Overloading:**
- Improves **code readability**.
- Makes the code **flexible** and easier to maintain.
- Reduces the need for different method names (`addInt()`, `addDouble()`, etc.) by reusing the same name.
