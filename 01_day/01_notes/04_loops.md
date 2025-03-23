### ✅ **All Loops in Java – Explained with Examples**

Java provides **four types of loops**:
1. `for` loop  
2. `while` loop  
3. `do-while` loop  
4. **Enhanced `for` loop** (for-each loop)

---

### 🔥 **1. `for` Loop**
The `for` loop is used when you **know the exact number of iterations**.

✅ **Syntax:**
```java
for(initialization; condition; increment/decrement) {
    // Code to be executed
}
```
- **Initialization** → Executed once, at the beginning.  
- **Condition** → Loop continues **as long as the condition is `true`**.  
- **Increment/Decrement** → Modifies the loop variable after each iteration.  

✅ **Example:**
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
```
✅ **Output:**
```
Iteration: 1  
Iteration: 2  
Iteration: 3  
Iteration: 4  
Iteration: 5  
```

---

### 🔥 **2. `while` Loop**
The `while` loop is used when you **don’t know how many times** the loop will run.  
It continues **as long as the condition is `true`**.

✅ **Syntax:**
```java
while(condition) {
    // Code to be executed
}
```
- **Condition** → Checked **before** executing the loop body.  

✅ **Example:**
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
    }
}
```
✅ **Output:**
```
Iteration: 1  
Iteration: 2  
Iteration: 3  
Iteration: 4  
Iteration: 5  
```

---

### 🔥 **3. `do-while` Loop**
The `do-while` loop is similar to the `while` loop, but:  
- The **body executes at least once**, **even if the condition is `false`**.  
- The condition is **checked after** executing the loop body.

✅ **Syntax:**
```java
do {
    // Code to be executed
} while (condition);
```

✅ **Example:**
```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);
    }
}
```
✅ **Output:**
```
Iteration: 1  
Iteration: 2  
Iteration: 3  
Iteration: 4  
Iteration: 5  
```

✅ **Example with `false` condition:**
```java
int i = 10;

do {
    System.out.println("Executed once!");
} while (i < 5);  // false condition
```
✅ **Output:**
```
Executed once!
```
> Even though the condition is `false`, the loop body runs **once**.

---

### 🔥 **4. Enhanced `for` Loop (for-each Loop)**  
Introduced in **Java 5**, the **for-each** loop is used to **iterate over arrays or collections**.  
- **Simplifies the syntax** for iterating over collections or arrays.  
- Avoids the need for manual index manipulation.

✅ **Syntax:**
```java
for(dataType item : array) {
    // Code to be executed
}
```

✅ **Example with an Array:**
```java
public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
```
✅ **Output:**
```
Number: 10  
Number: 20  
Number: 30  
Number: 40  
Number: 50  
```

✅ **Example with a `List`:**
```java
import java.util.ArrayList;

public class ForEachList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
```
✅ **Output:**
```
Fruit: Apple  
Fruit: Banana  
Fruit: Mango  
```

---

### 🔥 **Key Differences Between the Loops**

| **Feature**         | **`for` Loop**                 | **`while` Loop**               | **`do-while` Loop**              | **`for-each` Loop**         |
|----------------------|-------------------------------|-------------------------------|---------------------------------|------------------------------|
| **Iteration Count**  | Fixed, based on condition     | Based on condition             | At least **one iteration**       | Iterates through collection   |
| **Execution Flow**   | Condition checked first       | Condition checked first        | Condition checked after body    | Iterates automatically        |
| **Use Case**         | When you know the iteration count | When you don't know the count  | Ensures at least one execution  | Arrays/collections            |
| **Syntax simplicity** | Complex                       | Simpler than `for`             | Similar to `while`, executes once first | Simplified syntax            |

---

### 🚀 **Break and Continue in Loops**

✅ **`break`** → Exits the loop entirely.  
✅ **`continue`** → Skips the current iteration and continues with the next.

✅ **Example:**
```java
public class BreakContinueExample {
    public static void main(String[] args) {
        System.out.println("Using break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // Exits loop when i == 3
            }
            System.out.println(i);
        }

        System.out.println("\nUsing continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Skips iteration when i == 3
            }
            System.out.println(i);
        }
    }
}
```
✅ **Output:**
```
Using break:  
1  
2  

Using continue:  
1  
2  
4  
5  
```

---

### 🚀 **Key Takeaways**
✅ **`for` Loop:** Best when the number of iterations is known.  
✅ **`while` Loop:** Used when the number of iterations is unknown.  
✅ **`do-while` Loop:** Executes **at least once**, even with a `false` condition.  
✅ **Enhanced `for` Loop:** Simplifies iteration over arrays and collections.  
✅ **`break` & `continue`:** Used to control loop flow.
