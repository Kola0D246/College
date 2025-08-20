// This program takes side of square as input and print its area as output;
#include <stdio.h>

int main() {
    // declare varibale;
    float side;

    // input side of square;
    printf("Enter side of square (without unit):");
    scanf("%f", &side);

    //calculate and print area of square;
    printf("The area of square with side %f is %f", side, side*side);
    return 0;
}