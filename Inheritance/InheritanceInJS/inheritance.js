class Person {
  constructor(name, place) {
    this.name = name;
    this.place = place;
  }

  introduce() {
    console.log(`I am ${this.name} from ${this.place}`);
  }
}
//Arya Stark
class Arya extends Person {
  constructor(name, place, skill) {
    super(name, place);
    this.skill = skill;
  }

  useSkill() {
    super.introduce();
    console.log(`My skill is ${this.skill}`);
  }
}

const aryaStark = new Arya("Arya Stark", "Winterfell", "Faceless Assassin");

aryaStark.introduce();
aryaStark.useSkill();
// I am Arya Stark from Winterfell
// I am Arya Stark from Winterfell
// My skill is Faceless Assassin

//Jon Snow
class JonSnow extends Person {
  constructor(name, place, title, realName, father, mother) {
    super(name, place);
    this.title = title;
    this.realName = realName;
    this.father = father;
    this.mother = mother;
  }
  introduce() {
    super.introduce();
    console.log(`I am also known as ${this.realName}`);
  }
  showParents() {
    console.log(`Father: ${this.father.name}`);
    console.log(`Mother: ${this.mother.name}`);
  }
  fightBattle() {
    console.log(
      `${this.name} from ${this.place} is a ${this.title} who led the fight against White Walkers`,
    );
  }
}
const father = new Person("Rhaegar Targaryen", "Dragonstone");
const mother = new Person("Lyanna Stark", "Winterfell");
const jonsnow = new JonSnow(
  "Jon Snow",
  "North",
  "Lord Commandar",
  "Aegon Targaryen",
  father,
  mother,
);
jonsnow.introduce();
jonsnow.showParents();
jonsnow.fightBattle();
// I am Jon Snow from North
// I am also known as Aegon Targaryen
// Father: Rhaegar Targaryen
// Mother: Lyanna Stark
// Jon Snow from North is a Lord Commandar who led the fight against White Walkers
