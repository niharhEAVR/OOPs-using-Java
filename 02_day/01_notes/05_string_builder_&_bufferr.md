### ✅ **Difference Between `StringBuilder` and `StringBuffer` in Java**

In Java, both `StringBuilder` and `StringBuffer` are **mutable classes** used to create and manipulate modifiable strings.  
However, they differ mainly in **performance** and **thread-safety**.

---

### 🔥 **1. Key Differences:**

| **Aspect**         | **StringBuilder**                      | **StringBuffer**                        |
|--------------------|---------------------------------------|---------------------------------------|
| **Mutability**      | Mutable (modifies the original object) | Mutable (modifies the original object) |
| **Thread-Safety**   | **Not thread-safe**                    | **Thread-safe** (synchronized methods) |
| **Performance**     | **Faster** (better performance)        | **Slower** due to synchronization     |
| **Introduced In**   | Java 5                                 | Java 1.0                               |
| **Use Case**         | Suitable for **single-threaded** apps  | Suitable for **multi-threaded** apps   |

---

### 🔥 **2. What is Thread-Safety?**
- **Thread-safety** means that multiple threads can safely access and modify the same object **without data inconsistency**.  
- `StringBuffer` is thread-safe because its methods are **synchronized** (only one thread can access the method at a time).  
- `StringBuilder` is **not thread-safe**, making it faster for **single-threaded operations**.

---

### ✅ **3. Example of `StringBuilder` and `StringBuffer`**

### 📌 **Using `StringBuilder`:**
```java
public class BuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Modifying the same object (mutable)
        sb.append(" World");
        sb.insert(5, ","); 
        sb.replace(0, 5, "Hi");

        System.out.println(sb);  // Output: Hi, World
    }
}
```
✅ **Explanation:**
- `append()` → Adds " World" to the original string.  
- `insert()` → Inserts a comma after "Hi".  
- `replace()` → Replaces "Hello" with "Hi".  
- **Same object** is modified in memory (no new object created).

---

### 📌 **Using `StringBuffer`:**
```java
public class BufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        // Modifying the same object (mutable)
        sb.append(" Programming");
        sb.insert(4, "-");
        sb.delete(0, 4);
        sb.reverse();

        System.out.println(sb);  // Output: gnimmargorP-
    }
}
```
✅ **Explanation:**
- `append()` → Adds " Programming".  
- `insert()` → Adds `-` at index 4.  
- `delete()` → Removes the first 4 characters.  
- `reverse()` → Reverses the string.  
- Again, the **same object** is modified in memory.

---

### 🔥 **4. Thread-Safety Difference**

### 📌 **StringBuffer (Thread-Safe):**
In a **multi-threaded** environment, `StringBuffer` is safe because its methods are synchronized.

```java
public class BufferThreadExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Thread-Safe");

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                sb.append("!");
                System.out.println(sb);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
```
✅ **Output:**  
Even with multiple threads, the output is consistent and thread-safe.

---

### 📌 **StringBuilder (Not Thread-Safe):**
`StringBuilder` is **faster** but not thread-safe, so using it in multi-threaded apps **can lead to inconsistent results**.

```java
public class BuilderThreadExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Not Safe");

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                sb.append("!");
                System.out.println(sb);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
```
❗️ **Output:**  
You might see inconsistent or corrupted output due to **concurrent modification**.

---

### 🔥 **5. Performance Comparison**

- `StringBuilder` is **faster** for single-threaded operations because it lacks synchronization overhead.  
- `StringBuffer` is **slower** in multi-threaded environments due to synchronization overhead but is safer.

---

### ✅ **6. When to Use `StringBuilder` vs `StringBuffer`?**

| **Use `StringBuilder` When:**                      | **Use `StringBuffer` When:**                     |
|----------------------------------------------------|------------------------------------------------|
| You are working in a **single-threaded** environment. | You need to handle **multiple threads** safely.  |
| You need **faster performance**.                   | You need **thread-safety**.                     |
| You are doing **repeated string modifications**.    | You want to avoid **data inconsistency**.        |

---

### 🚀 **Key Takeaways**
1. **StringBuilder** → **Faster**, not thread-safe, for single-threaded apps.  
2. **StringBuffer** → **Thread-safe**, slower, for multi-threaded apps.  
3. Use `StringBuilder` for **better performance** in most cases, unless you specifically need thread-safety.  

