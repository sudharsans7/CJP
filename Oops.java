package oops;
import java.util.ArrayList;
class Student {
    private String name;
    private int grade;
    private ArrayList < String > courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList < String > ();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public ArrayList < String > getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }
    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

}
public class Student_details {
    public static void main(String[] args) {
        Student student1 = new Student("Akhil", 11);
        Student student2 = new Student("Johi", 10);
        System.out.println("Student Details:");
        student1.printStudentDetails();
        student2.printStudentDetails();
        System.out.println("Adding courses for " + student1.getName());
        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("English");

        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

        System.out.println("\nAdding courses for " + student2.getName());
        student2.addCourse("History");
        student2.addCourse("Geography");
        student2.addCourse("English");
        System.out.println(student2.getName() + "'s courses: " + student2.getCourses());
        System.out.println("Removing 'Science' course for " + student1.getName());
        student1.removeCourse("Science");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
    }
}