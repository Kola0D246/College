#include <stdio.h>

int main() {
    // ---------- 1D ARRAY ---------- //
    int arr1D[5] = {10, 20, 30, 40, 50};

    printf("1D Array Elements and Addresses:\n");
    for (int i = 0; i < 5; i++) {
        printf("arr1D[%d] = %d, Address = %p\n", i, arr1D[i], &arr1D[i]);
    }
}
