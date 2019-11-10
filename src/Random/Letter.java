//Write a program that will gereate a random uppercase letter.
//        Print the lettere.
//        Hint: ascii table
package Random;

import java.util.Random;

public class Letter {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(26);
        //char randomLetter = (char) (letter.nextInt(26) + 'A');
        number += 65;//ascii for A instead of starting with 0 we start with 65. we don't want 0 for A
        char letter = (char) number;
        System.out.println("My number is: " + number);
        System.out.println("My letter is: " + letter);


    }
}
