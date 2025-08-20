// Import Scanner class from util library of Java
import java.util.Scanner;

// Create Java class and declare main() method
public class AreaRectangle {
    public static void main(String[] arg) {
        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Input length and breadth of rectangle
        System.out.print("Enter length of rectangle (in meter): ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of rectangle (in meter): ");
        double breadth = scanner.nextDouble();

        // Output the area on console
        System.out.print("Area of rectangle is " + length*breadth + " m²");
        // To write 2 in superscript -> keep numberLock ON, hold Alt key and type 0178 on number pad

        // Close the scanner object
        scanner.close();
    }
}
