public class SqRoot {
    static int[] pairs(int num, int len, boolean fractional){
        int[] arr = new int[len];
        for (int i=len-1; i>=0; i--) {
            arr[i] = num%100;
            num /= 100; 
        }
        return arr;
    }
    public static void main(String[] args) {
        double num = Double.parseDouble(args[0]);
        
    }
}
