### ✅ **`throws` Keyword in Java – Explained in Detail**

---

### 🔥 **What is the `throws` Keyword?**
The `throws` keyword in Java is used to:
- **Declare exceptions** that a method might throw.  
- It informs the **caller of the method** that it may need to handle the exception.  
- It is part of **exception handling** in Java, used during **compile-time**.  

---

### 🚀 **Syntax:**
```java
returnType methodName() throws ExceptionType1, ExceptionType2 {
    // Method code that might throw exceptions
}
```
- `returnType`: The return type of the method (e.g., `void`, `int`).  
- `methodName`: The name of the method.  
- `throws`: Declares the exceptions that the method might throw.  
- `ExceptionType1, ExceptionType2`: The list of exceptions separated by commas.  

---

### 🔥 **Difference Between `throw` and `throws`:**
| **`throw`**                              | **`throws`**                        |
|------------------------------------------|------------------------------------|
| Used to **explicitly throw an exception** inside a method or block. | Used to **declare exceptions** that a method might throw. |
| Can only throw **one exception** at a time. | Can declare **multiple exceptions** separated by commas. |
| Syntax: `throw new Exception();`         | Syntax: `void myMethod() throws IOException, SQLException` |
| Used **inside the method**.              | Used **in the method signature**. |

---

### 🔥 **Example 1: Using `throws` with a Method**
In this example:
- The `myMethod()` declares that it might throw an `IOException` using `throws`.  
- The `main()` method handles the exception with a `try-catch` block.  

```java
import java.io.IOException;

public class Main {

    // Method that might throw an exception
    static void myMethod() throws IOException {
        System.out.println("Inside myMethod...");
        
        // Throwing IOException
        throw new IOException("An I/O error occurred.");
    }

    public static void main(String[] args) {
        try {
            myMethod();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
```
✅ **Explanation:**
1. `myMethod()` declares using `throws IOException` that it might throw an `IOException`.
2. The `main()` method calls `myMethod()` inside a `try` block.  
3. If an exception occurs, it is caught in the `catch` block and the message is printed.

✅ **Output:**  
```
Inside myMethod...  
Exception caught: An I/O error occurred.  
```

---

### 🔥 **Example 2: Multiple Exceptions with `throws`**
You can declare **multiple exceptions** separated by commas.

```java
import java.io.IOException;
import java.sql.SQLException;

public class Main {

    // Method that throws multiple exceptions
    static void processData() throws IOException, SQLException {
        System.out.println("Processing data...");
        
        // Throwing exceptions
        if (Math.random() > 0.5) {
            throw new IOException("File not found!");
        } else {
            throw new SQLException("Database error!");
        }
    }

    public static void main(String[] args) {
        try {
            processData();
        } catch (IOException | SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```
✅ **Explanation:**
1. `processData()` throws **both `IOException` and `SQLException`**.  
2. The `try-catch` block handles both exceptions using `|` (**multi-catch** syntax).  
3. It prints the appropriate exception message.

✅ **Output (randomly):**
```
Processing data...  
Exception: File not found!  
```
OR  
```
Processing data...  
Exception: Database error!  
```

---

### 🔥 **When to Use `throws`?**
You should use `throws` when:
1. **Delegating Exception Handling** → If you want the calling method to handle the exception instead of handling it locally.
2. **Checked Exceptions** → When calling methods that throw checked exceptions, you must either handle them or declare them using `throws`.
3. **Multiple Exception Handling** → When a method throws multiple exceptions, `throws` allows you to declare all of them.

---

### 🚀 **Checked vs. Unchecked Exceptions with `throws`**
- **Checked Exceptions:** Must be handled using `try-catch` or declared using `throws`.
    - E.g., `IOException`, `SQLException`, `FileNotFoundException`
- **Unchecked Exceptions:** Do not require handling or declaration with `throws`.
    - E.g., `NullPointerException`, `ArithmeticException`

✅ **Example with Checked Exception:**
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    // Method with checked exception
    static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        System.out.println(reader.readLine());
        reader.close();
    }

    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```
- `readFile()` uses `throws IOException` because `FileReader` can throw an `IOException`.
- The `main()` method handles it using `try-catch`.

---

### 🔥 **Key Takeaways**
✅ The `throws` keyword:
- **Declares exceptions** in the method signature.  
- Passes the responsibility of handling exceptions to the **calling method**.  
- Used with **checked exceptions**.  
- Allows multiple exceptions separated by commas.  

---

### 🚀 **✨ Best Practices**
1. **Use `throws` for checked exceptions** to indicate that the method might throw them.  
2. **Use specific exceptions** instead of the generic `Exception` class for clarity.  
3. **Combine multiple exceptions** with `|` in multi-catch blocks for efficiency.  
4. **Avoid overusing `throws`** for unchecked exceptions, as they don't require it.  

✅ Let me know if you need more examples or further explanations! 🚀