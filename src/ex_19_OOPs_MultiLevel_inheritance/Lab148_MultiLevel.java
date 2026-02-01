package ex_19_OOPs_MultiLevel_inheritance;

public class Lab148_MultiLevel {

    public static void main(String[] args) {
        Son manoj = new Son();
        manoj.home();
        manoj.bhk3();
        manoj.gf();
        manoj.extraMoney();

        Father f = new Father();
        f.gf();
        f.home();
        // f.extraMoney();

        GrandFather gf =  new GrandFather();
        gf.gf();
        gf.home();


        // Dynamic Dispatch
        GrandFather g1 =  new Son();
        Father f1  = new Son();
        System.out.println();

        //Son s1 = new GrandFather();
        //Son s2 = new Father();

    }
}