/**
 * Constructor & Prototype
 * Before ES6, javascript made OOP by using protottype
 */
/**
 * Constructor function is a function that is used to create objects like a blueprint
 * It is called with the 'new' keyword
 * Think: If the object is created, I will store data like this
 */
function Student(name, course) {
  this.name = name;
  this.course = course;
}
/**
 * What happen when we use 'new keyword?
 * It does 4 hidden steps.
 * 1. Create Empty Object => const student1 = {}
 * 2. Link the prototype => student1.__proto__ = Student.prototype (__proto__ = receiver of property & method from constructor), (prototype = to share property & method)
 * 3. Call Constructor => Student.call(student1, "Hnin", "OOP") => this = student1 and so this.name = "Hnin", this.cousre = "OOP" and student1 become student1 {name: "Hnin", course: "OOP"}
 * 4. Return Object => return student1
 * Final result => student1 = {name: "Hnin", course: "OOP", __proto__: Student.prototype}
 */
const student1 = new Student("Hnin", "OOP");
/**
 * Prototype Method
 * store once, not per object
 * save memory
 * each object can share the same method
 */
Student.prototype.introduce = function () {
  console.log(`I am ${this.name} and I am studying ${this.course}`);
};
// Method call
student1.introduce();
