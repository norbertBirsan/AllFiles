//Write a program that prints only odd numbers
//        from 0-50
//        flow:
//        1
//        3
//        5
//        7
//        ..
package Loops;



public class OddNumbers {
    public static void main(String[] args) {


        int oddNumber = 1;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                // oddNumber += 2;
            } else {
                System.out.println("Even number here");
            }

        }

    }}