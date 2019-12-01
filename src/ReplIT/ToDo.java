package ReplIT;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class ToDo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maxNumber = 6;
        int previousNumber=0;
        int nextNumber = 1;
        String result = "";


        for(int i = 0; i<maxNumber; i++) {



            result = result + previousNumber + " ";
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;


        }
        System.out.println("Fibonacci Series of 6 : "+result);
    }
}
