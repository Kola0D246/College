public class FibonacciFor {
    public static void main(String[] args) {
        int idx = Integer.parseInt(args[0]);
        int num1 = 0, num2 = 1, temp;

        System.out.printf("Fibonacci sequence upto index %d:\n", idx);
        System.out.printf("%d %d ", num1, num2);

        for (int i=1; i<idx; i++) {
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.printf("%d ", temp);
        }
    }
}
