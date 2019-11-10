package Loops;
//
//Please write a program that asks the name from user using Scanner and print "Welcome, name" for 15 times.
//
//        Part 2:
//        Print character on the new line
import java.util.Scanner;

public class AskNames {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;

        for (int i= 0; i < 5; i++) {
            System.out.println("Enter name " + (i+1));
            name = input.nextLine();
            System.out.println(name);
        }

    }
}

