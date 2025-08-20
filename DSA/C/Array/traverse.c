#include <stdio.h>

int main() {
    int array[] = {11, 12, 13, 14, 15};
    int len = sizeof(array) / sizeof(array[0]);

    printf("TRAVERSING\n");
    printf("The numbers in the array are:\n");
    for (int i=0; i<len; i++) {
        printf("%d ", array[i]);
    }
}