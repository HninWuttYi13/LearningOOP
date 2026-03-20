/**
 * the simplest way to create an object
 * create object directly
 */
const cat = {
    name: "Shwe Wah",
    color: "yellow",
    makeSound: function () {
        console.log(`The cat ${this.name} whose color is ${this.color} is yelling meow meow`)
    }
}
cat.makeSound();

/**
 * Mistake I made
 * first I used arrow function for makeSound()
 * but arrow function doesn't have its own 'this'
 * so it refers to the parent scope's 'this'
 * and so the output become undefined
 */

/**
 * Problem of object literal
 * if I want to create another object, I have to create another object
 * and I have to repeat the same code
 */