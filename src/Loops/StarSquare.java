//Write a program that asks the user to enter a number. The number will be how big your square will be. Square made of ‘#’ sign
//        > input: 5
//        > output:
//        # # # # #
//        # # # # #
//        # # # # #
//        # # # # #
//        # # # # #
package Loops;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num=input.nextInt();

        for(int i=0; i < num; i++){

            for(int j=0; j < num; j++){
                System.out.print("# ");
            }
            System.out.println();
        }


    }
}
