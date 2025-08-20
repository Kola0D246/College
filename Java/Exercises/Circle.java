// Given radius as user input, calculate circumference, area for a circle and surface area, volume for a sphere

import java.util.Scanner;

public class Circle {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        double rad, circum, area, surArea, volm;
        System.out.print("Enter the radius: "); rad = scan.nextDouble();

        area = Math.PI * Math.pow(rad, 2);
        circum = 2 * Math.PI * rad;
        volm = (4.0/3) * Math.PI * Math.pow(rad, 3);
        surArea = 4 * Math.PI * Math.pow(rad, 2);

        System.out.printf("For a circle...\n");
        System.out.printf("Area = %.2f\n", area);
        System.out.printf("Circumference = %.2f\n", circum);
        System.out.printf("For a sphere...\n");
        System.out.printf("Volume = %.2f\n", volm);
        System.out.printf("Surface Area = %.2f\n", surArea);
    }
}
