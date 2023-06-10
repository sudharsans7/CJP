abstract class Shape {
    String color;

    abstract double getArea();

    void setColor(String color) {
        this.color = color;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        myCircle.setColor("Red");
        System.out.println("Circle Area: " + myCircle.getArea());
        System.out.println("Circle Color: " + myCircle.color);

        Rectangle myRectangle = new Rectangle(4.0, 6.0);
        myRectangle.setColor("Blue");
        System.out.println("Rectangle Area: " + myRectangle.getArea());
        System.out.println("Rectangle Color: " + myRectangle.color);
    }
}
