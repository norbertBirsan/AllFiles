//Given the String:
//        "Write a program that creates a group of given size thisisabigword”
//        Find the biggest word in your String and print it.
//


        package Arrays;

public class ThisIsBigWord {
    ;

    public static void main(String[] args) {
        String s = "Write a program that creates a group of given size thisisabigword";
        String[] word = s.trim().split(" ");
        String rts = " ";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= rts.length()) {
                rts = word[i];
            }
        }
        System.out.println(rts);
        System.out.println(rts.length());
    }
}
//}
//    String str = "write a program that creates a group of given size thisisabigword";
//    String [] arr = str.trim().split(" ");
//    int biggestLength = 0;
//    String biggestWord = "";
//        for(String word : arr) {
//                if(word.length() > biggestLength) {
//                biggestLength = word.length();
//                biggestWord = word;
//                }
//                }
//                System.out.println(biggestWord);
//        for(String word: arr) {
//            if(word.length() == biggestLength) {
//                System.out.println(word);
//            }
//        }
