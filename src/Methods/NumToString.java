//Write a method that will take a String of numbers (9843263 for example) and an int.
//        Add that second given number to each other number and show each operation result as separate elements of an int array
package Methods;
import java.util.*;
public class NumToString {
    public static void main(String[] args) {
        addNumToString("9843263", 5);
    }
    public static void addNumToString(String number, int add) {
        // 9 8 4 3 2 6 3, 1
        String [] nums = number.split("");
        int [] intArray = new int[nums.length];
        for(int i=0; i < nums.length; i++) {
            intArray[i] = Integer.valueOf(nums[i]) + add;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
