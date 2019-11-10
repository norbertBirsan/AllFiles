//TASK:
//
//  Create three int variables: month, day, year
//  Take those values and put them into a string in this format:
//  “M/D/Y”Create three int variables: month, day, year
//Takes those values and put them into a string in this format: “M/D/Y”
//> Input:
//Month: 5
//Day: 20
//Year: 2019
//> Output:
//5 / 20 / 2019
package Scanner;


import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Month");
        int month = in.nextInt();
        System.out.println("Day");
        int day = in.nextInt();
        System.out.println("Year");
        int year = in.nextInt();

//        After printing the original date, add 5 to the years and subtract 1 from the day. Print the new date value.
//                > input — as values are above
//> output:
//        5 / 19 / 2024
        System.out.println(month + " / " + day + " / " + year);
        year += 5;
        day -= 1;
        System.out.println(month + " / " + day + " / " + year);
    }


}
