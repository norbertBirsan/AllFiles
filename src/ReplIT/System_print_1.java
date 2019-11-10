//Write multiple print statements that will print from 1 to 10 in separate lines.
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
package ReplIT;

import org.w3c.dom.ls.LSOutput;
import java.util.*;
public class System_print_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = "";

        for(int i = str1.length()-1; i >= 0; i--){
            str2=str2 + str1.charAt(i);
        }

        System.out.println("Reverse of " + str1+ " is "+str2);
    }

}
