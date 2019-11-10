//1) Credentials: Given two existing data: user and pass of “test” and “test123”
//        Write a program that asks users to enter a username and password.
//        —> If the username and password match print: “ Welcome!”
//        —> If username is incorrect print: “invalid username” and don’t ask for the password
//        —> If password is incorrect print: “invalid password”
package Strings;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "test";
        String password = "test123";

        System.out.println("enter");
        String userInputUsernname = input.nextLine();

        if (userInputUsernname.equals(username)) {
            System.out.println("enter password");
            String userpassword = input.nextLine();
            if (userpassword.equals(password)) {
                System.out.println("welcome");
            } else {
                System.out.println("wrong password");
            }
        } else {
            System.out.println("wrong username");
        }
    }
}