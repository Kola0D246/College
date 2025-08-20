public class FactorialFor {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial*=i;
        }
        System.out.printf("Factorial = %d ", factorial);
    }
}
