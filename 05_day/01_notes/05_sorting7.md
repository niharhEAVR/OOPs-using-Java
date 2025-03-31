### ✅ **Sorting by Last Digit Using Both `Comparable` and `Comparator` in Java**

---

### 🔥 **1️⃣ Using `Comparable` (Modifying the Class Itself)**

To sort by the **last digit**, you need to create a **wrapper class** around `Integer` and implement the `Comparable` interface. This modifies the default sorting behavior.

---

### **✅ Example with `Comparable`:**
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LastDigit implements Comparable<LastDigit> {
    int value;

    LastDigit(int value) {
        this.value = value;
    }

    // Compare by last digit
    @Override
    public int compareTo(LastDigit other) {
        return (this.value % 10) - (other.value % 10);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

public class SortingWithComparable {
    public static void main(String[] args) {
        List<LastDigit> list = new ArrayList<>();
        
        list.add(new LastDigit(87));
        list.add(new LastDigit(12));
        list.add(new LastDigit(56));
        list.add(new LastDigit(34));

        // Sorting by last digit
        Collections.sort(list);

        System.out.println("Sorted by last digit (Comparable): " + list);
    }
}
```

✅ **Explanation:**
1. Created a **custom class `LastDigit`** that wraps an `int`.
2. Implemented `Comparable<LastDigit>` and overrode the `compareTo()` method to **sort by last digit**.
3. Used `Collections.sort()` to apply the custom sorting.

✅ **Output:**
```
Sorted by last digit (Comparable): [12, 34, 56, 87]  
```

---

### 🔥 **2️⃣ Using `Comparator` (Custom Sorting Logic)**

With `Comparator`, you don't need to modify the class itself. Instead, you can define the **custom sorting logic externally**.

---

### **✅ Example with `Comparator`:**
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(87);
        list.add(12);
        list.add(56);
        list.add(34);

        // Sorting using Comparator by last digit
        Collections.sort(list, (a, b) -> (a % 10) - (b % 10));

        System.out.println("Sorted by last digit (Comparator): " + list);
    }
}
```

✅ **Explanation:**
1. The `Comparator` uses a **lambda expression**:  
   ```java
   (a, b) -> (a % 10) - (b % 10)
   ```
   - `a % 10` → Gets the last digit of the first number.  
   - `b % 10` → Gets the last digit of the second number.  
   - Subtracts the two to sort by the last digit.
2. The sorting logic is applied externally using `Collections.sort()`.

✅ **Output:**
```
Sorted by last digit (Comparator): [12, 34, 56, 87]  
```

---

### 🚦 **3️⃣ Key Differences**

| **Feature**           | **Comparable**                            | **Comparator**                     |
|------------------------|-----------------------------------------|-----------------------------------|
| **Where sorting logic is defined** | Inside the class itself            | Outside the class using lambda or a separate class |
| **Flexibility**         | Can only sort by **one natural order**   | Can define **multiple sorting criteria** |
| **Modification**        | Modifies the original class              | Does not modify the original class |
| **Usage**               | When you want a **single sorting behavior** | When you need **custom or multiple sorting behaviors** |

---

### ✅ **💡 Conclusion**
- If you want to **define sorting behavior inherently** in the class → Use `Comparable`.
- If you want **custom sorting externally** or multiple sorting behaviors → Use `Comparator`.

💡 **In this case:**  
✅ **`Comparator` is more suitable** because you don't need to modify the `Integer` class. You can simply define the sorting logic externally.