package Avatar;

import java.util.Scanner;

public class StringMiddle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        if (str.length() % 2 == 1) {

            str.toLowerCase();

            int mid = str.length() / 2;
            String firstpart = str.substring(0, mid);
            String middle = str.charAt(mid) + "";
            middle = middle.toUpperCase();
            String lastpart = str.substring(mid + 1);

            System.out.println(firstpart + middle + lastpart);

        } else {
            str = str.toLowerCase();
            int mid = str.length() / 2;
            String firstpart = str.substring(0, mid - 1);
            String middle = str.substring(mid - 1, mid + 1).toUpperCase();
            String secondPart = str.substring(mid + 1);


            System.out.println(firstpart + middle + secondPart);


        }

    }
}
