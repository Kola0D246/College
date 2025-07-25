// Write a program to find out nth largest element in given list of numbers
// Write this program properly with new logic

public class nLargest {
    public static void main(String[] args) {
        // Given array
    int arr[] = {1, 5, 5};

    // get value of n and if n > len of arr, throw error
    int n = 3, hasIM=1;
    if (n>arr.length || n<0) {
        System.out.printf("VALUEERROR: n cannot be more than size of array %d or less than 0", len);
        return 1;
    }

    // create a n length array and initialize with MIN_INT
    int lrg[n];
    for (int i=0;i<n;i++){
        lrg[i]= Integer.MIN_VALUE;
    }

    // Loop over arr[], take each element and place the largest 3 element in lrg[] in sorted manner using insert function
    for (int i=0; i<arr.length; i++) {     // loop over arr
        for (int j=0; j<n; j++){    // loop over lrg
            if (arr[i]== lrg[j]) {  // if element of arr already present in lrg, break the smaller loop and goes to next element in arr
                break;
            }
            if (arr[i] > lrg[j]) {  // check if the element of arr is larger than any element in 
                insert(arr[i], j, lrg, n);   // insert arr[i] at index j in lrg because its greater then lrg[j]. n is size of lrg.
                break;              // once element is placed in lrg, breaks the smaller loop and goes to next element in arr
            }
        }
        if (Integer.MIN_VALUE == arr[i]) {    // Check if arr contain INT_MIN as element
            hasIM = 0;    //True
        }
    }
    if (lrg[n-1] == Integer.MIN_VALUE && hasIM != 0){     // if last element of lrg is INT_MIN (initialized value) but INT_MIN is not in arr, it means we not have 3 different element in arr. So raise error
        System.out.printf("ValueError! Need atleast 3 different numbers");
    }
    else {
        System.out.printf("The third largest number is %d", lrg[n-1]);
    }
    }
}
