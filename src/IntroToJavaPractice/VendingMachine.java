

        package IntroToJavaPractice;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int change, remain, quarters, dimes, nickles, pennies;
        System.out.println("Enter your change");
        change = input.nextInt(); //68
        remain = change; //68


        quarters = change / 25; //quarter -> 2
        remain %= 25;// remain %= 25; , 68 - 50 = 18

        dimes = remain / 10; // 18 / 10
        remain %= 10;

        nickles = remain / 5;
        remain %= 5;

        pennies = remain;


        System.out.println("Your change of " + change +  " was converted to ");
        System.out.println("Quarters " + quarters);
        System.out.println("Dimes "  + dimes);
        System.out.println("Nickles " + nickles);
        System.out.println("Pennies " + pennies);

    }
}


