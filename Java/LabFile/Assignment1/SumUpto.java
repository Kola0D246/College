public class SumUpto {
    public static void main(String args[]) {
        int sum=0, end=Integer.parseInt(args[0]);
        for (int i=0; i<=end; i++) {
            sum+=i;
        }
        System.out.printf("%d", sum);
    }
}
