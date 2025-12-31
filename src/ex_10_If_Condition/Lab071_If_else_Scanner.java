package ex_10_If_Condition;
import java.util.Scanner;

public class Lab071_If_else_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE AGE!");
        int age = scanner.nextInt();
//     // double d = scanner.nextDouble();
//        // float f = scanner.nextFloat();
        if (age >= 18) {
            System.out.println("Allowed to vote");
        } else {
            System.out.println("Not allowed to vote");
        }

        scanner.close();
    }
}
