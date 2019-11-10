//2) Create a number variable for age. Create another variable that has a value of:
//        [65 - the given age]. Then print the the resulting age in this format: Because you are:
//        givenAge years old and will retire in: secondAge years
//        > input: 23
//        > output: Because you are: 23 years old and will retire in: 42 years

package Scanner;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your age: ");
        int age = in.nextInt();
        int ageMinus = 65 - age;
        System.out.println("Because you are: " + age + " years old and will retire in: " + ageMinus + " years");


        }
    }