import java.util.Scanner;

public class ThirdLargest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create array
        System.out.print("Number of elements in array:");
        int len = scanner.nextInt();
        int[] arr = new int[len];

        for (int i=0; i<len; i++) {
            System.out.printf("%d:", i);
            arr[i] = scanner.nextInt();
        }

        // Find 3rd largest number
        boolean contIntMin = false;
        int first, second, third; 
        first = second = third = Integer.MIN_VALUE;
        for (int num: arr) {
            if (num == Integer.MIN_VALUE){
                contIntMin = true;
                continue;
            }

            if (num > first){
                third = second;
                second = first;
                first = num;
            }
            else if (num > second && num != first) {
                third = second;
                second = num;
            }
            else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        if (!contIntMin && third == Integer.MIN_VALUE) {
            System.out.println("There are no three different integers given for comparison");
        }
        else {
            System.out.printf("Third largest num = %d", third);
        }

        scanner.close();
    }
}
