package Ex_24_OOPs_Abstraction_Interface;

public class Lab_163_Interface_Variables {
}


interface Manoj{
    int a = 10;
    String notes = "JAVA";
    void display();
}

class Sharma implements Manoj{

    int aa = 10;

    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.aa);

    }
}

class Vishwas implements Manoj
{


    @Override
    public void display() {

        {
            System.out.println(notes);
        }
    }
}
//interface B{
//
//}
//
//
//interface A implements B{
//
//}