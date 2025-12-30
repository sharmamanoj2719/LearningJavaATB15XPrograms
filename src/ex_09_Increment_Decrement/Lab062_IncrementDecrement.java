package ex_09_Increment_Decrement;

public class Lab062_IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        int result = ++a;
        int NewResult = a++;
        System.out.println(result); //11
        System.out.println(NewResult); //11
        System.out.println(a); // 12
    }
}
