package wrapperclasses;

import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {
    ArrayList<Integer> numbers = new ArrayList<>();

    public void gerateNumber(int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(1000));

        }
    }

    public void generateEvens(int size) {
        Random random = new Random();
        while (true) {
            int i = random.nextInt(100);
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
    }
}