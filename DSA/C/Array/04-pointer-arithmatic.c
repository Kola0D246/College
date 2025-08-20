#include <stdio.h>
#define row 2
#define col 3

int main() {
    //---------1D array---------//
    // Address of arr1D[i] = baseAddress + i * size
    int arr1D[col] = {1, 2, 3};

    int i = 2;
    int baseAddress = (int)arr1D;
    int calculatedAddress = baseAddress + i * sizeof(int);
    printf("Calculated address of arr1D[2] = %p\n", calculatedAddress);
    printf("Actual address of arr1D[2] = %p\n", &arr1D[2]);


    //---------2D array---------//
    // Address of arr2D[i][j] = baseAddress + (i * col + j) * size
    int arr2D[row][col] = { {1, 2, 3}, {4, 5, 6} };

    int i = 1, j = 2;
    int baseAddress = (int)arr2D;
    int offset = (i * col + j) * sizeof(int);
    int calculatedAddress = baseAddress + offset;

    printf("Calculated address of arr2D[1][2] = %p\n", calculatedAddress);
    printf("Actual address of arr2D[1][2] = %p\n", &arr2D[1][2]);
}