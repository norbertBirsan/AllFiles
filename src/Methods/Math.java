package Methods;

public class Math {
    public static void main(String[] args) {

    }
    public static double calculator(String op, double one,double two){
        switch (op){
            case"+":
                return one=two;
            case"-":
                return one-two;

            case"*":
                return one*two;

            case"/":
                return one/two;

            case"%":
                return one%two;
            default:
                System.out.println("invalid operator");
                return 0;

        }
    }
}
