//
//Write a program that asks the number of cars user has and create an array of String with given size. Then ask the user to enter each car. After getting all the cars, print the array.
//        Flow: Enter number of cars: > 3 Enter car 1: > BMW Enter car 2: > Mercedes Enter car 3: > Toyota
//        [BMW, Mercedes, Toyota]


        package Arrays;

import java.net.SecureCacheResponse;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Garage {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of cars");
        int size = s.nextInt();
        s.nextLine();

        String[] cars  =  new String[size];

        for (int i = 0; i < size ;i++){

            System.out.println("enter car: "+ cars );
            String car=s.nextLine();

            cars[i]=car;
        }
        System.out.println(Arrays.toString(cars));



    }
}
