//Task:
//        Declare a variable for number of apples. You begin with 10;
//        Declare a variable for number of oranges. You begin with 5;
//
//        Then reassign the number of apples to be only 8;
//        Then reassign the number of oranges to be the same as number of apples;
//        Print out each instance of apple.
//        Print the value before you change it
package Variables;

public class ApOrReassignments {
    public static void main(String[] args) {
        int apples = 10;
        int oranges = 5;

        System.out.println("Apples: " + apples);
        System.out.println("Oranges: " + oranges);

        apples = 8;
        oranges = 8;

        System.out.println("Reassigned apples: " + apples);
        System.out.println("Reassigned oranges: " + oranges);
    }
}
