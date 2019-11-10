//5. Write a program that finds if the entered number is odd or even. ->enter number->declare int,
//        Simply ask user to enter one integer value and print “odd” or “even” based on the value user enters.

        package IfElseStatement;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value");
        int numb = input.nextInt();

        if (numb % 2 == 0) {
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }

}
