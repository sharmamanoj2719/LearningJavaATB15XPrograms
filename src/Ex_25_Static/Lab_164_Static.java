package Ex_25_Static;

public class Lab_164_Static {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(33);

        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println(Student.course_name);
        System.out.println(Student.course_name);

    }

}

class Student {
    int age; //  Non Static or Instance Variable , Attribute,
    static String course_name = "ATB"; // Static can be a variable

    public Student(int age_c){
        this.age = age_c;
    }  // Static can be a function

    static void m1(){
        System.out.println("I am static Method");
    }

}
