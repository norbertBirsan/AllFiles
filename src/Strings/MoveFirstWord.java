//User is asked to enter a sentence. Display the sentence with the first word moved to the end of the sentence.
//        > input: “Java is a fun language”
//        > output: “is a fun language Java”

        package Strings;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = input.nextLine();

        int space = sentence.indexOf(" ");
        String firstWord = sentence.substring(0,space);
        String remain = sentence.substring(space+1);
        System.out.println(remain+ " " + firstWord);





    }



}
