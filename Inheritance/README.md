# Inheritance

## What is Inheritance

We can create a new class based on existing class. The new class gets all the properties and methods of the parent, and can add or change things

## Why use Inheritance?

- code reusability (don't write same logic)
- avoid duplication
- represent real world relationship
- extend and customize behavior

## Real world example (family analogy)

- Parent(Superclass): has common traits - eyes, nose, hair
- Child(Subclass): inherit those traits + own unique traits

---

### Example

- Animal(Superclass): eat, sleep
- Dog(Subclass): inherit Animal's traits + bark, wag tail
- Cat(Subclass): inherit Animal's traits + meow, purr
- **Without inheritance**, we have to copy eat, sleep methods to both classes which is duplication. -**With inheritance**, we can create Animal class once and reuse it in Dog and Cat classes.

```
Animal(eat, sleep)
|----Dog(bark, wag tail)
|----Cat(meow, purr)
```

---

## "is-a" & "has-a"

**is-a** -> **Use Inheritance**

- use when Child is the a type of Parent.
- A Dog is an animal.
- A Car is a vehicle.
- A Student is a person.
- Toner is a skincare product.

**has-a**-> **Use Composition**

- use when the object contain another object
- This is ingredient of product.
  A Car has an Engine.
  (not A Car is an Engine)
- A Student has a laptop. (not student is a laptop)

---

### Mistake

- Using Inheritance only for code reuse

```
class Stack extends ArrayList {....}
```

This is wrong because it means "Stack **is an** and ArrayList and that is not true.
**Stack** = LIFO (Last In First Out)
**Array List** = Ordered list (add, remove, update, get)

**Correct way**:

```
class Stack {
    constructor() {
        this.items = new ArrayList();
    }
}
```

Now, Stack **has an** ArrayList (Composition)

---

- Deep Inheritance Chains

```
Animal → Mammal → DomesticAnimal → Pet → Dog → GoldenRetriever
```

**Problem**: Too many levels, hard to maintain, changes in Animal affect all the way down.
**Better Design**

```Animal -> Dog

```

```class Dog extends Animal {
    construcotr(breed) {
        super();
        this.breed = breed;
    }
}
```
