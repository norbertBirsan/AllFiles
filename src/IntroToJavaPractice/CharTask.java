package IntroToJavaPractice;

import java.util.Scanner;

public class CharTask {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        char charOne=input.nextLine().charAt(0);
        char charTwo=input.nextLine().charAt(0);
        System.out.println(charOne > charTwo);


    }
}
