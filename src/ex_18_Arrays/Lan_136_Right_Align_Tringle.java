package ex_18_Arrays;

public class Lan_136_Right_Align_Tringle {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
