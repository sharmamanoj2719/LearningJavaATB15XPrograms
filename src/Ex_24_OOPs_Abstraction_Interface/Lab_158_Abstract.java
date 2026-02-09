package Ex_24_OOPs_Abstraction_Interface;

public class Lab_158_Abstract {
    public static void main(String[] args) {
        Son s1  = new Son();
        s1.loan50K();
        s1.load10K();
    }
}

abstract class Father{
    abstract void loan50K();
    // concrete - complete method
    void load10K(){
        System.out.println("Given!");
    }
}

class Son extends Father{

    @Override
    void loan50K() {
        System.out.println("Given by Son!");
    }
}