package ex_26_Expections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_184_Throws{
    public static void main(String[] args) {

    }

    static void t() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}