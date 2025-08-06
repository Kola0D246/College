public class EvenOdd {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num%2 == 0) {
            System.out.printf("%d is a Even number",num);
        }
        else {
            System.out.printf("%d is a Odd number",num);
        }
    }
}
