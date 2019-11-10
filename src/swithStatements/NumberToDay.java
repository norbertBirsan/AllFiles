//Write a program that asks a user to enter a number corresponding to the day of the week starting from 1 being Sunday, 2 being Monday, etc…
//        If the number is not between 1 and 7 print “invalid day”
//        > input: 7
//        > output: Saturday
package swithStatements;

import java.util.Scanner;

public class NumberToDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");
        int day = input.nextInt();
        String dayString = "";

        boolean valid = true;

        switch (day) {
            case 1:
                dayString = "Sunday";
                break;

            case 2:
                dayString = "Monday";
                break;

            case 3:
                dayString = "Tuesday";
                break;

            case 4:
                dayString = "Wednesday";
                break;

            case 5:
                dayString = "Thursday";
                break;

            case 6:
                dayString = "Friday";
                break;

            case 7:
                dayString = "Saturday";
                break;
            default:
                System.out.println("Invalid day number");
                valid = false;
        }
        if (valid) {
            System.out.println(day + " is " + dayString);
        } else {
            System.out.println("you are a failure");


        }
    }
}





