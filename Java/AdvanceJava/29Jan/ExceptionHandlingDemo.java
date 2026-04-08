public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        try {                     // Arithmetic Exception
            int a = 10;
            int b = 0;
            int result = a / b;   // Error occurs here

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception Caught: Division by zero is not allowed");
        }
        finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("Program continues after exception handling");
    }
}