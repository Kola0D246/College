public class RecursiveSum {
    static int digitSum(int num) {
        int sum = 0;
        while (num >= 1) {
            int dig = num % 10;
            sum += dig;
            num /= 10;
        }
        if (sum >= 10) {
            sum = digitSum(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int rSum = digitSum(num);
        System.out.printf("The recursive sum of %d is %d", num, rSum);
    }
}
