package ex_27_Enum;

public class Lab_188_Enum2  {
    public static void main(String[] args) {

        Day today = Day.MONDAY;

        switch (today){
            case MONDAY -> System.out.println("Monday");
            case FRIDAY -> System.out.println("FRIDAY");
        }


        System.out.println(API_URLS.valueOf("GOOGLE"));

    }
}