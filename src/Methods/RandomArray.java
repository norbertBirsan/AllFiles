//Create a method that will generate a random int array.
//        The method takes the size of the array and the bound of the random numbers.
//        Return the random array

        package Methods;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createRandomArray(5,100)));

    }
        public static int[]createRandomArray(int size,int bound){
        int[]arr=new int[size];
            Random rd = new Random(); // creating Random object


            for (int i = 0; i < size; i++) {
                int ran = rd.nextInt(bound);
                arr[i] = ran;

            }
            return arr;


    }
    
}
