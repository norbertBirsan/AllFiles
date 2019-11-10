package IntroToJavaPractice;

import java.util.Scanner;

public class Versuch {  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int change ,quarter,dime, nickle,penny;


    System.out.println("put your change : ");
    change = input.nextInt();//68

    quarter = change /25 ; //68/25=2.72 >> 2
    dime = (change - (quarter*25))/10;//(68-(2*25))/10=1.8
    nickle =(change - ((quarter*25) +(dime*10)))/5;//(68-((2*25)+(1*10)))/5=  (68-(50+10))= 68-60=8/5=1
    penny   = change -((quarter*25)+(dime*10)+(nickle*5));
    System.out.println("your change is " + quarter + " quarters and " + dime + " dimes and  " + nickle+ " nickles " + penny+ " penny"  );
}
}


