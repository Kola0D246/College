import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("""
            Choose shape:
            Enter 0 for triangle
            Enter 1 for rectangle
            Enter 2 for circle
            """);

        int shape = scanner.nextInt();

        switch (shape) {
            case 0:
                System.out.print("Enter base of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                System.out.printf("Area of triangle = %.2f", 0.5*base*height);
                break;

            case 1:
                System.out.print("Enter base of rectangle: ");
                base = scanner.nextDouble();
                System.out.print("Enter height of rectangle: ");
                height = scanner.nextDouble();
                System.out.printf("Area of rectangle = %.2f", (base*height));
                break;

            case 2:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                System.out.printf("Area of circle = %.2f", Math.PI*radius*radius);
                break;

            default:
                System.out.print("Incorrect value for shape");
        }

        scanner.close();
    }
}
