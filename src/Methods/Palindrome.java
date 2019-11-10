package Methods;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeRev("civic"));
    }
    //you can do it this way (2nd way):
    public static boolean isPalindromeArr(String str) {
        char [] arr = str.toLowerCase().toCharArray();
        for (int i=0; i<arr.length/2; i++) {        //so, we check till the middle
            if (arr[i] != arr[arr.length-1 - i]) {
                return false;                        //by doing != and return false, you check the negative scenario
                //if you had == and return true, when you check the first letter and the last letter and if it's true,
                //it will return true and does not matter what you have in the middle
                //by doing =!, you check every character, and if one of them is false-->you will get false
            }
        }
        return true;
    }
    /*
    Create a method that will take a String as a parameter and return if the String is palindrome or not.
     */
    //you can do it this way (1st way):
    public static boolean isPalindromeRev (String str) {
        if (Reverse.reverseString(str).equals(str)) {     //here, you are calling the method that you created;
            //Reverse <--name of class
            //reverseString() <--name of the method
            return true;
        }
        else {
            return false;
        }


    }
}
