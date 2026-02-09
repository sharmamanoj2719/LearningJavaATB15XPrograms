package Ex_24_OOPs_Abstraction_Interface;

public class Lab_162_Multiple_Inheritance_Solved  {
}

class Child1 implements Father1,Father2{

    @Override
    public void money() {
        System.out.println("Child Money!");
    }
}

interface Father1{
    final int a = 10;
    void money();
}
interface Father2{
    void money();
}