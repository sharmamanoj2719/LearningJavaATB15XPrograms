package ex_20_OOPs_Polymorphism.Methodoverloading.Methodoverridding;

public class Lab_150_Method_Overriding {
}

class Father{

    void home(){

        System.out.println("2BHK");
    }
}

class   manoj extends Father {
    @Override
    void home(){

        System.out.println("3BHK");
    }
}