import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            System.out.println("Hi, I am a Calculator!");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            char operation = sc.next().charAt(0);

            if (operation == '+') {
                System.out.println("Result: " + (num1 + num2));
            } else if (operation == '-') {
                System.out.println("Result: " + (num1 - num2));
            } else if (operation == '*') {
                System.out.println("Result: " + (num1 * num2));
            } else if (operation == '/') {
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            } else {
                System.out.println("Invalid operation.");
            }
            sc.close();
        }
}