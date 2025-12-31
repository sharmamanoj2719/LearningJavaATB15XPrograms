package ex_10_If_Condition;

import java.util.Scanner;

public class Lab_73_InterviewQ {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // If-Else-If condition
        if (age > 34) {
            System.out.println(name + ", age is greater than 34");
        } else if (age < 34) {
            System.out.println(name + ", age is less than 34");
        } else {
            System.out.println(name + ", age is exactly 34");
        }

        // Close scanner
        scanner.close();
    }
}
