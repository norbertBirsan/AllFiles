package wrapperclasses;

import MultiDimensionalArrays.Random;

public class NumberChecker {
    public static void main(String[] args) {
        MagicNumber magicNumber = new MagicNumber();
        //magicNumber.gerateNumber(7);
        magicNumber.generateEvens(8);
        System.out.println(magicNumber.numbers);

        magicNumber.generateEvens(8);
        System.out.println(magicNumber.numbers);
    }
}

