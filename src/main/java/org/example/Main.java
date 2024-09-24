package org.example;
import java.util.Scanner;

public class Main {

    // Square root function (√x)
    public static double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of negative number is not defined.");
        }
        return Math.sqrt(x);
    }

    // Factorial function (x!)
    public static long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial of negative number is not defined.");
        }
        long fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    // Natural logarithm function (ln(x))
    public static double naturalLogarithm(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is only defined for positive numbers.");
        }
        return Math.log(x); // Math.log() gives the natural log (base e)
    }

    // Power function (x^y)
    public static double power(double x, double y) {
        return Math.pow(x, y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1: Square root (√x)");
        System.out.println("2: Factorial (x!)");
        System.out.println("3: Natural logarithm (ln(x))");
        System.out.println("4: Power (x^y)");
        System.out.println("Press any other key to exit!!");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Square root
                System.out.print("Enter a number to find the square root: ");
                double sqrtInput = scanner.nextDouble();
                double sqrtResult = squareRoot(sqrtInput);
                System.out.println("Square root of " + sqrtInput + " is: " + sqrtResult);
                break;

            case 2: // Factorial
                System.out.print("Enter an integer to find its factorial: ");
                int factorialInput = scanner.nextInt();
                long factorialResult = factorial(factorialInput);
                System.out.println("Factorial of " + factorialInput + " is: " + factorialResult);
                break;

            case 3: // Natural logarithm
                System.out.print("Enter a number to find its natural logarithm: ");
                double lnInput = scanner.nextDouble();
                double lnResult = naturalLogarithm(lnInput);
                System.out.println("Natural logarithm of " + lnInput + " is: " + lnResult);
                break;

            case 4: // Power
                System.out.print("Enter the base number (x): ");
                double base = scanner.nextDouble();
                System.out.print("Enter the exponent (y): ");
                double exponent = scanner.nextDouble();
                double powerResult = power(base, exponent);
                System.out.println(base + " raised to the power of " + exponent + " is: " + powerResult);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                break;
        }

        scanner.close();
    }
}
