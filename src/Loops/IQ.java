//[IQ] Write a program that prints every single number from 0 - 50. Skip the numbers that ends with 3.
//        3,13,23,33,43
package Loops;

public class IQ {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 10 == 3) {
                continue;
            }
            System.out.println(i);

        }
    }
}
//or
//for(int i=0; i <= 50; i++) {
//        String temp = i + "";
//        if(temp.endsWith("3")) {
//        continue;
//        }
//        System.out.println(i);
//        }
//        }
//        }
