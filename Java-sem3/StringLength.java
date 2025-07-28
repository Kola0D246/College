import java.util.Scanner;

public class StringLength {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String largest="", arr[] = null;
        
        System.out.print("Enter number of String you want to compare:");
        int N = scanner.nextInt();
        scanner.next();     // buffer

        for (int i=0; i<N; i++) {
            System.out.printf("%d:",i);
            arr[i] = scanner.nextLine();
            if (largest.length() < arr[i].length()) {
                largest = arr[i];
            }
        }

        System.out.printf("Largest String: %s\n", largest);
        scanner.close();
    }
}
