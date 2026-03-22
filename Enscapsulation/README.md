# Encapsulation (OOP)

## What is Encapsulation?

Encapsulation means:

> **Data + Methods together + Controlled access**

---

## Two Main Parts

### 1️Bundling Data and Methods

```js
class BankAccount {
  #balance;

  deposit() {}
}
```

### 2. Hiding internal state

```js
#balance => private and cannot access directly, access from via methods
```
