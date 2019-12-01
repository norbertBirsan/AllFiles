import java.util.*;

public class nothing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = 0;
        int quarters = 0;
        int nickel = 0;
        int dime = 0;

        System.out.println("Enter price in cents:");
        price = scanner.nextInt();
        int change = 100 - price;

        quarters = change/25;
        change %= 25;
        nickel = change/10;

    }
}
//Task 1
//        Write a program that determines the change to be dispensed from a vending
//        machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
//        increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
//        dollar bill to pay for the item.
//
//        See the example output as shown below:
//        Input:
//        Enter price in cents: 95↵
//        Output:
//        Your change is 0 quarters, 0 dimes, and 1 nickels.
//
//        Task 2
//        Write a Java program CalculatePhoneBill to calculate the monthly telephone bills as per the following rule:
//        Ask user to enter number of calls.
//        Minimum $200 for up to 100 calls.
//        Plus $0.60 per call for next 50 calls.
//        Plus $0.50 per call for next 50 calls.
//        Plus $0.40 per call for any call beyond 200 calls.
//
//        Examples:
//        Enter number of calls: 88
//        Your bill is $200.0
//
//        Enter number of calls: 120
//        Your bill is $212.0
//
//        Enter number of calls: 185
//        Your bills is $247.5
