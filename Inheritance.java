class Vehicle {
    void drive() {
        System.out.println("Driving");
    }
}

class Car extends Vehicle {
    void displayType() {
        System.out.println("Car");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayType();
        car.drive();
    }
}
