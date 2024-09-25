package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    // Logger setup using Log4j
    private static final Logger logger = LogManager.getLogger(Main.class);

    // Square root function (√x)
    public static double squareRoot(double x) {
        logger.info("Operation: Square root - Start");
        if (x < 0) {
            logger.warn("Operation: Square root, Invalid input: Square root of negative number.");
            throw new IllegalArgumentException("Square root of negative number is not defined.");
        }
        double result = Math.sqrt(x);
        logger.info("Operation: Square root, Input: " + x + ", Result: " + result);
        logger.info("Operation: Square root - End");
        return result;
    }

    // Factorial function (x!)
    public static long factorial(int x) {
        logger.info("Operation: Factorial - Start");
        if (x < 0) {
            logger.warn("Operation: Factorial, Invalid input: Factorial of negative number.");
            throw new IllegalArgumentException("Factorial of negative number is not defined.");
        }
        long fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        logger.info("Operation: Factorial, Input: " + x + ", Result: " + fact);
        logger.info("Operation: Factorial - End");
        return fact;
    }

    // Natural logarithm function (ln(x))
    public static double naturalLogarithm(double x) {
        logger.info("Operation: Natural logarithm - Start");
        if (x <= 0) {
            logger.warn("Operation: Natural logarithm, Invalid input: Natural logarithm of non-positive number.");
            throw new IllegalArgumentException("Natural logarithm is only defined for positive numbers.");
        }
        double result = Math.log(x);
        logger.info("Operation: Natural logarithm, Input: " + x + ", Result: " + result);
        logger.info("Operation: Natural logarithm - End");
        return result;
    }

    // Power function (x^y)
    public static double power(double x, double y) {
        logger.info("Operation: Power - Start");
        double result = Math.pow(x, y);
        logger.info("Operation: Power, Base: " + x + ", Exponent: " + y + ", Result: " + result);
        logger.info("Operation: Power - End");
        return result;
    }

    public static void main(String[] args) {
        logger.info("Start of Execution");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1: Square root (√x)");
        System.out.println("2: Factorial (x!)");
        System.out.println("3: Natural logarithm (ln(x))");
        System.out.println("4: Power (x^y)");
        System.out.println("Press any other key to exit from the app");

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
                logger.warn("Invalid choice entered.");
                System.out.println("Invalid choice! Please select a valid operation.");
                break;
        }

        scanner.close();
        logger.info("End of Execution");
    }
}
