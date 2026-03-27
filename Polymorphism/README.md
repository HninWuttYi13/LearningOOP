## Polymorphism

- means **many forms**, one name -> many behaviors

### What is Polymorphism?

Poly = many, Morph = form, so Polymorphism = many forms

### Example Remote Control Anaglogy

Remote has one **Play** button:

- Point at TV -> plays a show
- Point at Music player -> plays a song
- Point at DVD player -> plays a movie

So same button and different behavior. We need one interface and let each device handle it differently. That's polymorphism.

---

### Importance of Polymorphism

1.  Method Overriding (CORE of polymorphism)
    - Works because child class overrides parent method
2.  Dynamic Method Dispatch (Runtime Polymorphism)
    - real mechanism **Which method runs is decided at runtime based on the object**

3.  Why polymorphism is useful
    - code design benefit

4.  One Interface Rule
    - Same method name, different behavior

---

## Key Idea

    The method that runs is decided by the actual object, not the variable.
