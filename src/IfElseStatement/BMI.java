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
        Scanner s = new Scanner(System.in);
        System.out.println("ask how heavy you are!!");
        double pounds = s.nextDouble();
        s.nextLine();
        System.out.println("ask how long your neck is");
        double height = s.nextDouble();

        double bmi = pounds / (height * height);

        if (!(bmi >= 30)) {
            if (bmi == 18.5) {
                System.out.println("you hungry?i will give you food bro");
            } else if (bmi >= 18.5 && bmi <= 25) {
                System.out.println("keep doing what you do but belly still there bro...do some sit ups");

            } else if (bmi > 25 && bmi < 30) {
                System.out.println("brooo...i told you...go to gym man");


            } else {
                System.out.println("go to gym habibi");
            }
        }
    }
}
