//Given numbers of 3,30,14,6,50,20
//        Find and print the biggest number/
package Arrays;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
            int [] numbers = {23,1,34,3,54,54,51,54};
            int second_max = 0;
            Arrays.sort(numbers);
            int max = numbers[numbers.length-1];
            for (int i =numbers.length-2; i>=0; i--)
            {
                if (numbers[i] < max) {
                    second_max = numbers[i];
                    break;
                }
            }
            System.out.println(max);
            System.out.println(second_max);

        }
    }









