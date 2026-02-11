package ex_26_Expections;

public class Lab_169_String_NullPointer  {
    public static void main(String[] args) {
        String name= null; // java.lang.NullPointerException
        name.trim();
    }
}