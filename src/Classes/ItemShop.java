package Classes;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ItemShop {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("How many items do you have");
        int numOfItems = s.nextInt();
        s.nextLine();

        //still no items only the array that holds items until here
        //next step is to fill up our array

        Item[] myItems = new Item[numOfItems];

        for (int i = 0; i < myItems.length; i++) {
            System.out.println("Enter name of item: " + (i + 1));
            String item = s.nextLine();

            System.out.println("Enetr the price of item " + (i + 1));
            double price = s.nextDouble();
            s.nextLine();

            myItems[i] = new Item (item, price);


        }

        for(Item item : myItems){
            item.info();

            }
        }

    }
