package ex_19_OOPs;

public class Lab_144_Constructor_Overloding {
    public static void main(String[] args) {
    Baby b1 = new Baby();
    Baby b2 = new Baby("Pramod");
    Baby b3 = new Baby("Manoj","10K");
}
}

class Baby{

    String name;

    Baby(){
        System.out.println("DC");
    }

    Baby(String name){
        System.out.println("PC - name");
    }

    Baby(String name,String money){
        System.out.println("PC - name.age");
    }


}

