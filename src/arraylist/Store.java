package arraylist;

import Classes.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String name;
    String address;
    int numberOfItems;
    ArrayList<Item> items = new ArrayList<>();

    public Store(String name, String address){
        this.name = name;
        this.address = address;
    }


    public void addItem(Item item){
        this.items.add(item);
        this.numberOfItems++;
    }
    public void addItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of items to enter:");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < quantity; i++){
            System.out.println("Enter name for item#"+ (i+1));
            String name = scanner.nextLine();
            System.out.println("Enter price for item#" + (i+1));
            double price = scanner.nextDouble();
            scanner.nextLine();
            Item item = new Item(name, price);
            this.items.add(item);
            this.numberOfItems++;
        }
    }



    public void seeInventory(){
        for(Item item: items){
            item.info();
        }
    }
}
