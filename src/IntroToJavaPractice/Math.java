//5) Write a program that will ask user to enter two characters.
//        Declare a boolean with the following value: charOne > charTwo.
//        Print the resulting boolean.


        package IntroToJavaPractice;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double one = input.nextDouble();
        double two = input.nextDouble();

        System.out.println("Add: " + (one + two));
        System.out.println("Sub: " + (one - two));
        System.out.println("Div: " + (one / two));
        System.out.println("Multi: " + (one * two));
        System.out.println("Remind: " + (one % two));


    }
}

