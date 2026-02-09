package ex_23_OOPs_Super_Abstraction;

public class Lab_155_RevisionSuper {   // File name = class name
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}

// ================= VEHICLE CLASS =====================
class Vehicle {

    public int maxSpeed = 180;

    Vehicle() {
        System.out.println("Default Const");
    }

    Vehicle(int a) {
        System.out.println("Param Con");
    }

    Vehicle(int a, int b) {
        System.out.println("Param Con");
    }

    void message() {
        System.out.println("No Return, No Argument");
    }

    void message(int a) {
        System.out.println("PC - argument");
    }

    void drive() {
        System.out.println("Vehicle Parent");
    }

    void noTest() {
        System.out.println("Empty!");
    }
}

// ================= CAR CLASS =====================
class Car extends Vehicle {

    private int maxSpeed = 281;

    Car() {
        super(100);
    }

    Car(int a) {
        System.out.println("PC Car");
    }

    void test() { }

    @Override
    void drive() {
        super.drive();
        this.test();
        super.noTest();
    }
}

