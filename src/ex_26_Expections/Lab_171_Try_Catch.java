package ex_26_Expections;

public class Lab_171_Try_Catch {
    public static void main(String[] args) {

        {
            System.out.println("1");
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("ARE YOU FOOL");
            }
            System.out.println("2");
        }
    }
}