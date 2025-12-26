package ex_06_Java_Operators;

public class Lab037_Interview_Q {
    public static void main(String[] args) {
        boolean b1 = true;

        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);


        // Compound Assignment Operators
        int age = 10;
        age +=10; //  age = age  + 10

        int age1 = 20;
        age1 -=10;  // += -> age = age -10;
        age /=10;  // += -> age = age /10;
        System.out.println(age);
        System.out.println(age1);


        int a11 = +10;
        int a12 = -110;

    }
}
