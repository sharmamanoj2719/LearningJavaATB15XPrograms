package ex_09_Increment_Decrement;

public class Lab060_PreIncrement {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        // ++a ->  a= a+1
        //  Exp and Result Table
        // Line No | a | Result b
        //  8 |  10 | NA |
        //  9 |  11 | 11 |
        // 10 |  11 - a
        // 11 |  11 | 11 - print

    }
}
