//You have 20 wild cats;
//        You will take 5 of them in
//        Print out the original values
//        --> So far you should have two variables. - wild, pets
        package Variables;

public class CatReassignment {
    public static void main(String[] args){
        int WildCats = 20;
        int pets = 0;
        System.out.println("Wild Cats: " + WildCats);
        System.out.println("Pets: " + pets);
        System.out.println();

        WildCats = 15;
        pets = 5;
        System.out.println("Wild: " + WildCats);
        System.out.println("Pets: " + pets);
        System.out.println();

       // take in 5 more cats, reassign wild - 10;
        WildCats = 10;
        pets = 10;
        System.out.println("Wild: " + WildCats);
        System.out.println("Pets: " + pets);



    }
}
