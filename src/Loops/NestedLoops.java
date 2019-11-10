package Loops;

public class NestedLoops {
    public static void main(String[] args) {
        //        for(int i=0; i < 5; i++) {
//
//            System.out.println("i is " + i);
//
//            for(int j=0; j < 5; j++) {
//
//                System.out.println("j is " + j);
//
//            }
//            System.out.println();
//        }
        outer:
        for (int i = 0; i < 5; i++) {
            System.out.println("outer is " + i);
            inner:
            for (int j = 0; j <= i; j++) {
                System.out.println("inner is " + j);
                if (j == 2) {
                    break outer;//other wise would break inner loop
                }
                System.out.println();
            }

        }
    }
}
//    outer:
//            for (int i = 0; i < 5; i++) {
//        System.out.println("i is " + i);
//        inner:
//        for (int j = 0; j < 5; j++) {
//            if (j == 3) {
//                continue inner;
//            }
//            System.out.println("j is " + j);
//            if (i == 3) {
//                break inner;
//            }
//        }
//        System.out.println();
//    }