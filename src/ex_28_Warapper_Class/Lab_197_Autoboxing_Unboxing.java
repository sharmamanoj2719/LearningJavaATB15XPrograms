package ex_28_Warapper_Class;

public class Lab_197_Autoboxing_Unboxing  {
    public static void main(String[] args) {
        int a= 10;
        Integer b = a;
        System.out.println(b); //  b has now   attributed, methods -1
        // Boxing - Primitive data type is converted wrapper - Automatic JVM will do it


        Integer aa = 43;
        int a1 = aa; // UnBoxing
        System.out.println(a1); //  aa lost the attribute and behaviour



        int i = Integer.parseInt("123");


    }
}