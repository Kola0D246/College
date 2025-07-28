// Write a program to reverse the elements of given array without creating array

public class ReverseArray {
    public static void main (String args[]){
        int arr[] = {2,5,3,7,4,1}, len= arr.length;

        // Reverse the array
        for (int i=0; i<len/2; i++) {
            int temp = arr[len-i-1];
            arr[len-i-1] = arr[i];
            arr[i] = temp;
        }

        // Print the reversed array
        System.out.print("Reversed array: [");
        for (int i=0; i<len; i++) {
            System.out.printf("%d", arr[i]);
            if (i<len-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
