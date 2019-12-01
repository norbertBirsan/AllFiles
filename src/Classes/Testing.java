package Classes;

public class Testing {
    public static void main(String[] args) {

        String name = "James";           //String is an object; line 6
        Flag f1 = new Flag();           //f1 is the object now
        f1.country = "USA";             //country, color, size and material are instance variables
        f1.color = "Red/white";         //you don't have to use all the variables in your object
        f1.size = 5;
        f1.material = "wood";
        System.out.println();
        System.out.println(f1.country);
        f1.flap();
        System.out.println();
        Flag f2 = new Flag();
        System.out.println(f2.country);       //right new this will give us null
        System.out.println();
        f1.info();
        f2.info();
    }
}