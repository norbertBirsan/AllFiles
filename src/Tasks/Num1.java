//Here are additional examples to illustrate the differences between the prefix form of ++ (or ——) and the postfix form of ++ (or −−). Consider the following code:
//        int i = 10;
//        int newNum = 10 * i++;
//        System.out.print("i is " + i + ", newNum is " + newNum);
//        Same effect as
//        int newNum = 10 * i;
//        i = i + 1;
//        i is 11, newNum is 100
//        In this case, i is incremented by 1, then the old value of i is used in the multiplication. So
//        newNum becomes 100. If i++ is replaced by ++i as follows,
//        i is 11, newNum is 110
//        int i = 10;
//        int newNum = 10 * (++i);
//        System.out.print("i is " + i + ", newNum is " + newNum);
//        Same effect as i = i + 1;
//        int newNum = 10 * i;
//        i is incremented by 1, and the new value of i is used in the multiplication. Thus newNum
//        becomes 110.
//        Here is another example:
//        double x = 1.0;
//        double y = 5.0;
//        double z = x–– + (++y);
//        After all three lines are executed, y becomes 6.0, z becomes 7.0, and x becomes 0.0
package Tasks;

public class Num1 {
    public static void main(String[] args) {
        
    }

}
