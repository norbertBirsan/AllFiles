//User is asked to enter a sentence. Display the sentence with the first word moved to the end of the sentence.
//        > input: “Java is a fun language”
//        > output: “is a fun language Java”

        package Strings;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter sentence");
        String sent=s.nextLine();

        int space=sent.indexOf(" ");
        String firstword=sent.substring(0, space);
        System.out.println(firstword);
        String rest=sent.substring(space+1);
        System.out.println(rest);
        System.out.println(rest+" "+firstword);




    }



}
