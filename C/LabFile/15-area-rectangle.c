#include <stdio.h>

int main() {
    int length, base;

    printf("Enter length of rectangle:");
    scanf("%d", &length);
    printf("Enter base of rectangle:");
    scanf("%d", &base);
    printf("The area of rectangle is %d", length*base);

    return 0;
}