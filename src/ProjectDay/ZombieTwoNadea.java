package ProjectDay;
import java.util.*;
public class ZombieTwoNadea {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] original = new int[8];


        for (int i = 0; i < original.length; i++) {
            original[i] = input.nextInt();
        }
        int day = 0;
        System.out.println("Day " + day + Arrays.toString(original));
        int copy[] = Arrays.copyOf(original, original.length);
        //TODO. Write you code below this line.
        int sum = 0;

        do {
            sum = 0;
            day++;
            for (int i = 0; i < original.length; i++) {

                if (original[i] == 0 && i != 0 && i != original.length - 1) {
                    copy[i + 1] = original[i + 1] / 2;
                    copy[i - 1] = original[i - 1] / 2;
                }
                if (original[i] == 0 && i == 0) {
                    copy[i + 1] = original[i + 1] / 2;
                }
                if (original[i] == 0 && i == original.length - 1) {
                    copy[i - 1] = original[i - 1] / 2;
                }

            }

            for (int i = 0; i < original.length; i++) {
                original[i] = copy[i];
                sum += original[i];
            }

            System.out.println("Day " + day + Arrays.toString(original));

        } while (sum != 0);

    }
}

