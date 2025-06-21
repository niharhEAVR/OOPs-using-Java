Great question! Let's dive deep into **why `++y` (or `y++`) doesn't execute** in this code:

### 🔷 Code Snippet:

```java
int x = 3;
int y = 5;

boolean result = (x < 5) && (++y > 10);
System.out.println("Result: " + result);
System.out.println("y after short-circuit AND: " + y);
```

### ✅ Concept: **Short-Circuit Logical AND (`&&`)**

Java uses **short-circuit evaluation** for logical operators like `&&`.

* `A && B` means:

  * **If `A` is `false`, then `B` is NOT evaluated** because the result will **definitely be false**.
  * So Java **skips evaluating B** to save time — this is called *short-circuiting*.

### 🔍 Let's Evaluate Step-by-Step:

#### `x = 3`, `y = 5`

```java
result = (x < 5) && (++y > 10)
```

#### Step 1: Evaluate Left Condition `(x < 5)`

* `x = 3`, so `x < 5` → `true`

✅ Since it's **true**, Java now needs to check the **right side**.


#### Let's change it to the one you originally asked:

```java
int x = 6;
int y = 5;

boolean result = (x < 5) && (++y > 10); // x < 5 is false
```

#### Step 1: `x < 5` → `false`

Since `false && anything` is always `false`, Java doesn't even **look at** `(++y > 10)`.
➡️ So `++y` is **never executed**, and `y` stays the same (`5`).


### 🔴 Important:

| Operator | Short-Circuits? | Meaning if Left Side is False |
| -------- | --------------- | ----------------------------- |
| `&&`     | Yes             | Skip right side               |
| `&`      | No              | Always evaluate both sides    |

If you used **`&` instead of `&&`**, then `++y` **would be executed** even if the left side is false.


### ✅ Fix/Test:

```java
int x = 6;
int y = 5;

boolean result = (x < 5) & (++y > 10); // Notice single '&'
System.out.println("Result: " + result);
System.out.println("y: " + y); // y will now become 6
```


### ✅ Summary:

* `&&` is a **short-circuit AND**.
* If the **left side is false**, the **right side is skipped** — no increment, no side effects.
* Use `&` if you want both sides to be evaluated **always** (but use carefully).
