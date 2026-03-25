## Inheritance in JavaScript

### What we see (surface level)

JS Inheritance looks like classical inheritance on surface.

```
class Students extends Person { ... }
```

looks like Java / C++ style inheritance on surface

---

### What is really happening (under the hood)

JavaScript does not copy methods and instead objects are linked together and they are called **Prototype Chain**

---

### Three Keywords must know

- extends — "I am a special kind of..."

```
class professor extends person { ... }
```

link prototypes and create chain

- super() — "Call my parent's constructor"

```
constructor(name, teaches) {
  super(name);  // Run Person's constructor first
  this.teaches = teaches;  // Then add my own
}
```

super() MUST be the first line in a child's constructor. If we forget, JavaScript throws an error. It's **not optional**

- Method Overriding — "I do it MY way"

```
class Student extends Person {
  introduceSelf() {
    console.log("I am student");
  }
}
```

What happen here?

- s.introduceSelf();
- JS finds in methods in s-> Student.prototype() stopes and does goes to parent
- Always win cloest

---

### Theory

The prototype chain is like asking: 'Do YOU know how to do this?' If not, 'Does your PARENT know?' If not, 'Does your GRANDPARENT know?' It keeps going up until someone knows — or until there's nobody left to ask.
