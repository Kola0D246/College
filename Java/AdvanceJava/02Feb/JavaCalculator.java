// Write a java calculator program that adds, subtracts, and multiplies two integers given by the user, while clearly demonstrating Access Specifiers: public, private, and protected.

import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc c = new Calc();

        System.out.print("Enter num1: ");
        int a = sc.nextInt();

        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("\nAddition: " + c.accessAdition(a, b));
        System.out.println("Subtration: " + c.sub(a, b));
        System.out.println("Multiply: " + c.multiply(a, b));
    }
}

class Calc{
    private int add(int a, int b) {                 // private class, only accessible from within the class
        return a + b;
    }

    protected int sub(int a, int b) {               // protected method accessible in inherited class
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int accessAdition(int a, int b) {
        return add(a, b);

    }
}

