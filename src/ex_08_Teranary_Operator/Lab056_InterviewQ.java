package ex_08_Teranary_Operator;

public class Lab056_InterviewQ {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = a > b ? a : b;
        int min = a > b ? b : a;
        System.out.println(max);
        System.out.println(min);
    }

}
