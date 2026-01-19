package ex_16_String;

public class Lab_108_String_Immutable {
    public static void main(String[] args) {

        String name = "manoj";
//        boolean result = name.contains("m");
//        System.out.println(result);
        // String are immutable are in nature.

//        name.toUpperCase();
//        System.out.println(name); // manoj

        name = name.toUpperCase(); // Reassign string
        System.out.println(name); // MANOJ
    }
}
