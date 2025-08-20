public class SecondLargestNum {
    public static void main(String args[]) {
        int arr[] = {1,5,3,6,22,64,22,44,2,5};
        int first = arr[0], second = Integer.MIN_VALUE;
        boolean contMIN_VALUE = false;

        for (int i=1; i<arr.length; i++){
            if (arr[i] == Integer.MIN_VALUE) {
                contMIN_VALUE = true;
            }

            if (arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (contMIN_VALUE) {
            System.out.printf("%d is the second largest number", second);
        }
        else {
            System.out.printf("No two different number to commpare");
        }
    }
}
