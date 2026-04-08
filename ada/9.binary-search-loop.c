#include <stdio.h>

int main() {
    int n=5, key, result;
    int a[] = {10, 20, 30, 40, 50};

    printf("Enter element to search: ");
    scanf("%d", &key);

    int low=0, high=n-1, mid;
    while(low <= high) {
        mid = (low + high) / 2;
        if(a[mid] == key) {
            printf("Element found at position %d\n", mid + 1);
            return 0;
        }
        else if(a[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }

    printf("Element not found\n");
    return 0;
}