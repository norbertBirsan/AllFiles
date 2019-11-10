//3) Write a program that will take ask the user for their age. (scanner and systemout)
//        Let the user know if they have access to the building.
//        They must be 30 years old to have access to the building. (age>=30)
//        If the user enters an age above 100 or age  less than 0, print “Not a valid age”. if age>=100 ||age<0, sout not valid age
//        If they are old enough print “Welcome to the building” but if they are too young print “Sorry try again when you’re 30” . (if entered and given age
//equal, sout welcome, else piss off, to young)


package IfElseStatement;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter age: ");

        int age = input.nextInt();


        if (age >=30 && age < 100){// age < 0 || age > 100 println(sorry no access
            System.out.println("Welcome to the building");

        }else if (age< 30){
            System.out.println("Sorry try again when you are 30");

        }else{
            System.out.println("Not a valid age");
        }

    }
}
