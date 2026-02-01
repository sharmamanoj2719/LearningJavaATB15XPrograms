package ex_19_OOPs_Singe_inheritance;

public class Lab_146_RunnerProgram {
    public static void main(String[] args) {
        Son manoj    = new Son();
        System.out.println(manoj.gold_f);
        manoj.bhk2();
        manoj.bhk3();

        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();;
        // f1.bhk3();

    }
}
