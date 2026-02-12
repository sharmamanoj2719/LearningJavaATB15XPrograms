package ex_26_Expections;

public class Lab_180_IQ2_Jr_QA_VS_Sr_QA {
    public static void main(String[] args) {
        // QA
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}