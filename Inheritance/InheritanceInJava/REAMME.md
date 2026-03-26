## Inheritance In Java

In Java, inheritance is REAL class-based inheritance. When a child extends a parent, it gets a FULL COPY of parent's methods and variables. Java doesn't delegate like JS. It copies.

## What is the difference in Java and JS in terms of inheritance?

### Java Inheritance

- uses Class-Based Inheritance
- How it works: When a child class extends a parent class, it gets a FULL COPY of parent's methods and variables. Java doesn't delegate like JS. It copies.
- What **copy** mean- The subclass "inherits all members(fields, methods) from its superclass. The code from the parent class is essentally "copied" into child class at the compile time.
- Result - A subclass contains a complete **snapshot** of all accessible parent members.
- Performance/Behavior: Because of this structure, inheritance in Java is static and rigid.It createds tight coupling. For example, if we change the parent class, it impacts all subclasses.

---

### JavaScript Inheritance (Delegation Inheritance)

- uses Prototypal inheritance (Objects Linking to Other objects)
- How it works: When a child object is created, it does not copy the properties of the parent(prototype). Instead, it creates a secret link (**proto**) to the parent object
- What **Deligation** means: When we cal a method on the child object, JS first checks if the method exits on the child. If not, it delegates the call to the parent object through the prototype chain.
- Result- The parent's methods live only once in memory and many children share them by referencing them, thatn owning their own copy.
- Performance/Behaviour: Prototypal inheritance is dynamic. If we change a method on the parent prototype, the change is immediately reflected in all children because they look up the method at runtime.

---

### Java-Specific Inheritance Keywords

**extends** - Same as JS

```
public class Child extends Parent { }
```

**super** - must be first line (same as JS)

```
public Child(String name) {
    super(name);
    this.behavior = behavior;
}
```

**@Override** - must be used when overriding a method (same as JS)

```
@Override
public void introduceSelf() { ... }
```

- tells the compilter. I intend to override a parent method. If you misspell the method name, the compiler will throw an error instead of silently creating a new method.
- check you are actually overriding a parent method (not creating a new method with same name but different signature)
- **protected** & **private**

```
public class Person {
    protected String name;   // Child classes CAN access
    private int secretId;    // Child classes CANNOT access
}

public class Student extends Person {
    void test() {
        System.out.println(this.name);      //  Works (protected)
        // System.out.println(this.secretId); // Error (private)
    }
}
```

**final** - prevent inheritance

```
public final void criticalMethod() { ... }
// No subclass can override criticalMethod()

public final class Security { ... }
// No class can extend Security
```

uses **final** when you want to say. This is my final answer and no changes allowed.
