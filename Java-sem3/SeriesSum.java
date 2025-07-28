public class SeriesSum {
    public static void main(String args[]) {
        int start=0, end=20, sum=0;
        for (int i=start; i<=end; i++) {
            sum+=i;
        }
        System.out.printf("%d", sum);
    }
}
