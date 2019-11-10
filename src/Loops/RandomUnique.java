//Generate a random number that is six digits long.
//        Each digit in this number should be unique,
//        meaning the number 6 digit number should have 6 different character numbers that make it up.
//        Print the number.
package Loops;

import java.util.Random;
import java.util.Scanner;

public class RandomUnique {
    public static void main(String[] args) {
        Random random= new Random();

        String num="";




            for(int i=0; i < 6; i++) {
                int ranNum = random.nextInt(10);
//            if(number.contains(ranNum+ "")) {
//                ranNum = random.nextInt(10);
//            }

                while(num.contains(ranNum + "")) {
                    ranNum = random.nextInt(10);
                }
                num+= ranNum;
            }
        System.out.println(num);
    }
}






