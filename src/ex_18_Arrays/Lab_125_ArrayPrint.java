package ex_18_Arrays;

import java.util.Arrays;

public class Lab_125_ArrayPrint {
    public static void main(String[] args) {
        int marks[] = {10, 20, 30, 40, 50};
        {
            System.out.println(marks.length);

            System.out.println(0);
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }


        for (int i = 0; i < marks.length; i++) {

            System.out.println(marks[i]);
        }

        System.out.println("===================");

        for (int m : marks) {
            System.out.println(m);
        }

    }
}
