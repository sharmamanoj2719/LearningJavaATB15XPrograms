package ex_20_OOPs_Polymorphism.Methodoverloading;

public class Lab_150_Real_Example {
    public static void main(String[] args) {

       WebAutomation t1 = new WebAutomation();

           t1.openBrowser();
           t1.openBrowser("FireFox Browser");

       }
    }
class WebAutomation {

    void openBrowser(){

        System.out.println("Default Browser !!");

    }
    void openBrowser(String browser){

        System.out.println("Starting Browser!!" + browser);

    }


}