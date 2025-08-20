#include <stdio.h>

int main() {
    int a = 10;       // Integer
    float b = 5.5;    // Floating-point number
    char c = 'A';     // Character
    double d = 3.14;  // Double-precision floating-point number
    void *ptr = NULL; // Void pointer because C does not have a void variables

    // Printing the values
    printf("Integer: %d\n", a);
    printf("Float: %.2f\n", b);
    printf("Character: %c\n", c);
    printf("Double: %.2lf\n", d);
    printf("Void: %p\n", ptr);
    

    // Size of data types
    printf("size of int: %d bytes\n", sizeof(a));
    printf("size of float: %d bytes\n", sizeof(b));
    printf("size of char: %d bytes\n", sizeof(c));
    printf("size of double: %d bytes\n", sizeof(d));
    printf("size of void pointer: %d bytes\n", sizeof(ptr));

    // Bool datatype is in python, not C
    return 0;
}