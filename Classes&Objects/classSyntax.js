/**
 * ES6 class syntax are the modern way to create objects
 * class syntax is just sugar over prototypes(sweeter) and ingredients are the same
 * constructor + prototype
 */
class Fruit {
  //just old construtor function, set properties of objects and when we use 'new' it will be called
  constructor(name, price) {
    this.name = name;
    this.price = price;
  }
  //they are not inside object and they are placed on Fruit.prototype
  aboutFruit() {
    console.log(`The fruit ${this.name} costs ${this.price}`);
  }
}
const apple = new Fruit("Apple", 1000);
/**
 * object look like
 * apple = {name: "Apple", price: 1000, __proto__: Fruit.prototype}
 */
apple.aboutFruit();
/**
 * Look inside apple if not found go to prototype
 * call with this = apple
 */
/**
 * Advantages
 * cleaner
 * more readable
 * more organized
 */
/**
 * Notes
 * Do not use arrow function inside Class
 *  - break prototype behavior
 *  - create function per object (memory waste)
 */
