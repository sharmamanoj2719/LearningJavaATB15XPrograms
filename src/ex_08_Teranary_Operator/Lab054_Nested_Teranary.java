package ex_08_Teranary_Operator;

public class Lab054_Nested_Teranary {
    public static void main(String[] args) {
        int amol_age = 22;

        String result = amol_age > 18
                ? (amol_age > 25 ? "You can drink" : "You can't")
                : "No you can't go to GOA";

        System.out.println(result);
    }
}
