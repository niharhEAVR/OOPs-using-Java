1. **Defining a `Student` class** with three fields: `name`, `rollNo`, and `marks`.
2. **Creating multiple `Student` objects** (`s1`, `s2`, `s3`) using the `new` keyword.
3. **Storing the objects in an array**: 
```java
Student[] students = new Student[3];
```
4. **Assigning the `Student` objects** to the array elements:
```java
students[0] = s1;  
students[1] = s2;  
students[2] = s3;  
```
5. **Using an enhanced `for` loop** to iterate over the array and print the details of each `Student` object.

---

### 🔥 **Key Concepts Demonstrated:**
1. **Class and Object Creation:**  
   - `Student` class with attributes.  
   - Multiple instances of the class (`s1`, `s2`, `s3`).  

2. **Array of Objects:**  
   - `Student[] students = new Student[3];` → Creates an array that can hold `Student` objects.

3. **Enhanced `for` loop:**  
   - Iterates over the array to access and print each `Student` object.

---

### ✅ **Proper Terminology for This Example**
- **"Array of Objects in Java"** → Since you are using an array to store multiple instances of the `Student` class.
- **"Object Array Iteration with Enhanced For Loop"** → The way you are looping through the array.
- **"OOP (Object-Oriented Programming) with Arrays"** → Since you are applying OOP principles using an array.

---

### 🚀 **Optimized Version Using a Constructor**
You can further simplify the code by using a **constructor** to initialize the `Student` objects.

```java
class Student {
    String name;
    int rollNo;
    float marks;

    // Constructor
    Student(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", CGPA: " + marks);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // Creating array of Student objects with constructor initialization
        Student[] students = {
            new Student("cooldude", 21, 6.5f),
            new Student("noname", 34, 7.5f),
            new Student("cluster", 12, 9.9f)
        };

        // Displaying student details
        for (Student student : students) {
            student.display();
        }
    }
}
```
✅ This version is **cleaner and more efficient**, as you initialize the objects directly in the constructor call.

---
---
---


### More examples of array of objects:

### ✅ **Array of Objects in Java – Explained with Examples**

In Java, an **array of objects** is simply an array where each element is an instance of a class or an object. This allows you to **store multiple objects** of the same type in a single array.

---

### 🔥 **1. Basic Syntax**
```java
ClassName[] arrayName = new ClassName[size];
```
- `ClassName[]`: Array of object references.
- `new ClassName[size]`: Allocates memory for the array, but the objects themselves need to be instantiated separately.

---

### 💡 **Example 1: Array of Objects with a `Person` Class**
```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class ObjectArray {
    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] people = new Person[3];

        // Initializing objects in the array
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 35);

        // Displaying the array of objects
        for (Person p : people) {
            p.display();
        }
    }
}
```
✅ **Output:**
```
Alice is 25 years old.  
Bob is 30 years old.  
Charlie is 35 years old.  
```
---

### 🔥 **2. Array of Objects with Constructor Initialization**
Instead of using the `new` keyword separately, you can **initialize the objects directly** in the array declaration.

```java
class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println(brand + " runs at " + speed + " km/h.");
    }
}

public class ObjectArray {
    public static void main(String[] args) {
        // Creating and initializing the array in one step
        Car[] cars = {
            new Car("Tesla", 200),
            new Car("BMW", 220),
            new Car("Audi", 210)
        };

        // Displaying the array of objects
        for (Car car : cars) {
            car.display();
        }
    }
}
```
✅ **Output:**
```
Tesla runs at 200 km/h.  
BMW runs at 220 km/h.  
Audi runs at 210 km/h.  
```
---

### 🔥 **3. Array of Objects with User Input**
You can **create an array of objects** by asking the user to enter the data using a `Scanner`.

```java
import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class ObjectArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of Student objects
        Student[] students = new Student[3];

        // Taking user input
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            
            students[i] = new Student(name, marks);
        }

        // Displaying the students
        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}
```
✅ **Sample Output:**
```
Enter name: John  
Enter marks: 85  
Enter name: Mike  
Enter marks: 90  
Enter name: Alice  
Enter marks: 95  

Student Details:  
Name: John, Marks: 85  
Name: Mike, Marks: 90  
Name: Alice, Marks: 95  
```
---

### 🔥 **4. Array of Objects with Multiple Classes**
You can create **arrays of objects with different classes**. 

```java
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " earns $" + salary);
    }
}

class Department {
    String deptName;
    Employee[] employees;

    Department(String deptName, Employee[] employees) {
        this.deptName = deptName;
        this.employees = employees;
    }

    void showDetails() {
        System.out.println("\nDepartment: " + deptName);
        for (Employee emp : employees) {
            emp.display();
        }
    }
}

public class ObjectArrayMultiple {
    public static void main(String[] args) {
        Employee[] team1 = {
            new Employee("Alice", 5000),
            new Employee("Bob", 6000)
        };

        Employee[] team2 = {
            new Employee("Charlie", 7000),
            new Employee("David", 8000)
        };

        Department d1 = new Department("HR", team1);
        Department d2 = new Department("IT", team2);

        d1.showDetails();
        d2.showDetails();
    }
}
```
✅ **Output:**
```
Department: HR  
Alice earns $5000.0  
Bob earns $6000.0  

Department: IT  
Charlie earns $7000.0  
David earns $8000.0  
```
---

### 🔥 **5. Sorting an Array of Objects**
You can **sort an array of objects** using `Arrays.sort()` with `Comparable` or `Comparator`.

```java
import java.util.Arrays;

class Product implements Comparable<Product> {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int compareTo(Product p) {
        return Double.compare(this.price, p.price);
    }

    public String toString() {
        return name + ": $" + price;
    }
}

public class ObjectArraySort {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Laptop", 1000.0),
            new Product("Phone", 500.0),
            new Product("Tablet", 750.0)
        };

        System.out.println("Before Sorting:");
        for (Product p : products) {
            System.out.println(p);
        }

        Arrays.sort(products);  // Sorting by price

        System.out.println("\nAfter Sorting:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
```
✅ **Output:**
```
Before Sorting:  
Laptop: $1000.0  
Phone: $500.0  
Tablet: $750.0  

After Sorting:  
Phone: $500.0  
Tablet: $750.0  
Laptop: $1000.0  
```
---

### ✅ **Key Takeaways**
1. **Creating an Array of Objects**
   - Use `ClassName[] array = new ClassName[size];` for initialization.
2. **Initializing the Objects**
   - You need to use `new` keyword separately or directly during initialization.
3. **Iterating Through Object Arrays**
   - Use `for` loop or **enhanced for loop**.
4. **User Input**
   - Use `Scanner` to initialize object arrays with user input.
5. **Sorting**
   - Use `Arrays.sort()` with `Comparable` or `Comparator`.
