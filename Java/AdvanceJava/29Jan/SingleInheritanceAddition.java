import java.util.Scanner;

// Child Class: Performs addition
public class SingleInheritanceAddition extends InputNumbers {
    void add() {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        SingleInheritanceAddition obj = new SingleInheritanceAddition();

        obj.getInput(); // Parent class method
        obj.add();      // Child class method
    }
}

// Parent Class: Takes input from user
class InputNumbers {
    int a, b;
    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }
}