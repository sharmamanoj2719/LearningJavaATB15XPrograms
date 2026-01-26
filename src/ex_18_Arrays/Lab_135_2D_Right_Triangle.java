package ex_18_Arrays;

import java.util.Scanner;

public class Lab_135_2D_Right_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for the pattern, e.g n = 5");
        int n = scanner.nextInt(); // 5
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
