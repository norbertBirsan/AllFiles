//1) User is asked to enter a sentence. Display the sentence with the first word moved to the end of the sentence.
//        > input: “Java is a fun language”
//        > output: “is a fun language Java”
//        hint: you know the first space will be the end of the first word
package Strings;

public class Intro {
    public static void main(String[] args) {
        String word = "java";
        String word2 = "is fun";
        char c = word.charAt(1);
        char d = word.charAt(2);
        char f = word2.charAt(0);
        System.out.println(c);
        System.out.println("" +c + f);

    }
}
