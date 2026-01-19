package ex_16_String;

public class Lab_113_Strings_CompareTo {
    public static void main(String[] args) {

        String s = "Java";
        char c = s.charAt(2);
        int i  = s.length();
        System.out.println(c); // v
        System.out.println(i); //4

        int result  = "abc".compareTo("ABC");
        int result1  = "abc".compareTo("abc");
        int result2  = "ABC".compareTo("ABC");
        System.out.println(result); // compare a and A which is 97 - 65 = 32
        System.out.println(result1); // 0
        System.out.println(result2); // 0

     }
}
