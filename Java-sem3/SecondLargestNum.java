public class SecondLargestNum {
    public static void main(String args[]) {
        int arr[] = {1,5,3,6,22,64,22,44,2,5};
        int a = arr[0], b = 0;

        for (int i=1; i<arr.length; i++){
            if (arr[i] > a){
                b = a;
                a = arr[i];
            }
        }
        System.out.printf("%d is the second largest number", b);
    }
}
