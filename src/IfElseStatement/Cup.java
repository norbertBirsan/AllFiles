package IfElseStatement;

import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        int passCode = 3241;

        //Write a program that asks to enter 4 digit integer via scanner
        // compare the passCode
        // if valid passCode print "Welcome to iPhone"
        // if invalid print "Try again!"
        // Check for Special case:
        // 1. check for negative number. If entered passcode is negative
        // print "No Negative number"
        // 2. passcode must be only 4 digits.
        // if more than 4 digits then print "You entered  more digits"
        // if less than 4 digits then print "You entered less digits"

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Pass Code");
        int userPassCode = input.nextInt();


        if(passCode == userPassCode){
            System.out.println("Welcome to iPhone");

        }

        else if  (userPassCode < 0){
            System.out.println("No Negative number");
        }
        else if (userPassCode > 9999){
            System.out.println("You entered more digits");
        }
        else if (userPassCode < 1000){
            System.out.println("You entered less digits");
        }
        else{
            System.out.println("Try again");
        }


    }
}


