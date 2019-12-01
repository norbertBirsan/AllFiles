//Given an array of values: 23, 1, 34, 3, 54, 54, 51
//        Print the biggest two values. Only Unique values
//        > The result here should be:
//        54
//        51
package Arrays;

import java.util.Arrays;

public class BiggestTwo {
    public static void main(String[] args) {
        int [] nums= {23, 1, 34, 3, 54, 54, 51, 54};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        String checked = "";
        int count = 0;
        for(int i = nums.length-1; i >= 0; i--) {
            if(count == 2) {
                break;
            }
            if(!checked.contains(nums[i]+ "")) {
                System.out.println(nums[i]);
                checked += nums[i] + " ";
                count++;
            }
        }

    }
}
