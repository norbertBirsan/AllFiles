// please writ a program that asks the name from user using Scanner and print
// "Welcome, users name for 15 times.

package Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter name");
        String name = input.nextLine();

        for(int i = 0; i< 15; i++)
        {System.out.println(" ");
        }

    }
}
