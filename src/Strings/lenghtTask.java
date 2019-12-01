package Strings;

import java.util.Scanner;

public class lenghtTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message");
            String message = input.nextLine();

        if(message.isEmpty()){
            System.out.println("empty");
        }else if(message.length()<=10){
            System.out.println("cool");
        }else{
            System.out.println("too long");
        }

        }
    }
