package ex_06_TypeCasting;

public class Lab050_TypeCasting_Example {
    public static void main(String[] args) {

            char ch = 'A';
            int ascii = ch; // Widening

            int num = 66; // Narrow
            char letter = (char) num;

        System.out.println(letter); // B


    }
}
