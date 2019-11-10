package ProjectDay;
import java.util.*;
public class ZombieOneIryna {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] inhabitants = new int[8];
            for(int i=0; i<inhabitants.length; i++) {
                inhabitants[i] = input.nextInt();
            }

            //TODO. Write you code below this line.
            int day = 0;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            int max = inhabitants[0];
            for (int num: inhabitants){
                if(max < num) {
                    max = num;
                }
            }
            int count = 0;
            do {
                max = max/2;
                count++;
            } while (max > 0);
            outer: for(int i = 0; i < count; i++) {
                day++;
                inner: for(int  j = 0; j < inhabitants.length; j++){
                    inhabitants[j] = inhabitants[j]/2;
                }
                System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            }
            System.out.println("---- EXTINCT ----");


        }
    }


