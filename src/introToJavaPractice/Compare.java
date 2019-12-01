package introToJavaPractice;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write 2 numbers");//ask user two enter two numbers. give two integers to compare than print out than task two

        int one = input.nextInt();
        int two = input.nextInt();
        boolean b = one > two;
        System.out.println(b);

        System.out.println("\nTask 2: ");

        boolean check = input.nextBoolean();
        System.out.println(!check);

    }
}

