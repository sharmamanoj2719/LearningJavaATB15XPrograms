package ex_12_ForLoop;

public class Lab_92_For_Loop_Break {
    public static void main(String[] args) {
//        for(int i = 0; i<50; i++)
//
 //        System.out.println(i); // 0 t0 40 -> 50 times

//        for (int i = 0; i < 50; i++) {
//          System.out.println(i);  //  0 to 5
//           if (i == 5) {
//               break;
//            }
//       }

//        System.out.println("End the program");
        for (int i = 0; i < 50; i++) {
               if (i == 5) {
                break;
            }
            System.out.println(i); // 0 to 4
        }

        System.out.println("End the program");
    }
}

