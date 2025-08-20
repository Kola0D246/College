#include <stdio.h>

int main() {
    float height, base;

    printf("Enter height of triangle (without unit):");
    scanf("%f", &height);
    printf("Enter base of triangle (without unit):");
    scanf("%f", &base);
    printf("The area of triangle is calculated to be %f", 0.5*height*base);

    return 0;
}