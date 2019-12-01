package Classes;

public class Item {
    String name;
    double price;
    int size;

    public Item(String name, double price){
        this.name = name;
        this.price = price;


    }
    //overload the constructor that takes 3 parameters to set all 3 instance variables
    public Item(String name, double price, int size){
        this(name,price);
        this.size = size;

    }
    // We can call constructor inside another constructor.
    //It is called constructor chaining.
    //We can do it using keyword 'this' with the parenthesis.

    public void info(){//for printing
        System.out.println("\nName: " + name);//name without this. refferes to the name(instance variable) in line 4;
        System.out.println("Price: " + price);



    }
}
