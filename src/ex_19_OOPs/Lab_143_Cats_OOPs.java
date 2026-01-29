package ex_19_OOPs;

public class Lab_143_Cats_OOPs {
    public static void main(String[] args)
    {
        Cat c1 = new Cat(); // Call Default constructor
        Cat c2 = new Cat("Rani");
        Cat c3 = new Cat("Rosy");
        Cat c4= new Cat("lucy");

        System.out.println(c1.name); // null
        System.out.println(c2.name); // Rani
        System.out.println(c3.name); // Rosy
        System.out.println(c4.name); // lucy
    }
}
class Cat   {
  String name; // Attribute'

  // Default Constructor
     Cat(){

         System.out.println("Default Constructor"); // in Default constructor we can't pass anythings
  }

     Cat(String nameGiven){
       this.name = nameGiven; // this->mainly to access current object's variables, methods, or constructors.

       }
}