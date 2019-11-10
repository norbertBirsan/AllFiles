//Create 2 String variables for your username and password.
//
//        Write a program that asks from the user to enter the username.
//        If username matches then ask for password. If password matches too, then print "Login successfull!".
//        If username is true but password is not true, print "wrong password"
//        if username doesn't match, print "invalid username."
package IfElseStatement;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "nobat2609";
        String password = "a23456";

        System.out.println("Please enter your Username");
        String enteredUsername = input.nextLine();


        if(enteredUsername.equals(username)){
            System.out.println("Please enter Password");
            String enteredPassword = input.nextLine();
            if(enteredPassword.equals(password)){
                System.out.println("Login Succsessful");
            }
            else{
                System.out.println("Wrong password");
            }
        }
        else{
            System.out.println("Invalid username. Try again");
        }
    }
}
