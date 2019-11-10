package ProjectDay;
import java.util.*;
public class ZombieTwoNazar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int countZeros = 8;
        int countDays = 0;

        while(countZeros > 1){
            countZeros = 8;
            System.out.println("Day " +countDays + " " + Arrays.toString(inhabitants));
            for(int i = 0; i < inhabitants.length-1; i++){
                if(inhabitants[i+1] == 0) {
                    inhabitants[i]/=2;
                    countZeros--;
                    continue;
                }
                if(inhabitants[i] == 0) {
                    inhabitants[i+1]/=2;
                    i++;
                    countZeros--;
                }
            }
            countDays++;
        }
        System.out.println("---- EXTINCT ----");
    }
}
