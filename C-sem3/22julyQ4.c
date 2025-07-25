// Write a program to findout minimum and maximum of number from given array using concept of functions
#include <stdio.h.>

int min(int arr[], int len) {
    int min= arr[0];
    for (int i=1; i<len; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

int max(int arr[], int len) {
    int max= arr[0];
    for (int i=1; i<len; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

int main() {
    int arr[] = {1, 5, 4, 3, 2};
    int len = sizeof(arr)/sizeof(arr[0]);
    printf("Max number = %d\n", max(arr, len));
    printf("Min number = %d\n", min(arr, len));
    return 0;
}