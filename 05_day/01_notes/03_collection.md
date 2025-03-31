### ✅ **Java Collections – What, How, and Commonly Used Examples**

---

### 🔥 **What is Collection in Java?**

The **Collection framework** in Java is a **set of classes and interfaces** that provide a ready-made architecture to **store, manipulate, and manage groups of objects**. It is part of the `java.util` package and provides efficient ways to handle dynamic data structures like:
- **Lists**
- **Sets**
- **Queues**
- **Maps**

---

### 🚦 **Why Do We Need Collections?**
Before Java Collections, arrays were used to store data. However, arrays have **limitations**:
- **Fixed size**: Once declared, the size cannot be changed.
- **Inefficient insertion and deletion**: Operations like inserting or deleting elements require shifting array contents.
- **No built-in algorithms**: You must manually write sorting, searching, etc.

✅ **Collections overcome these limitations**:
- **Dynamic resizing:** Collections can grow or shrink dynamically.
- **Efficient operations:** Provides built-in methods for searching, sorting, and manipulating data.
- **Type safety:** Uses **Generics** to ensure type safety at compile-time.

---

### 🚀 **Hierarchy of Java Collections**

```
                Collection (Interface)
                    │
    ┌────────────────┴────────────────┐
    │                                 │
   List                             Set
    │                                 │
┌───────┬───────┬───────┐       ┌───────────┬──────────┐
ArrayList  LinkedList  Vector  HashSet     LinkedHashSet
                                     │
                                TreeSet
                                
                Map (Interface)
                   │
          ┌────────┴─────────┐
         HashMap      LinkedHashMap  
                        │
                      TreeMap
```

---

### 🔥 **How Collections Work Internally**
1. **Dynamic Memory Allocation:** Collections automatically **resize** when new elements are added or removed.
2. **Efficient Storage:** Collections internally use **arrays, linked lists, or hash tables** to store data efficiently.
3. **Generics:** Collections use **Generics** to enforce **type safety**, reducing runtime errors.

---

### 🔥 **Commonly Used Collections in Java**

### ✅ **1️⃣ `ArrayList`**
- **Ordered collection** that uses a **dynamic array** to store elements.
- **Fast retrieval** but slower insertion/deletion (as shifting is required).
- **Duplicates are allowed**.

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Banana");  // Allows duplicates

        System.out.println("ArrayList: " + list);

        // Removing element
        list.remove("Banana");
        System.out.println("After Removal: " + list);

        // Iterating over ArrayList
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
```
✅ **Output:**
```
ArrayList: [Apple, Banana, Orange, Banana]  
After Removal: [Apple, Orange, Banana]  
Fruit: Apple  
Fruit: Orange  
Fruit: Banana  
```

---

### ✅ **2️⃣ `LinkedList`**
- **Doubly linked list** implementation.
- **Faster insertion and deletion** compared to `ArrayList`.
- Slower in **retrieval** as it requires traversing the list.
- **Duplicates are allowed**.

```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Car");
        list.add("Bike");
        list.add("Truck");

        System.out.println("LinkedList: " + list);

        // Removing an element
        list.remove("Bike");
        System.out.println("After Removal: " + list);

        // Iterating over LinkedList
        for (String vehicle : list) {
            System.out.println("Vehicle: " + vehicle);
        }
    }
}
```
✅ **Output:**
```
LinkedList: [Car, Bike, Truck]  
After Removal: [Car, Truck]  
Vehicle: Car  
Vehicle: Truck  
```

---

### ✅ **3️⃣ `HashSet`**
- **Unordered collection** that uses a **hash table** for storage.
- **Does NOT allow duplicates**.
- Provides **constant-time performance** for insertion, removal, and lookup.
- Does not maintain insertion order.

```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");  // Duplicate, won't be added

        System.out.println("HashSet: " + set);

        // Iterating over HashSet
        for (String lang : set) {
            System.out.println("Language: " + lang);
        }
    }
}
```
✅ **Output (unordered):**
```
HashSet: [C++, Java, Python]  
Language: C++  
Language: Java  
Language: Python  
```

---

### ✅ **4️⃣ `HashMap`**
- Stores **key-value pairs**.
- Allows **null values** and **one null key**.
- **Unordered** collection.
- **No duplicate keys** allowed.
- Provides **constant-time** performance for basic operations.

```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("HashMap: " + map);

        // Accessing values
        System.out.println("Value at key 2: " + map.get(2));

        // Iterating over HashMap
        for (int key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
```
✅ **Output:**
```
HashMap: {1=One, 2=Two, 3=Three}  
Value at key 2: Two  
Key: 1, Value: One  
Key: 2, Value: Two  
Key: 3, Value: Three  
```

---

### ✅ **5️⃣ `TreeSet`**
- **Sorted set** that stores elements in **ascending order**.
- **No duplicates** allowed.
- Slower than `HashSet` but provides **automatic sorting**.

```java
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);  // Duplicate, won't be added

        System.out.println("TreeSet (Sorted): " + set);

        for (int num : set) {
            System.out.println("Number: " + num);
        }
    }
}
```
✅ **Output:**
```
TreeSet (Sorted): [10, 20, 30]  
Number: 10  
Number: 20  
Number: 30  
```

---

### 🚦 **Key Takeaways**

| **Collection**   | **Underlying Data Structure** | **Duplicates** | **Order Maintained** | **Use Case**             |
|------------------|------------------------------|----------------|----------------------|--------------------------|
| `ArrayList`      | Dynamic Array                | ✅ Yes          | ✅ Yes                | Fast retrieval, frequent access |
| `LinkedList`     | Doubly Linked List           | ✅ Yes          | ✅ Yes                | Frequent insertion/removal |
| `HashSet`        | Hash Table                   | ❌ No           | ❌ No                 | Unique elements, fast operations |
| `TreeSet`        | Red-Black Tree               | ❌ No           | ✅ Yes (sorted)        | Sorted unique values      |
| `HashMap`        | Hash Table                   | ❌ No (keys)    | ❌ No                 | Key-value pairs            |

---

✅ **💡 Conclusion**
- Java **Collections Framework** offers a wide range of data structures.
- You should select the appropriate collection based on:
  - **Performance needs** (fast retrieval, insertion, or sorting).
  - **Memory usage**.
  - **Order preservation** or uniqueness requirements. 🚀