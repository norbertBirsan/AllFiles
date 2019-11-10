//1. Write a program that asks 3 integers from user and finds maximum value among those 3 entered integers.
//  Print “All 3 integers are equal” if they are all equal to each other.
//        Note: Use if-else statement
//        Note: Consider logical operators

package IfElseStatement;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = 0;

        if (num1 > num2 && num1 > num3) {
            max = num1;

        } else if (num2 > num1 && num2 > num3) {
            max = num2;


        } else if (num3 > num1 && num3 > num2) {
            max = num3;

        }
        else if(num1 == num2 && num1 == num3){
            System.out.println("All numbers are equal");
        }
        System.out.println("Max number is: " + max);
    }
}
//if(num1 == num2 && num1 == num3) {
//
//        System.out.println("All the numbers are equal");
//        } else if(num1 >= num2 && num1 >= num3) {
//        System.out.println(num1 + " is the biggest");
//        } else if(num2 >= num1 && num2 >= num3) {
//        System.out.println(num2 + " is the biggest");
//        } else {
//        System.out.println(num3 + " is the biggest");
//        }






