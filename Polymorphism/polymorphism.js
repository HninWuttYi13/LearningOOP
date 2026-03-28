class Person {
  constructor(name, house) {
    this.name = name;
    this.house = house;
  }

  introduce() {
    return `${this.name} from ${this.house}`;
  }

  useAbility() {
    console.log(`${this.introduce()} uses a basic ability`);
  }
}
class Wizard extends Person {
  constructor(name, house, ability) {
    super(name, house);
    this.ability = ability;
  }

  useAbility() {
    console.log(`${this.introduce()} uses ${this.ability}`);
  }
}
class DarkWizard extends Wizard {
  useAbility() {
    console.log(`${this.introduce()} uses dark magic: ${this.ability}`);
  }
}
class Muggle extends Person {
  useAbility() {
    console.log(`${this.introduce()} has no magical ability`);
  }
}
const characters = [
  new Wizard("Harry Potter", "Gryffindor", "Expelliarmus"),
  new DarkWizard("Draco Malfoy", "Slytherin", "Dark curses"),
  new Wizard("Luna Lovegood", "Ravenclaw", "Charms"),
  new Wizard("Cedric Diggory", "Hufflepuff", "Bubble-Head Charm"),
  new Muggle("Filch", "Hogwarts"),
];

characters.forEach((character) => character.useAbility());
/**
 * Dynamic Dispatch (Core of Polymorphism)
 *
 * - The method that runs is decided at runtime
 * - Based on the actual object, not the variable
 *
 * Example:
 * characters.forEach((character) => character.useAbility());
 *
 * Each object (Wizard, DarkWizard, Muggle)
 * executes its own version of useAbility()
 *
 * JavaScript uses prototype chain lookup
 * to find the correct method.
 *
 * Note:
 * This is dynamic dispatch, not duck typing.
 */

/**
 * But behavior changes:
Object	Method that runs
Wizard	Wizard.useAbility
DarkWizard	DarkWizard.useAbility
Muggle	Muggle.useAbility

Same call
 Different results

THIS is polymorphism
Overriding = “I change behavior”
Polymorphism = “Same call, many behaviors
*/
