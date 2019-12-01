package MultiDimensionalArrays;

public class LengthOf2D {
    public static void main(String[] args) {
        int [][] nums = {{3,2,1}, {5,2,4,2,4},{2,3}};
        System.out.println("First array has " + nums[0].length + " elements ");
        System.out.println("Second array has " + nums[1].length + " elements ");
        System.out.println("Third array has " + nums[2].length + " elements ");
    }

}
//    Create a 2D int array that has 3 inner arrays with some initial values.
//        Print out the length of each inner array.
//        > Given int array of [[4,2,3], [3232,11,13, 4, 2], [23,13]]
//        Length of row 1: 3
//        Length of row 2: 5
//        Length of row 3: 2
