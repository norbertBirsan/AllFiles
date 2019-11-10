package CodingBat;

import java.util.Scanner;

public class HelloName {
    public String makeTags(String tag, String word) {
    String result= String.format("<%s>%s</%s>",tag,word,tag);
    return result;
    }
}

//    Given an "out" string length 4, such as "<<>>",
//        and a word, return a new string where the word is in the middle
//        of the out string, e.g. "<<word>>".
//        Note: use str.substring(i, j) to extract the String starting at index i and
//        going up to but not including index j.