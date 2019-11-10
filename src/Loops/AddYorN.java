//Create a program that will continue to add 1 to a number if the user keeps entering “y” or “yes” Number will start at 0.
// When the user enters “n” or “no” Print out the final number.
//        Flow:
//        Would you like to add 1?
//        > y
//        Would you like to add 1?
//        > y
//        Would you like to add 1?
//        > y
//        Would you like to add 1?
//        > n
//        Your number is: 3
package Loops;

import java.util.Scanner;

public class AddYorN {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Would you like to add 1");
        String yesOrNo = input.nextLine();
        int count = 0;
        while (yesOrNo.equals("yes") || yesOrNo.equals("y")) {
            count++;
            System.out.println("Would you like to add 1");
            yesOrNo = input.nextLine();
        }
        System.out.println("Your number is: " + count);

        int num2=-1;
        do {
            System.out.println("would you like to add 1");
            yesOrNo = input.nextLine();
        }
            while (yesOrNo.equals("yes")) ;

        }
    }