//[IQ] Palindrome: A word that is the same read forwards and backwards. User takes a word from the console.
//  Print true if the word is a palindrome. Print false if the word is not palindrome.
//        > input: civic
//        > output: true
package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter word");
        String word= input.nextLine();
        System.out.println("Input a number");
        int num = input.nextInt();
        System.out.println(isPalindromeString(word));
        System.out.println(isPalindromeNum(num));
    }

    public static  Boolean isPalindromeString(String str){
        if(str.isEmpty() || str == null) return false;
        str = str.toLowerCase().replace(" ", "");
        if(str.length() == 1 || str.length() == 2 && str.charAt(0) == str.charAt(1)) return true;
        return str.charAt(0) == str.charAt(str.length()-1) ? isPalindromeString(str.substring(1, str.length()-1)) : false;
    }

    public static int reverseNum(int num){
        if(num/10 == 0) return num;
        int tens = 1;
        int tempNum = num;
        while(tempNum / 10 > 0){
            tens *= 10;
            tempNum /= 10;
        }
        return ((num % 10) * tens) + reverseNum(num /= 10);
    }

    public static boolean isPalindromeNum(int num){
        if(num / 10 == 0) return true;
        if(num / 100 == 0){
           return num /10 == num % 10 ?  true :  false;
        }
        int tens = 1;
        int tempNum = num;
        while(tempNum / 10 > 0){
            tens *= 10;
            tempNum /= 10;
        }
        return num / tens == num % 10 ? isPalindromeNum((num % tens)  / 10) : false;
    }
}
