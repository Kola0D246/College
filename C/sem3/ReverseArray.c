// Write a program to reverse the elements of given array without creating array
#include <stdio.h.>

int main (){
    int arr[6] = {2,5,3,7,4,1};
    int len = sizeof(arr)/sizeof(arr[0]);

    // Reverse the array
    for (int i=0; i<len/2; i++) {
        int temp = arr[len-i-1];
        arr[len-i-1] = arr[i];
        arr[i] = temp;
    }

    // Print the reversed array
    printf("Reversed array: [");
    for (int i=0; i<len; i++) {
        printf("%d", arr[i]);
        if (i<len-1) {
            printf(",");
        }
    }
    printf("]");
    return 0;
}