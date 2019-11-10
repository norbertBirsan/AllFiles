
//Given an String, n , perform the following conditional actions:
//        If  n contains a and length less than 5, print A Perfect,
//        If n contains b, a and length between 7 and 10 (both inclusive) print B Perfect,
//        if not between range and not included a then print Perfect,
//        if a included and not between the range, print empty (System.out.println("");
//        If none of them the print Sorry
import java.util.Scanner;

public class Assignments {



        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter:");
            String n = scanner.next();
            boolean c1 = n.contains("a");
            boolean c2 = n.contains("b");


            // Your code here
            //------------------------------------------------
            if(c1 && c2 && n.length() >=7&& n.length()<=10){
                System.out.println("B Perfect");


            }else if(c1 && n.length() <5){
                System.out.println("A Perfect");


            }else if(c1){
                System.out.println("");

            }else if(c2){
                System.out.println("Perfect");

            }else{
                System.out.println("Sorry");
            }
        }
}
