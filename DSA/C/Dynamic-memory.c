#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr1, *ptr2, *ptr3;
    int n, i;

    // -------- malloc --------
    printf("Enter number of elements for malloc: ");
    scanf("%d", &n);

    ptr1 = (int*) malloc(n * sizeof(int));
    if (ptr1 == NULL) {
        printf("Memory allocation failed using malloc.\n");
        return 1;
    }

    printf("Enter %d integers:\n", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &ptr1[i]);
    }

    printf("Data using malloc:\n");
    for (i = 0; i < n; i++) {
        printf("%d ", ptr1[i]);
    }
    printf("\n");

    // -------- calloc --------
    printf("\nEnter number of elements for calloc: ");
    scanf("%d", &n);

    ptr2 = (int*) calloc(n, sizeof(int));
    if (ptr2 == NULL) {
        printf("Memory allocation failed using calloc.\n");
        return 1;
    }

    printf("Initial values using calloc (should be 0):\n");
    for (i = 0; i < n; i++) {
        printf("%d ", ptr2[i]);
    }
    printf("\n");

    // -------- realloc --------
    printf("\nEnter new size for realloc: ");
    scanf("%d", &n);

    ptr3 = (int*) realloc(ptr1, n * sizeof(int));
    if (ptr3 == NULL) {
        printf("Memory reallocation failed.\n");
        free(ptr1); // free original memory if realloc fails
        return 1;
    }

    ptr1 = ptr3; // point to new memory

    printf("Enter %d integers after realloc:\n", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &ptr1[i]);
    }

    printf("Data after realloc:\n");
    for (i = 0; i < n; i++) {
        printf("%d ", ptr1[i]);
    }
    printf("\n");

    // -------- free --------
    free(ptr1);
    free(ptr2);

    printf("\nMemory freed successfully.\n");

    return 0;
}
