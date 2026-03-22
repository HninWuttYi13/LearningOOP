/**
 * =========== Encapsulation in Java =============
 * Java was built with encapsulation in mind. It uses access modifiers
 * Encapsulation is not hide everything
 * It is control access intentionally
 *
*/
 class Student {
    private String studentID; 
    private String name;
    private String course;
    //constructor - used to initialize objects (instance) 
   public Student(String studentID, String name, String course) {
    this.studentID = studentID;
    this.name = name;
    this.course = course;
   }
   //public methods- the interface
   public void getStudentInfo(){
    System.out.println("Student ID: " + this.studentID);
    System.out.println("Name: " + this.name);
    System.out.println("Course: " + this.course);
   }
   public void registerCourse() {
    System.out.println(this.name + " is registering for "+ this.course);
   }
   public void withdrawlCourse() {
    System.out.println(this.name + " is withdrawing from "+ this.course);
   }
    
}
//creating instances
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("S101", "Hnin Wutt Yi", "Computer Science");
        student1.getStudentInfo();
        student1.registerCourse();
        student1.withdrawlCourse();
    }
}
// Student ID: S101
// Name: Hnin Wutt Yi
// Course: Computer Science
// Hnin Wutt Yi is registering for Computer Science
// Hnin Wutt Yi is withdrawing from Computer Science