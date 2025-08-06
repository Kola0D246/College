public class PositiveNegative {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num<0) {
            System.out.printf("%d is negative number", num);
        }
        else if (num>0) {
            System.out.printf("%d is positive number", num);
        }
        else {
            System.out.printf("%d is zero", num);
        }
    }
}
