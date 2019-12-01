package Constructors;

import java.util.Scanner;

public class Life {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        House h1 = new House();
        System.out.println("Please enter type of house:");
        h1.type = s.nextLine();
        System.out.println("Also enter address:");
        h1.address = s.nextLine();
        System.out.println("Please enter number of rooms:");
        h1.numRooms = s.nextLine();

        h1.info();



    }


    }

