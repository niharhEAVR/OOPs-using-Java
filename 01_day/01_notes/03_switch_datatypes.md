### ✅ **Java `switch` Statement – Supported Data Types**

In Java, the `switch` statement can be used with the following **data types**:

---

### 🔥 **1. Primitive Data Types**
- `byte`  
- `short`  
- `char`  
- `int`  

✅ Example:
```java
public class SwitchExample {
    public static void main(String[] args) {
        byte b = 1;
        short s = 10;
        char c = 'A';
        int i = 100;

        switch (b) {   // byte
            case 1:
                System.out.println("Byte case 1");
                break;
            default:
                System.out.println("Default");
        }

        switch (s) {   // short
            case 10:
                System.out.println("Short case 10");
                break;
            default:
                System.out.println("Default");
        }

        switch (c) {   // char
            case 'A':
                System.out.println("Char case A");
                break;
            default:
                System.out.println("Default");
        }

        switch (i) {   // int
            case 100:
                System.out.println("Int case 100");
                break;
            default:
                System.out.println("Default");
        }
    }
}
```
✅ Output:
```
Byte case 1  
Short case 10  
Char case A  
Int case 100  
```

---

### 🔥 **2. `String` (Introduced in Java 7)**  
- From **Java 7** onwards, you can use `String` values in `switch` statements.  
- **Case-sensitive** → Matching is based on the exact string value.

✅ Example:
```java
public class SwitchString {
    public static void main(String[] args) {
        String language = "Java";

        switch (language) {
            case "Java":
                System.out.println("You chose Java!");
                break;
            case "Python":
                System.out.println("You chose Python!");
                break;
            default:
                System.out.println("Unknown language");
        }
    }
}
```
✅ Output:
```
You chose Java!
```

---

### 🔥 **3. `Enum` (Enumeration)**  
- You can use **`enum` types** in `switch` statements.  
- `enum` values are treated as constants.

✅ Example:
```java
public class SwitchEnum {
    enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }

    public static void main(String[] args) {
        Day today = Day.FRI;

        switch (today) {
            case MON:
                System.out.println("Start of the week!");
                break;
            case FRI:
                System.out.println("It's Friday!");
                break;
            case SUN:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day.");
        }
    }
}
```
✅ Output:
```
It's Friday!
```

---

### 🔥 **4. `Wrapper Classes` (Java 7+)**
- You can use **wrapper classes** like `Byte`, `Short`, `Character`, and `Integer` in `switch` statements.  
- These are the **wrapper classes** for primitive types.

✅ Example:
```java
public class SwitchWrapper {
    public static void main(String[] args) {
        Integer num = 100;

        switch (num) {
            case 50:
                System.out.println("Number is 50");
                break;
            case 100:
                System.out.println("Number is 100");
                break;
            default:
                System.out.println("Number not found");
        }
    }
}
```
✅ Output:
```
Number is 100
```

---

### ❌ **Unsupported Data Types in `switch`:**
Java does **NOT** support the following data types in `switch` statements:
- `long`
- `float`
- `double`
- `boolean`
- Complex objects (`Object`, `Array`, `List`, etc.)

✅ **Why?**
- `switch` uses **hashing and jump tables** internally, which work efficiently with **discrete values** like `int` or `String`.  
- `long`, `float`, `double`, and `boolean` are not allowed because:
    - **Floating-point values** may introduce precision issues.  
    - `long` and `boolean` introduce complexity due to their larger range and logical nature.  

---

### 🚀 **Key Takeaways**

✅ **Data Types Supported in `switch`:**
- `byte`  
- `short`  
- `char`  
- `int`  
- `String` (Java 7+)  
- `Enum`  
- `Wrapper Classes` (Java 7+): `Byte`, `Short`, `Character`, `Integer`  

❌ **Unsupported Data Types:**
- `long`
- `float`
- `double`
- `boolean`
- `Object`, `Array`, `List`, etc.  
