package ex_06_Java_Operators;

public class Lab032_Interview_Q {
    public static void main(String[] args) {
        String first_name = "Manoj";
        String lastName = "Sharma";

        int a = 10;
        int b = 20;

        System.out.println(first_name+lastName+a+b); //ManojSharma1020
        System.out.println(a+b+first_name+lastName); //30ManojSharma
        System.out.println(first_name+lastName+(a+b)); //ManojSharma30
    }
}


//         // BODMAS - Bracket of Div, mul, add, sub

// First of all, whenever it sees strings,
// it will do concatenation, and for the next
// one also it will also do concatenation.
// But when it sees integers first, it will do mathematical operation.
// The second time it will see strings,
// then it will do concatenation as well.

