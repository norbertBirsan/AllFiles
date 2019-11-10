//1) You have a String with the following value:
//
//        -> “Cybertek is located in Des Plaines”
//
//        The user is asked to enter a part of the string they are looking for.
//        Find the position of the String the user is looking for and print it.
//
//        Ex:
//
//        > Input: “located”
//
//        > Output: 12


        package StringTasks;


import java.util.Scanner;

public class Cybertek {
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);

       String str = "Cybertek is located in Des Plaines";

       String word = input.nextLine();

       int index = str.indexOf(word);
       System.out.println(index);
   }
    }
