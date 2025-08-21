import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.print("Choose the operation (+, -, *, /, %):");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.printf("Sum = %.2f\n", num1 + num2);
                break;

            case '-':
                System.out.printf("Diff = %.2f\n", num1 - num2);
                break;

            case '*':
                System.out.printf("Prod = %.2f\n", num1 * num2);
                break;

            case '/':
                System.out.printf("Qout = %.2f\n", num1 / num2);
                break;

            case '%':
                System.out.printf("Rem = %.2f\n", num1 % num2);
                break;

            default:
                System.out.printf("Incorrect operator symbol is given\n");
                break;
        }

        scanner.close();
    }
}