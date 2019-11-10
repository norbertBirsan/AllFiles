//You have number of chairs stored as a short datatype with the value of 5
//        More chairs were ordered so we need something to store more chairs
//        --> Change the chair datatype to long
//        You realize you now have too much storage
//        --> Change the chair datatype to int
package Variables;

public class PrimitiveTaskChairs {
    public static void main(String[] args) {
        int chairs = 5;
        System.out.println("Chairs: " + chairs);

        long moreChairs = chairs;
        System.out.println("More: " + moreChairs);

        int lessChairs = (int)moreChairs;
        System.out.println("Less: " + lessChairs);






    }
}
