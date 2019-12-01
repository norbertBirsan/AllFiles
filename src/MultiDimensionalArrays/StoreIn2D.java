package MultiDimensionalArrays;
import java.util.*;
public class StoreIn2D {
    public static void main(String[] args) {
//        int [][] groups = new int[3][4];
//
//        int [] num = {1,2,3,4,5};
//        groups[1] = num;
//        System.out.println(Arrays.deepToString(groups));
//
//        String [][] str = new String[4][4];
//        System.out.println(Arrays.deepToString(str));

        String [][] groups = new String[3][];
        String [] arr1 = {"name1", "name2", "name3", "name4"};
        String [] arr2 = {"james", "adam"};
        String [] arr3 = {"bob", "matt", "john"};

        groups[0] = arr1;
        groups[1] = arr2;
        groups[2] = arr3;
        System.out.println(Arrays.deepToString(groups));






    }
}


//    Create a 2D String array that will hold 3 groups.
//        Create three 1D arrays and initialize them with some group members names.
//        Store each 1D array into your 2D and print the 2D array at the end
