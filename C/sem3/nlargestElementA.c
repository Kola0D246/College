// Write a program to find out nth largest element in given list of numbers
#include <stdio.h>
#include <limits.h>

int main(){
    int arr[] = {1, 5, 5, 4, 3, 2, 7};
    int len = sizeof(arr)/sizeof(arr[0]);
    int n = 3, idx_max;

    for (int j=0; j<n; j++){
        idx_max = 0;        // assume that largest number is at index 0 to start the logic
        for (int i=1; i<len; i++) {
            if (arr[i] == arr[idx_max]) {
                arr[idx_max]=INT_MIN;
            }
            if (arr[i] > arr[idx_max]) {
                idx_max=i;
            }
        }
        
        if (j+1 != n) {
            arr[idx_max]=INT_MIN;
        }
    }
    printf("The third largest number is %d", arr[idx_max]);
}

// improve this code for various test cases