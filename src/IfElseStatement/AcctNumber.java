

package IfElseStatement;

import java.util.Scanner;

public class AcctNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String acctN = s.nextLine();
        String firstNum = acctN.substring(0, 1);

        boolean check = true;

        if (firstNum.equals("2") || firstNum.equals("5")) {
            check = true;
        } else {
            System.out.println("invalid");
        }
        if (firstNum.startsWith("2")) {
            if (acctN.length() >= 7) {
                System.out.println("valid 2");
            } else {
                System.out.println("invalid 2");

            }
        }
        if (firstNum.startsWith("5")) {
            if (acctN.length() >= 10) {
                System.out.println("valid 5");
            } else {
                System.out.println("invalid 5");

            }
        }

    }

}
//        Scanner //User is asked to enter an account number. You will check if these account numbers are valid.(
////        > If the account number begins with a “2” the account number should be 7 characters long
////        > If the account number begins with a “5” the account number should be 10 characters long
//////        —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print
//////        “ Invalid account number”input = new Scanner(System.in);
//        System.out.println("Enter your account number");
//        String num = input.nextLine();
//        String firstNumber = num.substring(0, 1);







