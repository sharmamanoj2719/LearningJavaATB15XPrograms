package ex_06_Java_Operators;

public class Lab030_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(a);
        System.out.println(!a);


        boolean b = true;
        System.out.println(!!b);

        boolean c =  false || true  ; // OR Operator
        System.out.println(c);

        boolean d = true   && false ; // AND operator
        System.out.println(d);
    }
}
