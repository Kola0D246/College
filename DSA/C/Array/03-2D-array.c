#include <stdio.h>

int main() {
    // ---------- 2D ARRAY ---------- //
    int arr2D[3][4] = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };

    printf("2D Array Elements and Addresses:\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            printf("arr2D[%d][%d] = %d, Address = %p\n", i, j, arr2D[i][j], &arr2D[i][j]);
        }
    }

    return 0;
}