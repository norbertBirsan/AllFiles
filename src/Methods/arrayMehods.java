//Write a method accepts an int array and a number.
//        Replace any negative numbers in your array with the given number.
//        Print the array

//Write a method that accepts an int array.
//        Print out the array using the same format as Arrays.toString method.
//        DO NOT USE THE toString() METHOD.
//        [element, element, element]

        package Methods;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayMehods {
    public static void main(String[] args) {
        int[] arr2 = {-1, 3, -4, -2, 32, 2, -33, 1};
        printNegativeNumbers(arr2);

    }

    public static void printNegativeNumbers(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int num : arr) {
            if (num < 0) {
                System.out.println(num);
            }
        }
    }

    public static void changeNegativeNumbers(int[] arr, int change) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = change;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void arraysToString(int[]arr){
        //output:[10,9,5,4,3,7,4]
        String result="[";

        for(int num:arr){
            result+=num+", ";

        }
    result=result.trim().substring(0,result.length()-1)+"]";
    }

}