package Scanner;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1st");
        int num1 = input.nextInt();
        System.out.println("2nd");
        int num2 = input.nextInt();
        System.out.println("3rd");
        int num3 = input.nextInt();
        System.out.println("4th");
        int num4 = input.nextInt();
        System.out.println("5th");
        int num5 = input.nextInt();
        System.out.println("6th");
        int num6 = input.nextInt();
        System.out.println("7th");
        int num7 = input.nextInt();
        int totalSum = num1 + num2 + num3 + num4 + num5 + num6 + num7;

        System.out.println("What is the sum?: " + totalSum);

        int avg = totalSum / 7;
        System.out.println("Average is: " + avg);

    }
}
