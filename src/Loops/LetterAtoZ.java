package Loops;

import java.util.Scanner;

public class LetterAtoZ {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        char letter= inp.nextLine().toUpperCase().trim().charAt(0);

        if (letter >= 65 && letter <= 90) {

            while (letter != 91) {
                System.out.println(letter++);
            }

            }else {
            System.out.println("Not a valid letter");
        }

    }

}
