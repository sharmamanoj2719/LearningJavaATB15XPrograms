package ex_15_Function;

import java.util.Scanner;

public class Lab_105_UserDefineFunction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number a = ");
        int a = scanner.nextInt();

        System.out.print("Enter a number b = ");
        int b = scanner.nextInt();

        int sum = sum_two_numbers(a, b);
        System.out.println("Sum of the numbers is = " + sum);

        sum_of_two_number();
    }

    static int sum_two_numbers(int x, int y) {
        return x + y;
    }

    static void sum_of_two_number() {
        System.out.println("Hi, there");
    }
}
