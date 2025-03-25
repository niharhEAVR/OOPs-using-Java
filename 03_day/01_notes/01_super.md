### ✅ **Explanation of the Code**

```java
class A {
    public A() {  
        System.out.println("In normal constructor of A");
    }
    public A(int a) {  
        System.out.println("In parameterized constructor of A");
    } 
}

class B extends A { 
    public B() {  
        System.out.println("In normal constructor of B");
    }
    
    public B(int b) {  
        super(b);  // Calls the parameterized constructor of class A
        System.out.println("In parameterized constructor of B");
    } 
}

public class thisSuper3 {
    public static void main(String[] args) {
       new B(7);  // Create an object of class B using the parameterized constructor
    }
}
```

---

### 🔥 **Key Concepts Involved**

1. **Inheritance:** 
   - `class B` extends `class A`, meaning that `B` inherits the properties and methods of `A`.
   
2. **Constructors in Inheritance:**
   - When you create an object of `B`, the constructor of the parent class `A` is always called first before executing the constructor of `B`. 
   - The `super()` keyword is used to explicitly call the constructor of the parent class.

---

### 🚀 **What Happens Without `super(b)`?**

If you **remove `super(b)`** from the `B(int b)` constructor, the program will look like this:

```java
public B(int b) {  
    System.out.println("In parameterized constructor of B");
}
```

**Output:**
```
In normal constructor of A  
In parameterized constructor of B
```

- Even though you are calling the **parameterized constructor** of `B`, the **default constructor of `A`** is still called first.  
- This is because Java implicitly adds `super()` (which calls the no-argument constructor of the parent class) at the beginning of the child class constructor if no `super()` is specified.  
- Therefore, the **default constructor of `A`** executes instead of the parameterized one.

---

### 🔥 **What Happens With `super(b)`?**

When you use `super(b)`, the parameterized constructor of `A` is explicitly called instead of the default one.

**Output:**
```
In parameterized constructor of A  
In parameterized constructor of B
```

- The `super(b)` explicitly calls the **parameterized constructor of `A`**, passing the integer `7` as an argument.  
- Therefore, instead of invoking the default constructor of `A`, the **`A(int a)`** constructor is called.

---

### 🔥 **Key Difference: `super()` vs `super(b)`**

- `super()` → Calls the **default constructor** of the parent class.
- `super(b)` → Calls the **parameterized constructor** of the parent class with the argument `b`.

---

### ✅ **Code Execution Flow with `super(b)`**
1. `new B(7)` → Object of `B` is created using the parameterized constructor.
2. `super(b)` → Calls the **parameterized constructor of `A`**.
3. The **`A(int a)`** constructor executes:  
   → `In parameterized constructor of A`
4. The **`B(int b)`** constructor executes:  
   → `In parameterized constructor of B`

---

### ✅ **Code Execution Flow without `super(b)`**
1. `new B(7)` → Object of `B` is created using the parameterized constructor.
2. Since no `super()` is explicitly mentioned, Java implicitly calls `super()` → **default constructor of `A`**.
3. The **`A()`** constructor executes:  
   → `In normal constructor of A`
4. The **`B(int b)`** constructor executes:  
   → `In parameterized constructor of B`

---

### 🛠️ **Key Takeaways**
- The `super()` keyword is used to call the **parent class constructor**.
- If you don’t use `super()`, Java automatically adds it to call the **default constructor** of the parent class.
- Using `super(b)` allows you to explicitly call the **parameterized constructor** of the parent class.
- This is useful when you want to initialize the parent class with specific values during the child class construction.

---
---
---


### ✅ **Explanation of Your Code**

```java
class A {
    public A() {
        System.out.println("In normal constructor of A");
    }
    
    public A(int a) {
        System.out.println("In parameterized constructor of A");
    } 
}

class B extends A { 
    public B() {
        super(9);  // Calls the parameterized constructor of A with argument 9
        System.out.println("In normal constructor of B");
    }
    
    public B(int b) {
        System.out.println("In parameterized constructor of B");
    } 
}

public class super3 {
    public static void main(String[] args) {
       new B();  // Creates an object of B using the default constructor
    }
}
```

---

### 🚀 **Code Execution Flow**

1. The program starts execution from `main()`.
2. `new B()` → You are creating an object of class `B` using the **default constructor** of `B`.

---

### 🔥 **Constructor Execution Steps**
1. Since `B` extends `A`, the **constructor of `A`** is called first.
2. In the `B()` constructor, you have explicitly written:
```java
super(9);
```
- This calls the **parameterized constructor** of `A` with the value `9`.
3. The **`A(int a)`** constructor is executed first, printing:
```
In parameterized constructor of A
```
4. After the parent constructor completes, the **`B()`** constructor continues execution, printing:
```
In normal constructor of B
```

---

### ✅ **Final Output**
```
In parameterized constructor of A  
In normal constructor of B
```

---

### 🔥 **Key Difference From the Previous Example**

In the earlier code you shared, the **default constructor** of the parent class was called implicitly because you didn't specify `super()`. However, in this code, you are explicitly calling:
```java
super(9);
```
This means:
- The **parameterized constructor of `A`** executes, instead of the default one.

---

### 🤔 **Why Doesn't the `B(int b)` Constructor Get Called?**

You might be wondering why the `B(int b)` constructor doesn’t execute in this case.  
Here’s why:
- In `main()`, you are creating an object using:
```java
new B();
```
- This explicitly calls the **default constructor** of `B`, which is:
```java
public B() { 
    super(9);   // Calls the parameterized constructor of A
    System.out.println("In normal constructor of B");
}
```
- Since you didn’t create an object using `new B(5)` or any other integer argument, the parameterized constructor `B(int b)` is not called.

---

### 🔥 **How to Trigger the `B(int b)` Constructor?**
If you want the `B(int b)` constructor to be executed, you need to create an object with an integer argument in `main()`:
```java
public class super3 {
    public static void main(String[] args) {
        new B(5);   // Calls the parameterized constructor of B
    }
}
```
**Output:**
```
In normal constructor of A  
In parameterized constructor of B
```
- Since you didn’t use `super()` in `B(int b)`, the **default constructor of `A`** is called implicitly.

---

### ✅ **Key Takeaway**
1. When you use `new B()` → The **default constructor** of `B` is executed.
2. Since you explicitly wrote `super(9)` in the `B()` constructor, the **parameterized constructor of `A`** is called.
3. The **parameterized constructor of `B`** (`B(int b)`) is only executed if you explicitly create an object with an argument:
```java
new B(5);
```

---

### 🔥 **Key Points to Remember About `super()`**
- `super()` → Calls the **default constructor** of the parent class.
- `super(argument)` → Calls the **parameterized constructor** of the parent class with the specified argument.
- If no `super()` is written, Java automatically adds `super()` implicitly in the child constructor to call the default constructor of the parent.
