//Write a program that asks the user to enter a number more than 0.
// Print all the numbers from 0 to the entered number.
package Loops;

import java.util.Scanner;

public class NumbersFromTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        int start=0;

        while (start<= num){
            System.out.println(start++);
        }

    }
}
