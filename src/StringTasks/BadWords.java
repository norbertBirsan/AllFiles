//User is asked to enter a message to send. You will check if
//        the message contains any of these bad words: “idiot, dumb,
//        stupid”
//
//        > if any bad words are in the message change them to “smart”
//        and print “your message was changed:” and then print the new
//        message in the next line.
//
//        > if the message had no bad words print “Your message was not
//        changed:” and then print the original message in the next line.


package StringTasks;

import java.util.Scanner;

public class BadWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter message");
        String message = s.nextLine();

       String checked = message;
       checked = checked.replace("idiot", "smart");
        checked = checked.replace("dumb", "smart");
        checked = checked.replace("stupid", "smart");

        if (message.equalsIgnoreCase(checked)){
            System.out.println("message not changed");
            System.out.println(checked);

        }else{
            System.out.println("message changed");
            System.out.println(checked);

        }

    }
}




