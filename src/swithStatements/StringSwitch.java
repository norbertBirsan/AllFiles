package swithStatements;

public class StringSwitch {
    public static void main(String[] args) {

        String fruit = "choco";

        switch (fruit ) {
            case "oranges":
                System.out.println("Oranges are sweet");
                break;
            case "banana":
            case "apple":
                System.out.println("My favorite");
                break;
            default:
            System.out.println("Not a fruit");

        }
    }
}
