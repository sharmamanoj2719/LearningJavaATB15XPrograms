package ex_16_String;

public class Lab_114_String_indexOf {
    public static void main(String[] args) {
        int idx = "Java".indexOf("a");
        System.out.println(idx); // a


        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2); // 3

        boolean b = "".isEmpty();
        System.out.println(b); // true

        String s = String.join("*","Java","Python");
        System.out.println(s);

        String s5 = "Java".replace('a','m');
        System.out.println(s5); // jmvm
    }
}
