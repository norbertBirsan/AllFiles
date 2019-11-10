//Ask user to enter 5 integers and store all of them.(assign five int)
//Count how many of them odd, how many of them even. (assign odd and one even = 0;
//Print number of evens and odds.
package IfElseStatement;

import java.util.Scanner;

public class NumberOddsEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 integers");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//        int num4 = input.nextInt();
//        int num5 = input.nextInt();
//
//        int odd = 0;
//        int even = 0;
//
//        if (num1 % 2 == 0) {
//            even++;
//        } else {
//            odd++;
//        }
//        if (num2 % 2 == 0) {
//            even++;
//
//        } else {
//            odd++;
//
//        }
//        if (num3 % 2 == 0) {
//            even++;
//
//        } else {
//            odd++;
//
//        }
//        if (num4 % 2 == 0) {
//            even++;
//
//        } else {
//            odd++;
//
//            if (num5 % 2 == 0) {
//
//            } else {
//                odd++;
//                System.out.println("total even " + even);
//                System.out.println("totals odd " + odd);
//
//            }
//        }
//    }
//}
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int evens = 0;
        int odds = 0;


        if (num1 % 2 == 0) {
            evens++;
        } else {
            odds++;
        }

        if (num2 % 2 == 0) {
            evens++;
        } else {
            odds++;
        }

        if (num3 % 2 == 0) {
            evens++;
        } else {
            odds++;
        }

        if (num4 % 2 == 0) {
            evens++;
        } else {
            odds++;
        }

        if (num5 % 2 == 0) {
            evens++;
        } else {
            odds++;
        }
            System.out.println("Total even numbers: " + evens);
            System.out.println("Total odd numbers: " + odds);
        }
    }

