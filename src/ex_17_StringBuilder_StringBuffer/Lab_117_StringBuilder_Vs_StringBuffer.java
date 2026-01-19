package ex_17_StringBuilder_StringBuffer;

public class Lab_117_StringBuilder_Vs_StringBuffer {
    public static void main(String[] args) {
         // Use 90%
        String s1 = "Manoj";
        String s2 = new String("Manoj");

        // Use 10%

        StringBuffer stringBuffer = new StringBuffer( "Manoj");
        StringBuilder stringBuilder = new StringBuilder("Manoj");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());


    }
}
