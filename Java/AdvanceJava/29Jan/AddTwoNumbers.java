// Demo Class

import java.util.Scanner;

class AddTwoNumbers {
    int num1, num2, sum;

    void readNumbers() {
        //Input two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        num2 = sc.nextInt();
    }

    void add() {
        // Add numbers
        sum = num1 + num2;
    }

    void display() {
        //Print number
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();    // Create object
        obj.readNumbers();
        obj.add();
        obj.display();
    }
}