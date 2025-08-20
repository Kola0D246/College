public class FactorialWhile {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int factorial = 1, i=1;

        while(i <= num) {
            factorial*=i;
            i++;
        }
        System.out.printf("Factorial = %d ", factorial);
    }
}
