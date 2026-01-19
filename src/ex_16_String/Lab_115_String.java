package ex_16_String;

public class Lab_115_String {
    public static void main(String[] args) {
        CharSequence c = "String";
        System.out.println(c);
        System.out.println(c.subSequence(1,4)); // str because -1 is considering

        String s = "java" .substring(2);
        System.out.println(s); // va

    }
}
