package Methods;
import java.util.*;
public class VarArgs {
    public static void main(String[] args) {
        int[]a={3};
        maxNumber(1,2,4,2,3,4,5,6,12,3);
    }
    public static void maxNumber(int...arr){//can have only one varArgs and needs to be after any other
        //not first and continue with other arrays

        Arrays.sort(arr);
        System.out.println("The biggest number is "+arr[arr.length-1]);
    }
}
