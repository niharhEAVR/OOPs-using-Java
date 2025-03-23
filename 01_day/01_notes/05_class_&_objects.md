### ✅ **Java: Classes and Objects – Explained with Examples**

---

### 🔥 **1. What is a Class in Java?**

- A **class** is a **blueprint** or **template** for creating objects.  
- It defines the **properties (variables)** and **behaviors (methods)** of an object.  
- You can think of a class as a **plan** or a **recipe** for creating objects.

✅ **Syntax:**
```java
class ClassName {
    // Variables (attributes)
    // Methods (functions)
}
```

✅ **Example:**
```java
// Defining a class
public class Car {

    // Instance variables (attributes)
    String brand;
    int speed;

    // Method to display car info
    void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
```
---

### 🔥 **2. What is an Object in Java?**

- An **object** is an **instance** of a class.  
- It is created based on the **blueprint** defined by the class.  
- **Objects hold actual values** of the properties and can perform actions using the methods.  

✅ **Creating an Object:**
```java
ClassName obj = new ClassName();
```
- `new` → Allocates memory for the object.  
- `ClassName()` → Calls the **constructor** of the class.  
- `obj` → Reference variable pointing to the object.  

✅ **Example:**
```java
public class Main {
    public static void main(String[] args) {

        // Creating objects of Car class
        Car car1 = new Car();
        Car car2 = new Car();

        // Assigning values to object properties
        car1.brand = "Toyota";
        car1.speed = 120;

        car2.brand = "Honda";
        car2.speed = 150;

        // Calling methods on objects
        car1.displayCarInfo();
        System.out.println();
        car2.displayCarInfo();
    }
}
```

✅ **Output:**
```
Brand: Toyota  
Speed: 120 km/h  

Brand: Honda  
Speed: 150 km/h  
```

---

### 🔥 **3. Key Components of a Class**

A **class** in Java typically contains:
1. **Attributes (Instance Variables)** → Store data or state.  
2. **Methods** → Define the behavior of the object.  
3. **Constructor** → Initializes object properties.  
4. **Getters and Setters** → To access and modify variables (Encapsulation).  

✅ **Example with Constructor, Getters, and Setters:**
```java
public class Person {

    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        p1.displayInfo();

        // Using setter to modify value
        p1.setName("Bob");
        System.out.println("\nAfter using setter:");
        p1.displayInfo();
    }
}
```
✅ **Output:**
```
Name: Alice  
Age: 25  

After using setter:  
Name: Bob  
Age: 25  
```

---

### 🔥 **4. Multiple Objects from the Same Class**

You can create **multiple objects** from the same class.  
Each object has its **own copy of instance variables**.

✅ **Example:**
```java
public class Dog {
    String breed;
    int age;

    // Method
    void display() {
        System.out.println("Breed: " + breed + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        
        // Creating multiple objects
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.breed = "Labrador";
        dog1.age = 5;

        dog2.breed = "German Shepherd";
        dog2.age = 3;

        dog1.display();
        dog2.display();
    }
}
```
✅ **Output:**
```
Breed: Labrador, Age: 5  
Breed: German Shepherd, Age: 3  
```

---

### 🔥 **5. Difference Between Class and Object**

| **Feature**    | **Class**                       | **Object**                    |
|----------------|--------------------------------|-------------------------------|
| **Definition** | Blueprint or template           | Instance of the class         |
| **Memory**     | No memory is allocated          | Memory is allocated           |
| **Syntax**     | `class ClassName {}`            | `ClassName obj = new ClassName();` |
| **Usage**      | Defines attributes and methods  | Stores real values and performs actions |
| **Existence**  | Logical entity                  | Physical entity               |

---

### 🔥 **6. Real-Life Analogy**

Imagine you are building a **car factory**:
- The **class** is the **blueprint or template** that defines how the car should be made (brand, speed, color, etc.).  
- The **objects** are the **actual cars** produced using the blueprint.  
- Each object has its **own unique values** for brand, speed, and color.  

---

### 🚀 **Key Takeaways**

✅ **Class:**  
- Blueprint or template.  
- Contains attributes and methods.  
- No memory is allocated.  

✅ **Object:**  
- Instance of a class.  
- Holds actual values and performs operations.  
- Memory is allocated at runtime.  

✅ **Features of Objects:**  
- **State:** Represented by attributes (variables).  
- **Behavior:** Represented by methods.  
- **Identity:** Each object has a unique reference in memory.
