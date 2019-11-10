//
//3) Given an array with the value of:
//        31, 20, 25, 20, 3, 48, 26, 12
//        Print out the biggest and smallest values in the array

package Arrays;

import java.util.Arrays;

public class MaxAndMin {
    ;

    public static void main(String[] args) {
        int[] arr = {31, 20, 25, 20, 3, 48, 26, 12};
        Arrays.sort(arr);


        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[0]);
    }


}



