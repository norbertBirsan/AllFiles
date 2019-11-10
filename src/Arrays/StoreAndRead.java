//Create String array size of 4;
//        Store 4 names in that array. Give a proper name for your array variable.
//        Make sure to assign value for every single index.
//        Print out second and third names on separate lines.
package Arrays;

import java.util.Arrays;

public class StoreAndRead {
    public static void main(String[] args) {
        int [] nums = new int[4];

        System.out.println(Arrays.toString(nums));
        nums[0] = 4;
        nums[1] = 3;
        nums[2] = 6;
        nums[2] = nums[2] + 1;
        nums[3] = nums[0] + nums[1];
        System.out.println(nums[2]);
        System.out.println(Arrays.toString(nums));
    }
}
