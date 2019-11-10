//You have a temperature in Fahrenheit: 72.5
//        Print out the temperature in celsius
//        Formula: degrees celsius = 5 *(degrees F - 32) / 9
package Variables;

public class OperatorDegrees {
    public static void main(String[] args) {
        double fahrenheit = 72.5;
        System.out.println("Tem in Fahrenheit: " + fahrenheit);
        double celsius = 5 * (fahrenheit - 32) / 9;
        System.out.println("Temp in Celsius: " + celsius);
    }
}
