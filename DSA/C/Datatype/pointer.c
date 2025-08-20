#include <stdio.h>

int main() {
    int a = 10;
    int *p = &a;    // Pointer to an integer
    printf("Value of a: %d\n", a);
    printf("Address of a: %p\n", &a);
    printf("Value of p: %p\n", p);
    printf("Value pointed to by p: %d\n", *p);
    
    *p = 20;        // Change the value of a using the pointer
    printf("New value of a: %d\n", a);
    
    return 0;
}