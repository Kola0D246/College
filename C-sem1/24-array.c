//Working with arrays in C
#include <stdio.h>

int main() {
    int array[5] = {11, 12, 13, 14, 15};
    printf("The numbers in the array are:\n");
    for (int i=0; i<5; i++) {
        printf("%d\n", array[i]);
    }
    return 0;
}