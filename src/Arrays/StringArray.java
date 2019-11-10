//Create String array for students. Initialize with students below: James, John, Adam, Elize, Jamie, Benzema
//        Loop through each elements of students. - print first character of each name on each line.
//        - Part II * Modify the loop and print the player names whose name ends with "s";
//        - Part III * Modify and print the player if it contains "s"
//        Part IV * Read the String from the user using Scanner
//        and print out the players that contains the entered String keyword by user.
package Arrays;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String [] names = new String[3];
        System.out.println(Arrays.toString(names));
        names[0] = "jamie";
        names[1] = "boB";
        names[2] = "nemo";
        System.out.println(Arrays.toString(names));
        System.out.println(names[1].charAt(0));
        System.out.println(names[2].charAt(0));
        names[1] = names[1].substring(0,1).toUpperCase() + names[1].substring(1).toLowerCase();
        System.out.println(names[1]);
        System.out.println(names.length);
    }
}



