public class FibonacciWhile {
    public static void main(String[] args) {
        int idx = Integer.parseInt(args[0]);
        int num1 = 0, num2 = 1, temp, i=1;

        System.out.printf("Fibonacci sequence upto index %d:\n", idx);
        System.out.printf("%d %d ", num1, num2);

        while (i < idx) {
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.printf("%d ", temp);
            i++;
        }
    }
}
