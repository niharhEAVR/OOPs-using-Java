### ✅ **`Comparator` vs `Comparable` in Java**

---

### 🔥 **1️⃣ What are `Comparable` and `Comparator`?**

Both `Comparable` and `Comparator` are **interfaces used for sorting objects** in Java, but they have **different purposes** and use cases.

|  **Feature**         |  **`Comparable`**                         |  **`Comparator`**                     |
|-----------------------|-----------------------------------------|--------------------------------------|
| **Package**           | `java.lang`                             | `java.util`                         |
| **Used for**           | Natural/default ordering of objects     | Custom ordering of objects          |
| **Modifies the class?** | Class itself implements the interface   | Separate class defines sorting logic |
| **Method**             | `compareTo(Object o)`                   | `compare(Object o1, Object o2)`      |
| **Single or multiple sorting** | Only **one sorting sequence**     | Multiple sorting criteria possible   |
| **Default behavior**   | Used for **default sorting** (natural order) | Used for **custom sorting**          |

---

### 🚦 **2️⃣ When to Use `Comparable` vs `Comparator`?**
✅ **Use `Comparable`:**
- When you want to **define natural sorting** behavior for your class.
- When sorting logic is **inherent** to the class.

✅ **Use `Comparator`:**
- When you want **custom sorting** logic.
- When you want to sort by **multiple fields** or in different ways.

---

### 🔥 **3️⃣ Example with `Comparable`**

The `Comparable` interface defines **natural ordering** by implementing the `compareTo()` method.

```java
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Sorting by ID (Natural Order)
    @Override
    public int compareTo(Student other) {
        return this.id - other.id;  // Ascending order by ID
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", 22));
        students.add(new Student(1, "Bob", 20));
        students.add(new Student(2, "Charlie", 21));

        // Sorting using Comparable
        Collections.sort(students);

        System.out.println("Sorted by ID (Comparable):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
```

✅ **Output:**
```
Sorted by ID (Comparable):  
ID: 1, Name: Bob, Age: 20  
ID: 2, Name: Charlie, Age: 21  
ID: 3, Name: Alice, Age: 22  
```

---

### 🔥 **4️⃣ Example with `Comparator`**

The `Comparator` interface allows **custom sorting** using the `compare()` method.

```java
import java.util.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", 22));
        students.add(new Student(1, "Bob", 20));
        students.add(new Student(2, "Charlie", 21));

        // Sort by Age
        Comparator<Student> ageComparator = (s1, s2) -> s1.age - s2.age;

        // Sort by Name
        Comparator<Student> nameComparator = (s1, s2) -> s1.name.compareTo(s2.name);

        // Sorting by Age
        Collections.sort(students, ageComparator);
        System.out.println("Sorted by Age:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by Name
        Collections.sort(students, nameComparator);
        System.out.println("\nSorted by Name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
```

✅ **Output:**
```
Sorted by Age:  
ID: 1, Name: Bob, Age: 20  
ID: 2, Name: Charlie, Age: 21  
ID: 3, Name: Alice, Age: 22  

Sorted by Name:  
ID: 3, Name: Alice, Age: 22  
ID: 1, Name: Bob, Age: 20  
ID: 2, Name: Charlie, Age: 21  
```

---

### 🚦 **5️⃣ Key Differences in Method Signatures**

✅ **Comparable**
```java
public interface Comparable<T> {
    int compareTo(T o);
}
```
- Takes **one parameter**.
- Used for **natural ordering** of objects.

✅ **Comparator**
```java
public interface Comparator<T> {
    int compare(T o1, T o2);
}
```
- Takes **two parameters**.
- Used for **custom ordering** of objects.

---

### 🚦 **6️⃣ Real-World Use Case**
Imagine you have an `Employee` class and you want to:
- Sort employees by **ID** by default → Use `Comparable`.
- Provide custom sorting by **salary, name, or department** → Use `Comparator`.

---

### ✅ **7️⃣ When to Use Which?**

| **Scenario**              | **Use**              |
|----------------------------|----------------------|
| Natural sorting (default)   | `Comparable`         |
| Custom sorting logic        | `Comparator`         |
| Sort by multiple fields     | `Comparator`         |
| One sorting behavior only   | `Comparable`         |
| Multiple sorting behaviors  | `Comparator`         |
| Built-in sorting (like `String`, `Integer`) | `Comparable` |

---

### 🚦 **8️⃣ Key Takeaways**

- `Comparable`: 
  - Used for **natural sorting**.
  - Defined within the **class itself**.
  - Uses `compareTo()` method.
  - Can have **only one sorting criteria**.

- `Comparator`: 
  - Used for **custom sorting**.
  - Defined as a **separate class** or lambda.
  - Uses `compare()` method.
  - Can have **multiple sorting criteria**.

✅ **💡 Pro Tip:**  
When you need **one consistent sorting** → Use `Comparable`.  
When you need **flexible or multiple sorting** → Use `Comparator`. 🚀