package ex_12_ForLoop;

public class Lab_93_For_Loop_Continue_Even_Number {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                continue; // skip even numbers
            }
            System.out.println(i); // print odd numbers
        }
    }
}



