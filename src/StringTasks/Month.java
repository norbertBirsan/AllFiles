//You have a value that hold what month it is (October). Ask the
//        user to enter the month from the console. If the user’s input
//        matches the expected month put print true, but if the input does
//        not match the actual month print false. Uppercase and
//        lowercase letters do not matter, we only care about the value.


        package StringTasks;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String month1 = "October";


        System.out.println("Enter the month");
        String user = input.nextLine();
        boolean check = user.equalsIgnoreCase(month1);
        System.out.println(check);

//        String month1 = user.toLowerCase();
//        System.out.println(month1.equals("october"));
    }
}
