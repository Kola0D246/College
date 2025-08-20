#include <stdio.h>

void delete(int arr[], int *count, int pos) {
    if (*count <= 0 || pos < 0 || pos >= *count) {
        printf("Invalid position\n");
        return;
    }

    for (int i = pos; i < *count - 1; i++) {
        arr[i] = arr[i + 1];  // Shift left
    }
    (*count)--;
}

int main() {
    int arr[10] = {10, 20, 30, 40, 50};
    int count = 5;

    delete(arr, &count, 2);
    printf("Array after deletion:\n");
    for (int i = 0; i < count; i++) {
        printf("%d ", arr[i]);
    }
}