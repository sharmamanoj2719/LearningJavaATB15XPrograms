package ex_26_Expections;

public class Lab_173_Try_Catch_Multiple_IQ {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}