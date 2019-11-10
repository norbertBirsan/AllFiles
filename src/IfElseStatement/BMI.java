//4) BMI: Program will ask user to enter their mass (pounds) and their height (feet). Calculate their BMI and then print the appropriate message based on the provided values:
// —> BMI Formula: BMI = mass / height^2
// —> Values:
// Less than 18.5 — Underweight
// From 18.5 to 25 — Normal weight
// From 25 to 30 — Overweight
// More than or equal to 30 — Obese
package IfElseStatement;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter weight");
        double weight = input.nextDouble();

        System.out.println("please enter height");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");

        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("overweight");

        } else{
            System.out.println("obese");
        }
    }
}
