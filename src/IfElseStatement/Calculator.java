package IfElseStatement;

import java.util.Scanner;

public class Calculator {
//2. Write a program that asks two double values and allows user to choose arithmetic operation to apply.
//        Then program should calculate based on the chosen arithmetic operator by user.
//        Note: Use switch statement
//        Flow:
//         Please enter two double values: > 23.5 > 11.3 Please choose operator from below options: +, -, *, / >- 
//        Result of 23.5 - 11.3 is 12.2




        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input first number: ");
            double a = input.nextDouble();
            System.out.print("Input second number: ");
            double b = input.nextDouble();
            input.nextLine();
            System.out.print("Choose operator from *, -, +, /");
            String operator = input.nextLine();
            double x;// = 0;

            if (operator.equals("+")){
                x = a + b;
                System.out.println("Result of " + a + " + " + b + " is: " + x);//a + operator + b + is: {num1 + num2));
            }
            else if (operator.equals("-")){
                x = a - b;
                System.out.println("Result of " + a + " - " + b + " is: " + x);
            }
            else if (operator.equals("*")){
                x = a * b;
                System.out.println("Result of " + a + " * " + b + " is: " + x);
            }
            else if (operator.equals("/")){
                x = a / b;
                System.out.println("Result of " + a + " / " + b + " is: " + x);
            }
            else {
                System.out.println("Invalid operator entered. Please try again!");
            }

        }
    }


