public class SumofDigits {
    public static void main(String[] args) {
        int num=1358, _num = num, sum=0, dig;
        while (num !=0) {
            dig = num % 10;
            num = num / 10;
            sum += dig;
        }
        System.out.printf("Sum of all digits of %d = %d", _num, sum);
    }
}
