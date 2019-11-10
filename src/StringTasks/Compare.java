//User takes two strings from the user. Compare the Strings and
//        print out the String that comes first lexicographically.
//


        package StringTasks;

import java.util.Scanner;

public class Compare {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter two Strings to compare");
            String word1 = in.nextLine();
            String word2 = in.nextLine();

            int compare = word1.compareTo(word2);

            if(compare < 0) {
                System.out.println(word1);
            } else if(compare > 0) {
                System.out.println(word2);
            } else {
                System.out.println("Equal");
            }

        }

}
