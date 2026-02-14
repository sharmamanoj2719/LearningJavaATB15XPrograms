package ex_27_Enum;

public class Lab_190_Congrats {
    public static void main(String[] args) {
        System.out.println(ENV.QA.getBaseURL());

        // Here I can write QA code

        if(ENV.QA.getBaseURL().equalsIgnoreCase("https://qa.myapp.com"))
            System.out.println("Start On QA !! ");
    }
}
