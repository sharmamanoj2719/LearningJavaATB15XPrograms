package ex_18_Arrays;

public class Lab131_InterviewQ_2ndHigh {
    public static void main(String[] args) {
        int[] arr = {10, 5, 33, 20, 99,102, 45};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int n : arr) {

            if (n > highest) {
                secondHighest = highest;
                highest = n;
            } else if (n > secondHighest && n != highest) {
                secondHighest = n;
            }
        }

        System.out.println("Second Highest = " + secondHighest);
    }
}
