package ProjectDay;
import java.util.*;
public class ZombieOneNadea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int day = 0;
        System.out.println("Day "+ day +(Arrays.toString(inhabitants)));
        //TODO. Write you code below this line.
        int sum;

        do{
            sum =0;
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i]/2;
                sum+=inhabitants[i];

//
            }
            day++;
            System.out.println("Day "+ day +(Arrays.toString(inhabitants)));

        }while(sum!=0);
        System.out.println("---- EXTINCT ----");

    }
}
