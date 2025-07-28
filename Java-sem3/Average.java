// average and sum of n numbers enter from cmd line arguments

public class Average {
    public static void main(String args[]) {
        int sum=0;
        for (String arg: args) {
            sum += Integer.parseInt(arg);
        }
        System.out.printf("Sum = %d", sum);
        System.out.printf("Average = %d", sum/args.length);
    }
}
