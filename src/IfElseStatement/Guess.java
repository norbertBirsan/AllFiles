//3) Guess Number: User is asked to guess a number from 1 to 10
//        Write a program that generates a random number and takes a guess from the user.
//        > If user guesses correct number they should see “ Congrats you guessed right”
//        > If user guess is more than the random number they should see: “your guess is too high”
//        > If user guess is less than the random number they should see “your guess it too low”
package IfElseStatement;
import java.util.Random;
import java.util.Scanner;

public class Guess {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int randomNumber = random.nextInt(10);
    randomNumber++; // this is how I get the range to be 1-10

    System.out.println("Guess a number ");
    int guessNumber = input.nextInt();

   System.out.println(randomNumber);

    if(randomNumber == guessNumber) {
        System.out.println("Good guess");
    } else if(guessNumber < 1 || guessNumber > 10) {
        System.out.println("Not a valid guess");
    } else if(guessNumber > randomNumber) {
        System.out.println("Too high");
    } else if (guessNumber < randomNumber){
        System.out.println("Too Low");
    }


}
}

