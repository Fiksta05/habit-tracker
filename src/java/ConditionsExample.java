

import java.util.Scanner;

public class ConditionsExample {

    public static void main(String[] args) {

    // Scanner
    Scanner scanner = new Scanner(System.in);

    // Ask user for their age
    System.out.print("Enter your age please");
    int age = scanner.nextInt();




        // Check if age is 18 or more

        if (age >= 18) {

            // This block runs if the condition is true

            System.out.println("You are an adult.");

        }

        // Else if age is between 13 and 17

        else if (age >= 13) {

            System.out.println("You are a teenager.");

        }

        // If all above conditions fail

        else {

            System.out.println("You are a child.");

        }

        scanner.close();

    }

}







}