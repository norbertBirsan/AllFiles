//Write a program that reverses the String. Ask for a word from the user and reverse the word.
//        Flow:
//        Please enter the word:
//        James
//        semaJ
//        Please enter the word:
//        hello
//        olleh
//        Hint: use charAt, length
package Loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter word");
        String word= input.nextLine();
        String reverse="";

        for(int i=word.length()-1; i>=0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);


    }
}
