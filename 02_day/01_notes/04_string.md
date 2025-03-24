### ✅ **`String` in Java – Overview and Methods with Examples**

In Java, `String` is a **class** that represents a sequence of characters. Strings are **immutable**, meaning their value cannot be changed once created. Java provides a rich set of methods to **manipulate, compare, and process strings**.

---

### 🔥 **1. Creating Strings**
You can create strings in Java in two ways:

#### 📌 **1.1 Using String Literals (String Pool)**
```java
String str1 = "Hello";  // Stored in String Pool
```

#### 📌 **1.2 Using `new` Keyword (Heap Memory)**
```java
String str2 = new String("Hello");  // Stored in Heap Memory
```

✅ **Difference:**  
- **Literals** → Stored in the **String Pool** (more memory-efficient).  
- **`new` keyword** → Creates a new object in the **Heap Memory**, even if the value already exists in the pool.  

---

### 🔥 **2. Important `String` Methods with Examples**

---

### 📌 **2.1 `length()` → Returns the length of the string**
```java
String str = "Hello World";
System.out.println(str.length());  // Output: 11
```

---

### 📌 **2.2 `charAt(index)` → Returns the character at the specified index**
```java
String str = "Java";
System.out.println(str.charAt(0));   // Output: J
System.out.println(str.charAt(2));   // Output: v
```

---

### 📌 **2.3 `toUpperCase()` and `toLowerCase()` → Changes the case of the string**
```java
String str = "Java";
System.out.println(str.toUpperCase());  // Output: JAVA
System.out.println(str.toLowerCase());  // Output: java
```

---

### 📌 **2.4 `concat()` → Concatenates (joins) two strings**
```java
String str1 = "Hello";
String str2 = " World";
System.out.println(str1.concat(str2));  // Output: Hello World
```
✅ You can also use the `+` operator:
```java
System.out.println(str1 + str2);   // Output: Hello World
```

---

### 📌 **2.5 `equals()` → Compares two strings (case-sensitive)**
```java
String str1 = "Java";
String str2 = "java";

System.out.println(str1.equals(str2));        // Output: false
System.out.println(str1.equals("Java"));      // Output: true
```

---

### 📌 **2.6 `equalsIgnoreCase()` → Compares two strings (case-insensitive)**
```java
String str1 = "Java";
String str2 = "java";

System.out.println(str1.equalsIgnoreCase(str2));  // Output: true
```

---

### 📌 **2.7 `contains()` → Checks if the string contains a sequence of characters**
```java
String str = "Java Programming";

System.out.println(str.contains("Java"));   // Output: true
System.out.println(str.contains("C++"));    // Output: false
```

---

### 📌 **2.8 `startsWith()` and `endsWith()` → Checks if a string starts or ends with a given prefix/suffix**
```java
String str = "Hello World";

System.out.println(str.startsWith("Hello"));  // Output: true
System.out.println(str.endsWith("World"));    // Output: true
System.out.println(str.endsWith("Java"));     // Output: false
```

---

### 📌 **2.9 `replace()` → Replaces characters or substrings**
```java
String str = "Java is fun";
System.out.println(str.replace("fun", "awesome"));  // Output: Java is awesome
System.out.println(str.replace('a', 'o'));          // Output: Jovo is fun
```

---

### 📌 **2.10 `substring()` → Extracts part of the string**
```java
String str = "Java Programming";

// Extracting from index 5 to the end
System.out.println(str.substring(5));       // Output: Programming

// Extracting from index 0 to 4 (excluding 4)
System.out.println(str.substring(0, 4));    // Output: Java
```

---

### 📌 **2.11 `split()` → Splits the string into an array based on a delimiter**
```java
String str = "apple,banana,orange";

// Split by comma
String[] fruits = str.split(",");

for (String fruit : fruits) {
    System.out.println(fruit);
}
```
✅ **Output:**
```
apple  
banana  
orange  
```

---

### 📌 **2.12 `trim()` → Removes leading and trailing whitespace**
```java
String str = "   Java    ";
System.out.println(str.trim());  // Output: "Java"
```

---

### 📌 **2.13 `indexOf()` and `lastIndexOf()` → Returns the index of the first/last occurrence of a character or substring**
```java
String str = "Java Programming";

System.out.println(str.indexOf('a'));         // Output: 1 (first occurrence)
System.out.println(str.lastIndexOf('a'));     // Output: 14 (last occurrence)
System.out.println(str.indexOf("Program"));   // Output: 5
```

---

### 📌 **2.14 `isEmpty()` and `isBlank()` → Checks if the string is empty or blank**
```java
String str1 = "";
String str2 = "   ";
System.out.println(str1.isEmpty());    // Output: true
System.out.println(str2.isEmpty());    // Output: false
System.out.println(str2.isBlank());    // Output: true
```

---

### 📌 **2.15 `valueOf()` → Converts data types to string**
```java
int num = 100;
double pi = 3.14;
boolean flag = true;

System.out.println(String.valueOf(num));    // Output: "100"
System.out.println(String.valueOf(pi));     // Output: "3.14"
System.out.println(String.valueOf(flag));   // Output: "true"
```

---

### 📌 **2.16 `join()` → Joins multiple strings with a delimiter**
```java
String joined = String.join(", ", "Java", "C++", "Python");
System.out.println(joined);   // Output: Java, C++, Python
```

---

### ✅ **String Comparison Using `==` vs `.equals()`**
```java
String str1 = "Hello";
String str2 = new String("Hello");

System.out.println(str1 == str2);          // false (compares memory location)
System.out.println(str1.equals(str2));     // true (compares value)
```
- `==` → Compares **references** (memory location).  
- `.equals()` → Compares **content** (value).  

---

### 🚀 **Key Takeaways**
1. **Immutable**: Strings cannot be changed after creation.  
2. **String Pool**: Optimized memory management for string literals.  
3. **String Methods**: Java provides various methods for **manipulating, comparing, and searching** strings.  
4. **StringBuilder and StringBuffer**: For **mutable strings**, use `StringBuilder` or `StringBuffer`.  
