import java.util.Scanner;

public class BinaryNum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num, bit;
        String binary="";
        boolean isNeg=false;
        
        System.out.print("Enter a positive integer:");
        num = scanner.nextInt();

        if (num==0) {
            System.out.println("Binary = 0");
        }
        if (num<0) {
            num*=-1;
            isNeg = true;
        }

        while (num != 0) {
            binary = num%2 + binary;
            num /= 2;
        }

        if (isNeg) {
            binary ='1' + binary;
        }

        System.out.printf("Binary = %s", binary);
        scanner.close();
    }
}

// make for negative number
