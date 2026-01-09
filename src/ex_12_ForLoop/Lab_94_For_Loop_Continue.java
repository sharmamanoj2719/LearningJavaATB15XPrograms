package ex_12_ForLoop;

import java.util.Scanner;

public class Lab_94_For_Loop_Continue {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Please enter a No. ");
        int num = Scanner.nextInt();

        for (int i = 0; i < num; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i); // 5 Skip and print 0 to entered value
        }
    }
}
