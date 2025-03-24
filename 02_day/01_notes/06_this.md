### ✅ **`this` Keyword in Java**

The `this` keyword in Java is a **reference variable** that refers to the **current object**.  
It is used to **access instance variables, call current class methods or constructors**, and pass the current object as a parameter.

---

### 🔥 **1. Use Cases of `this` in Java**

---

### 📌 **1.1. Referring to Current Object’s Instance Variables**
- When local variables have the **same name** as instance variables, `this` differentiates them.  
- Without `this`, Java assumes you are referring to the local variable.  

✅ **Example:**
```java
class Student {
    String name;
    int rollNo;

    // Constructor with parameters
    Student(String name, int rollNo) {
        // Using 'this' to refer to instance variables
        this.name = name;         // Refers to the instance variable
        this.rollNo = rollNo;     // Refers to the instance variable
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        s1.display();
    }
}
```
✅ **Output:**
```
Name: Alice  
Roll No: 101  
```
🔹 **Explanation:**  
- `this.name = name;` → Assigns the **instance variable** `name` the value of the constructor parameter `name`.  
- Without `this`, Java would refer to the local variable instead of the instance variable.  

---

### 📌 **1.2. Calling Current Class Methods**
- You can use `this` to call **current class methods**.  
- This is useful when you want to **chain method calls**.

✅ **Example:**
```java
class Person {
    void greet() {
        System.out.println("Hello, welcome!");
    }

    void display() {
        System.out.println("Calling greet() using this:");
        this.greet();   // Calls current class method
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}
```
✅ **Output:**
```
Calling greet() using this:  
Hello, welcome!  
```
🔹 **Explanation:**  
- `this.greet()` → Calls the `greet()` method of the current object.  
- You can also **omit `this`**, and it will still work, but using `this` makes it clear that you are calling the current object's method.

---

### 📌 **1.3. Calling Current Class Constructor**
- The `this()` keyword is used to **call the current class constructor** from another constructor.  
- This is known as **constructor chaining**.  

✅ **Example:**
```java
class Employee {
    String name;
    int age;

    // First constructor
    Employee() {
        this("Unknown", 0);   // Calling another constructor
        System.out.println("Default Constructor");
    }

    // Second constructor
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor: " + name + ", " + age);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();       // Calls the default constructor
        Employee e2 = new Employee("John", 25);  // Calls the parameterized constructor
    }
}
```
✅ **Output:**
```
Parameterized Constructor: Unknown, 0  
Default Constructor  
Parameterized Constructor: John, 25  
```
🔹 **Explanation:**  
- `this("Unknown", 0)` → Calls the **parameterized constructor** from the **default constructor**.  
- This is **constructor chaining**, which helps in code reusability.

---

### 📌 **1.4. Returning Current Object**
- You can use `this` to **return the current object** from a method.  
- This is useful when you want to **chain method calls**.

✅ **Example:**
```java
class Car {
    String model;
    int year;

    Car setModel(String model) {
        this.model = model;  // Refers to the current object's instance variable
        return this;          // Returns the current object
    }

    Car setYear(int year) {
        this.year = year;
        return this;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Tesla").setYear(2025).display();  // Method chaining
    }
}
```
✅ **Output:**
```
Model: Tesla, Year: 2025
```
🔹 **Explanation:**  
- `return this` → Returns the current object to allow **method chaining**.  
- This lets you call multiple methods on the same object in a single line.

---

### 📌 **1.5. Passing Current Object as a Parameter**
- You can pass the current object as a parameter using `this`.  
- This is helpful when **calling another method or constructor** that requires an object of the same class.

✅ **Example:**
```java
class Box {
    int length, width;

    Box(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void display(Box obj) {    // Accepts a Box object as parameter
        System.out.println("Length: " + obj.length + ", Width: " + obj.width);
    }

    void show() {
        display(this);         // Passing current object as parameter
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 5);
        b1.show();
    }
}
```
✅ **Output:**
```
Length: 10, Width: 5
```
🔹 **Explanation:**  
- `display(this)` → Passes the **current object** as a parameter to the `display()` method.  
- This helps when you want to pass the current object to another method.

---

### ✅ **2. Key Takeaways of `this` Keyword**
| **Usage**                | **Purpose**                                            |
|---------------------------|-------------------------------------------------------|
| `this.variable`           | Refers to **current object’s instance variable**.     |
| `this.methodName()`        | Calls **current class method**.                      |
| `this()`                   | Calls **current class constructor** (constructor chaining). |
| `return this`              | Returns **current object**.                          |
| `this` as parameter       | Passes **current object** as a parameter.            |

---

### 🚀 **When to Use `this`:**
- When local variables and instance variables have the **same name**.  
- For **method chaining**.  
- When you want to **call one constructor from another**.  
- When passing the **current object** as an argument.  
