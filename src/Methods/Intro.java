package Methods;

import java.util.Scanner;
import java.util.Stack;

public class Intro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int decimal=in.nextInt();

        String binary="";

        if(decimal<=0)
        {
            System.out.println("Please Enter more than 0");

        }
        else
        {
            while(decimal>0)
            {

                binary=(decimal%2)+binary;
                decimal=decimal/2;

            }
            System.out.println("binary is:"+binary);

        }

    }
        }
