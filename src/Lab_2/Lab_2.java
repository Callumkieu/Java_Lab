// Lab_2.1
package Lab_2;

import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your Height: ");
        float clientHeight = scanner.nextFloat();
        System.out.print("Please input your weight: ");
        float clientWeight = scanner.nextFloat();

        float BMI = clientWeight / (clientHeight * 2);
        System.out.printf("Your BMI: " + BMI ) ;

        if (BMI < 18.5){
            System.out.println("\nYour BMI is Underweight");
            System.out.println("\nYou need to increase your weight");
        }
        else if (BMI < 25)  {
            System.out.println("\nYour BMI is Normal weight");
        }
        else if (BMI < 30) {
            System.out.println("\nYour BMI is Over weight");
            System.out.println("\nYou need to increase your weight");
        }
        else {
            System.out.println("\nYour BMI is Obesity");
            System.out.println("\nYou need to increase your weight");
        }

    }
}
