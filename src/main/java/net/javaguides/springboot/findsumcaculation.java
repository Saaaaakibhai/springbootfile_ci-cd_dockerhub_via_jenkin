package net.javaguides.springboot;
import java.util.Scanner;

public class findsumcaculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Get first number from user
        System.out.print("Enter the first odd number: ");
        int num1 = scanner.nextInt();

        // Get second number from user
        System.out.print("Enter the second odd number: ");
        int num2 = scanner.nextInt();

        // Check if both numbers are odd
        if (num1 % 2 != 0 && num2 % 2 != 0) {
            int sum = num1 + num2;
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

            // Check if the result is even
            if (sum % 2 == 0) {
                System.out.println("The sum is even.");
            } else {
                System.out.println("The sum is odd (unexpected).");
            }
        } else {
            System.out.println("One or both numbers are not odd. Please enter odd numbers only.");
        }

        scanner.close();
	}

}
