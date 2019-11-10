package Loops;

import java.util.Scanner;

public class WhileLoopsPractice {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter you address");
        String address= in.nextLine();

        int count=0;

        while(address.contains("il")){
           count++;

            System.out.println("enteryour adrdress");
            address= in.nextLine();

        }
        System.out.println(count);
    }

}
