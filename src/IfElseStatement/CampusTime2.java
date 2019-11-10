//2) Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
//        > Campus is open from 8 am to 11 pm (23)
//        > If user enters a time within the open time they should see message :
//        “open” but if the time entered is outside of operating hours they should see: “ closed”
//        > If the user enters an invalid hour (negative number or more than 24 hours)
//        they should see an error message: “invalid time”
package IfElseStatement;

import java.util.Scanner;

public class CampusTime2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time;
        boolean campusTime;
        System.out.println("enter the time you are checking");

        time = input.nextInt();

        if(time < 0 || time >= 24) {
            System.out.println("Invalid time");
        } else if(time >= 8 && time <= 23) {
            System.out.println("Campus is open");
        } else {
            System.out.println("Campus is closed");
        }

    }
}
