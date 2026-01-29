package ex_19_OOPs;

public class Lab_142_constructor {

    public static void main(String[] args) {
        Animal dog = new Animal(); // call default constructor or non parameterized constructor
             MySQL a = new MySQL();
            ReadExcelFile e = new ReadExcelFile();

        }

    }
  // where we use default constructor --> use for connection
    class MySQL {
        MySQL() {
            System.out.println("MySQL Connected!");
        }
    }

    class ReadExcelFile {
        ReadExcelFile() {
            System.out.println("ExcelFile is Loaded!");
        }
    }

