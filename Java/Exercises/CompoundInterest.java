import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int years, frequency;
        double principle, amount, interest, rate;

        System.out.print("Enter Principle amount: "); principle = scan.nextDouble();
        System.out.print("Enter rate of interest (%): "); rate = scan.nextDouble()/100;
        System.out.print("Enter time period (years): "); years = scan.nextInt();
        System.out.print("Enter no of times interest calculated annualy: "); frequency = scan.nextInt();

        amount = principle * Math.pow((1 + rate/frequency), (years * frequency));
        interest = amount - principle;

        System.out.printf("Interest Applied: %.2f\n", interest);
        System.out.printf("Total payable amount: %.2f\n", amount);

        scan.close();
    }
}
