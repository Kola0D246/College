// This program takes radius of circle as input and print its area as output;
#include <stdio.h>

int main() {
    float radius;

    printf("Enter radius of circle (without unit):");
    scanf("%f", &radius);
    printf("The area of circle with radius %f is %f", radius, 3.141*radius*radius);

    return 0;
}