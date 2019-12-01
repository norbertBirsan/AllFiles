package CodingBat;

import java.util.*;

public class Warmup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
       String str = scanner.nextLine();

        int n = scanner.nextInt();
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;  // could use += here
        }
        System.out.println(result);
        }}


