package ex_18_Arrays;

import java.util.Arrays;

public class Lab_130_2nd_High_Number {
    public static void main(String[] args) {

            int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34

            Arrays.sort(numbers);
            System.out.println(numbers[numbers.length-2]);
        }

}
