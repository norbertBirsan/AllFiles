//Write a program that calculates minutes into hours and minutes.
//
//        > Enter minutes:
//        89
//
//        Output: 1 hour and 29 minutes
package Scanner;

import java.util.Scanner;

public class MinsToHours {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter minutes: ");
        int minutes = in.nextInt();
        int hour = minutes / 60;
        int remainder = minutes % 60;
        System.out.println(hour + " hour and " + remainder + " minutes");

    }
}
