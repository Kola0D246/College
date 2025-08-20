#include <stdio.h>
int main() {
    int x = 85;
    int* ptr = &x;
    printf("Value at address %p = %d\n",ptr, *ptr);
    printf("Address of value stored by pointer variable %p\n", &ptr);
}