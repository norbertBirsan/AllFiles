package Classes;

public class Flag {
    //this is a CLASS and these ones are INSTANCE VARIABLES
    String country;
    int size;
    String color;
    String material;

    public void info() {
        System.out.println("Country: " + country);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
    }

    public void flap() {                               //BEHAVIOR that belongs to a class
        System.out.println("Flag is flapping");
    }

    //Task:
    //Create a method called upgrade.
    //Method should accept int for size and String for material.
    //Method upgrade should reassign the current.
    //Size and material with given new values.
    public void upgrade(int size, String material) {    //you also could just give a different name as size1, but it will get confusing; so use this.
        this.size = size;                                 //this. is a keyword that tells it is the instance variable
        this.material = material;
    }
}