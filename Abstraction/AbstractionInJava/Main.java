//Abstract class =is-A identity
abstract class Shape {
    String color;
    public Shape(String color) {
        this.color = color;
    }
    //Every shape must have an area
   public abstract double area();
   public abstract double perimeter();
   public void describe(){
    System.out.println("I am a " + this.color + " shape with area " + String.format("%.2f", this.area()));
    System.out.println("The perimeter is " + String.format("%.2f", this.perimeter()));
   }
}
//Interface = can do ability
 interface Drawable{
    // Anything that CAN BE DRAWN must implement draw()
    void draw(); //no body, pure contract
}
// Circle IS A Shape Circle CAN BE DRAWN
class Circle extends Shape implements Drawable {
    double radius;
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public void draw(){
        System.out.println("Drawing a circle with radius " + radius);
    }
    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape implements Drawable {
    double width, length;
    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }
    @Override
    public double area() {
       return width * length;
    }
    @Override
    public double perimeter() {
        return 2* (width + length);
    }
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and length " + length);
    }
}
public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(5, "red");
        Rectangle rectangle = new Rectangle(4, 6, "blue");
        Drawable[] drawables = {circle, rectangle};
        Shape[] shapes = {circle, rectangle};
        for(Shape s: shapes) {
            s.describe();
            if(s instanceof Drawable){
                ((Drawable)s).draw();
            }
        }
    }
}