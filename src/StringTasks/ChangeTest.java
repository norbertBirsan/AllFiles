//You        have a String with the following value:
//
//        -> “We will have a picnic when the weather gets nicer”
//
//        First print the given sentence. Then the user is asked to enter the
//        following: the set of characters from the sentence they want to
//        change, and the set of characters that will show up in place of
//        the ones which were removed. Print the new sentence.
//
//        > input: “w” , “La”
//
//        > output: “We Laill have a picnic Lahen the Laeather gets nicer”


        package StringTasks;

import java.util.Scanner;

public class ChangeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "We will have a picnic when the weather gets nicer";
        System.out.println(word);
        System.out.println("What do you want to change");
        String change = input.nextLine();
        System.out.println("What do you want to change that to");
        String replace = input.nextLine();
        String newWord = word.replace(change,replace);
        System.out.println(newWord);


    }

}
