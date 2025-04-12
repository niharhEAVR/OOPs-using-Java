Great! Let's talk about **Encapsulation** in Java — it's a core concept of Object-Oriented Programming (OOP), just like polymorphism.

---

### 🔐 What is **Encapsulation** in Java?

**Encapsulation** is the process of **wrapping data (variables)** and **code (methods)** together into a single unit — like a capsule.

In simple words:  
> **Encapsulation = Data hiding + Controlled access**

You **hide the internal details** of a class and **only expose what is necessary** through methods.

---

### 📦 Real-Life Analogy:
Think of a **capsule** (medicine) — you don’t see what's inside it, but it works when you take it.  
Similarly, in Java, the class hides the internal data, and you interact using public methods.

---

### ✅ How to achieve Encapsulation in Java?

1. **Make variables `private`**
2. **Use `public` getter and setter methods** to access/update the data

---

### 💻 Example:

```java
class Student {
    private String name;   // data hidden from outside
    private int age;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}
```

### 👇 Usage:
```java
public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Amit");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
```

---

### 🛡️ Why Encapsulation?

- ✅ Protects data from unauthorized access
- ✅ Makes code more maintainable and flexible
- ✅ Helps in data validation (like age can't be negative)
- ✅ Allows you to change internal code without affecting external classes
