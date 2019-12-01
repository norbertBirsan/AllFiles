package introToJavaPractice;

import java.util.Scanner;

public class VendingVersion2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 99");

        int change = input.nextInt(); //42

        int quarters = change / 25; //42/25=1.68 1
        int dimes = (change % 25) / 10;//42%25=17 1
        int nickels = (change % 25 % 10) / 5;//42%25=17%10=7 /5=1.4 1
        int pennies = change % 25 % 10 % 5;//42%25=17%10=7%5= 2
        System.out.println("Your change was converted to:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}

