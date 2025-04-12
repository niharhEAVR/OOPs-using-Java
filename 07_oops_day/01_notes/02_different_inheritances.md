Sure! In Java, there are **five main types of inheritance**, and I'll explain each with an **example**. Let's go one by one:

---

## 🔰 1. **Single Inheritance**
👉 One child class inherits from one parent class.

### ✅ Example:
```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
```

### ✅ Output:
```java
Dog d = new Dog();
d.eat();  // Inherited
d.bark(); // Own method
```

---

## 🔗 2. **Multilevel Inheritance**
👉 One class inherits from another, and a third inherits from that.

### ✅ Example:
```java
class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}
```

### ✅ Output:
```java
Puppy p = new Puppy();
p.eat();  // from Animal
p.bark(); // from Dog
p.weep(); // own
```

---

## 🌿 3. **Hierarchical Inheritance**
👉 Multiple classes inherit from a single parent class.

### ✅ Example:
```java
class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}
```

### ✅ Output:
```java
Dog d = new Dog();
d.eat();  // from Animal
d.bark();

Cat c = new Cat();
c.eat();  // from Animal
c.meow();
```

---

## ❌ 4. **Multiple Inheritance (Not supported with classes)**

Java **does not support multiple inheritance using classes** (to avoid ambiguity):

```java
class A{
    int num = 5;
}

class B{
    int num = 10;
}

class C extends A,B {} // Syntax error on token ",", . expected
// Thats why you cannot access the multiple classes

public class Name {
    public static void main(String[] args) {
        C obj = new C();

        System.out.println(obc.num); // obj will get confused which num to used
    }
}
```


But you can achieve it using **interfaces**.

### ✅ Using Interfaces (Multiple inheritance with interfaces)
```java
interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("Interface A method");
    }

    public void showB() {
        System.out.println("Interface B method");
    }
}
```

### ✅ Output:
```java
C obj = new C();
obj.showA();
obj.showB();
```

---

## 🌀 5. **Hybrid Inheritance (Not directly supported with classes)**

Hybrid = Combination of two or more types (like hierarchical + multiple).

### ✅ Achieved using interfaces:

```java
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class Parent {
    void showParent() {
        System.out.println("Parent class");
    }
}

class Child extends Parent implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}
```

---

## 📚 Summary Table

| Inheritance Type      | Supported by Java? | Example         |
|-----------------------|--------------------|-----------------|
| Single Inheritance    | ✅ Yes             | Class A → Class B |
| Multilevel Inheritance| ✅ Yes             | A → B → C       |
| Hierarchical          | ✅ Yes             | A → B, A → C    |
| Multiple              | ❌ No (with class)<br>✅ Yes (with interface) | A, B → C |
| Hybrid                | ❌ No (with class)<br>✅ Yes (with interface) | Mix of above |
