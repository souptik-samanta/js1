import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1) Factors of the number");
        System.out.println("2) Factorial of the number");
        System.out.println("3) Square root of the number");
        System.out.println("4) Is it a part of the Fibonacci series?");
        System.out.println("5) Is it a unique number (divided by 7 = any multiple of 96)?");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Factors of " + number + " are:");
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            case 2:
                System.out.println("Factorial of " + number + " is " + factorial(number));
                break;
            case 3:
                System.out.println("Square root of " + number + " is " + Math.sqrt(number));
                break;
            case 4:
                if (isFibonacci(number)) {
                    System.out.println(number + " is a part of the Fibonacci series.");
                } else {
                    System.out.println(number + " is not a part of the Fibonacci series.");
                }
                break;
            case 5:
                if (isUniqueNumber(number)) {
                    System.out.println(number + " is a unique number.");
                } else {
                    System.out.println(number + " is not a unique number.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Method to calculate factorial
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Method to check if a number is part of the Fibonacci series
    public static boolean isFibonacci(int n) {
        int a = 0;
        int b = 1;
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == n || n == 0;
    }

    // Method to check if a number is unique (divided by 7 = any multiple of 96)
    public static boolean isUniqueNumber(int n) {
        return (n % 7 == 0) && ((n / 7) % 96 == 0);
    }
}
