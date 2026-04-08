#include <stdio.h>

int binarySearch(int a[], int low, int high, int key) {
    if(low > high)
        return -1;

    int mid = (low + high)/2;
    if(a[mid] == key)
        return mid;
    else if(a[mid] < key)
        return binarySearch(a, mid + 1, high, key);
    else
        return binarySearch(a, low, mid - 1, key);
}

int main() {
    int n=5, key, result;
    int a[] = {10, 20, 30, 40, 50};

    printf("Enter element to search: ");
    scanf("%d", &key);

    result = binarySearch(a, 0, n - 1, key);
    if(result != -1)
        printf("Element found at position %d\n", result + 1);
    else
        printf("Element not found\n");

    return 0;
}
