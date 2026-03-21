/**
 * In Java, everything is a class and designed for OOP from ground up
 * We can't write a single line of executable code outside a class forces us to think in objects.
 * =========Comparison with JS & Java=============
 * JS => can use OOP but doesn't force to use it
 * JAVA => must use OOP and it's strict
 */
class SkincareProducts {
    //Fields are data (variables), String = type, name, type = properties (every SkincareProducts have these properties)
    String name;
    String type;
    //constructor - used to initialize objects (instance)
    SkincareProducts (String name,String type) {
        this.name = name; //this.name = field, name = parameter
        this.type = type;
    }
    //Method- every method has to declare return type, No return use 'void'
    void use() {
        System.out.println("Using " + this.name + " which is a " + this.type); //same with console.log() in JS
    }
}
//creating instances
public class Main {
    public static void main(String [] args) {
        /**
         * new is used to create objects
         * constructor runs set name and types
         * call method
         * inside method this = skincare1
         * print result
         */
        SkincareProducts skincare1 = new SkincareProducts("Simple", "Toner");
        SkincareProducts skincare2 = new SkincareProducts("Cetaphil", "Cleanser");
        //call the method
        skincare1.use(); //Using Simple which is a Toner
        skincare2.use(); //Using Cetaphil which is a Cleanser
    }
}