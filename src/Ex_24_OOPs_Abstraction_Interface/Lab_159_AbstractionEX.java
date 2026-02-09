package Ex_24_OOPs_Abstraction_Interface;

public class Lab_159_AbstractionEX  {

    public static void main(String[] args) {
        Alto car = new Alto();
        car.drive();
    }

}


class Alto extends Car1{

    void drive(){
        startCar();
        System.out.println("We are driving a Car");
        stopCar();
    }


    @Override
    void startCar() {
        System.out.println("Starting a car alto");
    }

    @Override
    void stopCar() {
        System.out.println("Stopping a car alto");

    }
}

abstract class Car1{
    abstract void startCar();
    abstract void stopCar();

}