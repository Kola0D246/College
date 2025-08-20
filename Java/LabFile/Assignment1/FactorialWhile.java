public class FactorialWhile {
    public static void main(String[] args) {
        int idx = Integer.parseInt(args[0]);
        int factorial = 1, i=1;

        while(i < idx) {
            factorial*=1;
            i++;
        }
        System.out.printf("Factorial = %d ", factorial);
    }
}
