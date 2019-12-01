package finalAndMemory;

public class Blue {

    //String name;//null, not pointing at any object
    final String name = "Jason";//once final set, can't change it.




    public static void main(String[] args) {
        final int k;
        System.out.println("Program");
        k = 23;
        System.out.println(k);
    }
}
