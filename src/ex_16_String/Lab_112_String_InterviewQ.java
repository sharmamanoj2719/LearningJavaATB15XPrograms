package ex_16_String;

public class Lab_112_String_InterviewQ {
    public static void main(String[] args) {

        String s1 = "Hello";  // Only 1 poll is created for both
        String s2 = "Hello";

        String s3 = new String("Hello"); // Always created new with "New"
        String s4 = new String("Hello");
        String s5 = new String("hello");

        // == Comparison -> String check the ref in String.

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3 ); // false
        System.out.println( s3 == s5 ); // false


        // equal (content) -- > check value not location

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s5)); // false

        System.out.println(s3.equalsIgnoreCase(s5)); // true

    }
}
