### 🔷 Java Code:

```java
public class literals4 {
    public static void main(String[] args) {
        int binaryNum = 0b101;         // binary to decimal
        int hexaNum = 0x7E;            // hexadecimal to decimal
        int longNum = 1_00_00_000;     // underscore in numeric literals (for readability)
        double bigNum = 7e2;           // scientific notation: 7 × 10²

        int x = 100;
        x++; // increment
        x--; // decrement

        System.out.println(binaryNum);
        System.out.println(hexaNum);
        System.out.println(longNum);
        System.out.println(bigNum);
        System.out.println(x);
    }
}
```

---

### 🔍 Explanation of Each Line:

---

#### ✅ `int binaryNum = 0b101;`

* `0b101` means a **binary number**.
* Binary `101` = **1×4 + 0×2 + 1×1 = 5**
* So: `binaryNum = 5`

---

#### ✅ `int hexaNum = 0x7E;`

* `0x7E` is a **hexadecimal number**.
* `7E` in hex = (7×16) + (14×1) = **112 + 14 = 126**
* So: `hexaNum = 126`

---

#### ✅ `int longNum = 1_00_00_000;`

* This is just a regular integer **with underscores for readability** (Java allows this).
* It’s treated as: `10000000`
* So: `longNum = 1 crore = 10000000`

---

#### ✅ `double bigNum = 7e2;`

* `7e2` means: **7 × 10² = 700.0**
* This is scientific (exponential) notation.
* So: `bigNum = 700.0`

---

#### ✅ `int x = 100; x++; x--;`

* `x = 100`
* `x++` increases x to 101
* `x--` decreases it back to 100
* So final `x = 100`

---

### ✅ Final Output:

```java
5
126
10000000
700.0
100
```

---

### 📌 Summary Table:

| Variable  | Value    | Explanation                               |
| --------- | -------- | ----------------------------------------- |
| binaryNum | 5        | Binary `0b101` = 5                        |
| hexaNum   | 126      | Hex `0x7E` = 126                          |
| longNum   | 10000000 | Just a readable way of writing 1 crore    |
| bigNum    | 700.0    | `7e2` = 7 × 100 = 700.0                   |
| x         | 100      | Increment and decrement cancel each other |