//Write a program for the login to application.
//        Program should ask for the password until user hits right password.
//        password is "secret478". If user enters right password print "Welcome to your profile!" and exits the infinite loop.
//        Flow:
//        Please enter your password:
//        > james
//        Please enter your password:
//        > adam
//        Please enter your password:
//        > secret478
//        Welcome to your profile!
//Part 2:
//        Modify the above task:
//        Give 3 attempts to login.
//        If user fails to enter right password within 3 attempts print "Sorry. You account is locked. Try after 5 hours" and end the program.
package Loops;

import java.util.Scanner;

public class InfinitPassword {
    public static void main(String[] args) {
        String password="secret478";
        Scanner input = new Scanner(System.in);

        System.out.println("enter password");
        String passWord= input.nextLine();

        if (passWord.equals(password)) {
            System.out.println("Welcome User!");
        } else {
            for (int attempts = 0; attempts < 2; attempts++) {
                System.out.println("Enter Your Password:");
                passWord = input.nextLine();
                if (passWord.equals(password)) {
                    System.out.println("Welcome User!");
                }
            }
            System.out.println("Access Denied!");
        }
    }
}
//oooooor
//Scanner input = new Scanner(System.in);
//    int attempts = 0;
//        for(; ; attempts++) {
//                if(attempts == 3) {
//                System.out.println("Your account is locked");
//                break;
//                }
//                System.out.println("Enter the password");
//                String userPass = input.nextLine();
//                if(password.equals(userPass)) {
//                System.out.println("Welcome to your profile");
//                break;
//                }
//                }
//                }
//                }

