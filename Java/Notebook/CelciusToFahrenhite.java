// Calculate temperature in Fahrenhite from temperature argumented from cmd line in Celcius

public class CelciusToFahrenhite {
    public static void main(String args[]) {
        // check unit
        if (args[1].isEmpty()) {
            System.out.println("No unit given. Give value in Celcius(C)");
        }
        else if (!args[1].equals("C")) {
            System.out.println("Incorrect unit given. Give value in Celcius(C)");
        }

        // conversion
        else {
            double fahr = (9.0/5.0)*Double.parseDouble(args[0]) + 32.0;
            System.out.printf("%.2f F", fahr);
        }
    }
}
