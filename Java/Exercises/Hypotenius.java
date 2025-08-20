// Find hypotenius of a right triangle by its base and height taken from user input
import java.util.Scanner;

public class Hypotenius {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        double hypo, hght, base;

        System.out.println("To find hypotenius of right triangle...");
        System.out.print("Enter its base: "); base = scan.nextDouble();
        System.out.print("Enter its height: "); hght = scan.nextDouble();

        hypo = Math.sqrt(Math.pow(base, 2) + Math.pow(hght, 2));
        System.out.print("Hypotenius = " + hypo); 

        scan.close();
    }
}
