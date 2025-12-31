package ex_10_If_Condition;

/*IF Statement – Short Notes
The if statement is a decision-making statement.
It executes a block of code only when a condition is true.
If the condition is false, the code inside if is skipped.
Conditions usually use relational operators (> < >= <= == !=).
Commonly used in validation, comparisons, and logic control. */

public class Lab069_If_Basic {
    public static void main(String[] args) {
        System.out.println("Enter the age value via CLI Options\n");
        int age = Integer.parseInt(args[0]);
if (age >18 )
{
    System.out.println("you can vote");
}
else {
    System.out.println("you can't vote ");
}
}
    }