---
---
---


### ✅ **Mutable vs Immutable Methods in Java**

In Java:
- **Mutable** → Means the object's **state (value)** can be changed after it is created.  
- **Immutable** → Means the object's **state cannot be changed** after creation.  

---

### 🔥 **1. Immutable Methods**
- Immutable methods **do not modify the original object**.  
- Instead, they **create a new object** with the modified value.  
- **All `String` methods** in Java are immutable because `String` objects are immutable.

---

### 📌 **Example of Immutable Methods with `String`:**
```java
public class ImmutableExample {
    public static void main(String[] args) {
        String str = "Hello";

        // Using immutable methods
        String newStr = str.toUpperCase();  // Creates a new object
        System.out.println(str);            // Output: Hello (original string remains unchanged)
        System.out.println(newStr);         // Output: HELLO (new object with modified value)
    }
}
```
✅ The `toUpperCase()` method does not change the original string (`str`), instead it creates a **new string** (`newStr`).

---

### 🔥 **2. Mutable Methods**
- Mutable methods **modify the original object** directly.  
- **`StringBuilder`** and **`StringBuffer`** provide mutable methods in Java.  
- Changes are made in the same memory location.

---

### 📌 **Example of Mutable Methods with `StringBuilder`:**
```java
public class MutableExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Using mutable methods
        sb.append(" World");    // Modifies the original object
        System.out.println(sb);  // Output: Hello World (modified original object)
    }
}
```
✅ The `append()` method **modifies the same object** (`sb`) without creating a new one.

---

### 🔥 **3. Key Difference Between Mutable and Immutable Methods**

| **Aspect**        | **Immutable Methods**                      | **Mutable Methods**                    |
|--------------------|------------------------------------------|---------------------------------------|
| **Objects Modified** | Do **not modify** the original object      | **Modify** the original object         |
| **Memory Usage**    | Creates a **new object**                   | Uses the **same object**               |
| **Classes**         | `String` (immutable)                       | `StringBuilder`, `StringBuffer` (mutable) |
| **Performance**     | Less efficient for repeated operations    | More efficient for repeated operations |
| **Thread Safety**    | Thread-safe (immutable is safe by default) | `StringBuffer` is thread-safe, `StringBuilder` is not |

---

### ✅ **4. Examples with Common Java Methods**

---

### 📌 **Immutable Methods:**
- All `String` methods are immutable because they create a new object.
```java
String str = "Java";

// Immutable methods (create new object)
String upper = str.toUpperCase();       // New object
String replaced = str.replace('a', 'o'); // New object
System.out.println(str);                // Output: Java (original unchanged)
System.out.println(upper);              // Output: JAVA (new object)
System.out.println(replaced);           // Output: Jovo (new object)
```

---

### 📌 **Mutable Methods:**
- `StringBuilder` and `StringBuffer` methods are mutable, modifying the same object.
```java
StringBuilder sb = new StringBuilder("Java");

// Mutable methods (modify original object)
sb.append(" Rocks!");      // Modifies the same object
sb.insert(0, "Hey, ");     // Inserts at the beginning
sb.replace(0, 3, "Wow");   // Replaces part of the original object
System.out.println(sb);    // Output: Wow, Java Rocks!
```

---

### ✅ **5. When to Use Mutable vs Immutable?**

- **Use Immutable (`String`) when:**
    - You need **constant/unchanging values**.
    - Strings need to be reused frequently (better memory management due to **String Pool**).
    - You want **thread-safety**.

- **Use Mutable (`StringBuilder`/`StringBuffer`) when:**
    - You need to **modify the string frequently**.
    - You want better **performance** for multiple operations.
    - Use `StringBuffer` for **thread-safe** operations.

---

### 🚀 **Key Takeaways**
1. **Immutable Methods:**  
   - Create a **new object** with the modified value.  
   - Example: `String` methods like `toUpperCase()`, `replace()`, `concat()`, etc.  

2. **Mutable Methods:**  
   - **Modify the original object** itself.  
   - Example: `StringBuilder` and `StringBuffer` methods like `append()`, `insert()`, and `replace()`.  
