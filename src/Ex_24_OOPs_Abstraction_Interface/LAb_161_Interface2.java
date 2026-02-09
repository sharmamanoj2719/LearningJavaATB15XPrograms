package Ex_24_OOPs_Abstraction_Interface;

public class LAb_161_Interface2 {
}

interface F1{
    void icm1();
    void money();
}

interface F2{
    void money();
}

abstract class Mother{
    abstract void money();
}

class SON extends Mother implements F1,F2 {


    @Override
    public void icm1() {

    }

    @Override
    public void money() {
        System.out.println("Son Method!");
    }
}

// Multiple inheritance IS possible in Java THROUGH interfaces,
// but NOT through classes.
