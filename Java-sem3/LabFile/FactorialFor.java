public class FactorialFor {
    public static void main(String[] args) {
        int idx = Integer.parseInt(args[0]);
        int factorial = 1;

        for (int i = 1; i < idx; i++) {
            factorial*=1;
        }
        System.out.printf("Factorial = %d ", factorial);
    }
}
