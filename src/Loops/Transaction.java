//You have a bank account balance of 1500. You can continue to spend as long as you have money in your account.
// Write a program that will ask the user to enter the cost of an item.
// If your balance has enough money for that item complete the purchase and take the money out of the account.
// If there is not enough money in your account for that item print “Card Declined get a different item”.
// Allow continuous purchasing until the account becomes 0. When your account has a balance of 0 print “You are broke”
//        Flow: (balance of 605) Please enter transaction amount: > 200
//        Item Purchased  Please enter transaction amount: > 300
//        Item Purchased Please enter transaction amount: > 100
//        Item Purchased Please enter transaction amount: 5 You are broke.
package Loops;

import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int balance=1500;
        int transBal;
        int dec=0;

        while (balance > 0) {
            System.out.println("enter the transaction amount");
            transBal=input.nextInt();

            if (transBal <= balance) {
                System.out.println("item purchesed");
                balance-=transBal;
                dec=0;//this refreshes after i can buy cheaper item after 2 attempts and than i can still buy something cheaper if i still have money on card

            }else{
                System.out.println("card declined");
            }
            if (dec == 3) {
                System.out.println("card declined");
            }



        if(balance==3){
            System.out.println("card is locke");
        }  break;
        }



    }
}
