#include <stdio.h>

int main() {
    char name[20] = "Alice";  //Initialize a string (size 20 char)

    printf("Hello, %s!\n", name);
    printf("Length of string: %d bytes\n", sizeof(name));

    //accessing string elements
    printf("2nd character: %c\n", name[1]);

    return 0;
}
