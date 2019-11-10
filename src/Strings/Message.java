//2) Send Message: User will enter a message, if message is valid it will be sent,
//  there is a chance the message will not be delivered due to internet
//        > User takes a message that needs to be at least 15 characters
//        > If the message is valid user will see message: “sent” and “not sent”
//        if the message was not valid
//        > If message was sent there is a 50 % chance the message will not be delivered.
//        >> If the message is delivered user will see message: “ delivered”
//        HINT: use random number for random chance to send

package Strings;

import java.util.Random;
import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int chance = random.nextInt(2);//10
        System.out.println("enter messege");
        String message = input.nextLine();

        if (message.length() >= 15) {
            System.out.println("sent");
            if (random.nextBoolean()) {
                System.out.println("Message delivered");
            } else {
                System.out.println("Message was not delivered");
            }
        } else {
            System.out.println("not sent");


        }
    }
}
