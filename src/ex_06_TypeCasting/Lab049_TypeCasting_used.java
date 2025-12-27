package ex_06_TypeCasting;

public class Lab049_TypeCasting_used {

    public static void main(String[] args) {

        int course = 100;
        float NSRT_GST = 18.45f;

        // Narrowing - Explicit
        int total = course + (int) NSRT_GST;
        System.out.println(total);

        // Widening - Implicit
        float total2 = course + NSRT_GST;
        System.out.println(total2);

        // Widening - Explicit
        float total3 = (float) course + NSRT_GST;
        System.out.println(total3);
    }
}


