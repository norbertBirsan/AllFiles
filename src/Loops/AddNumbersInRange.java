//Write a program that will ask the user to enter two numbers. The first number will be the starting value for your range.
// The second number will be the ending number of your range. Add up the sum of all the numbers in your range and print
//        “The some of num1 to num2 is: sumAllValue”
//        > input: 1, 100
//        > output: “The some of 1 to 100 is: 5050”
package Loops;

import java.util.Scanner;

public class AddNumbersInRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n = s.nextInt();
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());

        System.out.println(front+back);
    }

    }

