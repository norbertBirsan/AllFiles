//Given a String array with value of:
//        "Bread", "cucumber", "Apples", "Orange", "cookies", “Cake"
//        Print out how many of the words begin with uppercase letters
package Arrays;

public class UpperCaseLetters {
    public static void main(String[] args) {
        String [] items={"Bread","cucumber","Apples","Orange","cookies","Cake"};
        int count=0;
        for(String item:items){

            char start=item.charAt(0);
            //if(Character.isUpperCase(start)){
            if(Character.isUpperCase(start)){
                count++;
                System.out.println(item);
            }

        }
    }

    }

