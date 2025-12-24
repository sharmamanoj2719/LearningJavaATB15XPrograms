package ex_04_Java_ConstantVariables;
/*A constant is a value that cannot be changed once assigned.
In Java, we make a constant using the keyword final.
To create a common constant for the whole class, we use static final.
static final means the value belongs to the class, not objects, and it never changes.
Constants are usually written in UPPERCASE.
Example: static final int MAX_SPEED = 120; → same value for all, and cannot change.*/
public class Lab018Constant {
    public static void main(String[] args) {
    final int a = 10;
    //a = 20; // no change after using final keyword
        System.out.println(a);
    }
}
