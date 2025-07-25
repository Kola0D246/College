// Write a program to calculate trhe average of daigonal element of nXn matrix of number
#include <stdio.h.>

int main (){
    //variable declaration
    int rows, columns, i=0, j=0, sum = 0;

    // Create a nXn matrix
    int mat[3][3] = {{11, 12, 13},
                     {21, 22, 23},
                     {31, 32, 33}};

    // Calculate num of rows and column and check if matrix is nXn
    rows = sizeof(mat)/sizeof(mat[0]);
    columns = sizeof(mat[0])/sizeof(mat[0][0]);
    if (rows != columns) {
        printf("Give a square (nXn) matrix in program");
        return 1;   //program end with error
    }

    // Calculate average of daigonal elements
    for (int i=0; i<rows; i++) {
        sum+= mat[i][i];
        }

    printf("Average of daigonal elements = %d\n", sum/rows);
    return 0;
}
