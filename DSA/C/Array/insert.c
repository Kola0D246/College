#include <stdio.h>
#define MAX 20

void append(int arr[], int *count, int value) {
    if (*count >= MAX) {
        printf("Array is full\n");
        return;
    }
    arr[(*count)++] = value;
}

void insert(int arr[], int *count, int index, int value) {
    if (*count >= MAX) {
        printf("Array is full\n");
        return;
    }
    if (index < 0 || index > *count) {
        printf("Invalid index\n");
        return;
    }
    for (int i = *count; i > index; i--) {
        arr[i] = arr[i - 1];        //shift right
    }
    arr[index] = value;
    (*count)++;
}

int main() {
    int arr[MAX];
    int count = 0;

    append(arr, &count, 10);
    append(arr, &count, 20);
    insert(arr, &count, 1, 15);

    for (int i = 0; i < count; i++) {
        printf("%d ", arr[i]);
    }
}