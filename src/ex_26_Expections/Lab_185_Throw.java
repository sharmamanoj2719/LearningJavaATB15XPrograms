package ex_26_Expections;

public class Lab_185_Throw {
    public static void main(String[] args) {

    }
    static void divideByZero(int a ){
        if(a ==0){
            throw new ArithmeticException("Error a == 0");
        }
    }
}