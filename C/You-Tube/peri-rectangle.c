// This program takes length and breadth of rectangle as input and print its perimeter as output;
#include <stdio.h>

int main() {
    // declare varibales;
    float length, breadth;

    // input length of rectangle;
    printf("Enter length of square (without unit):");
    scanf("%f", &length);

    // input breadth of rectangle;
    printf("Enter breadth of square (without unit):");
    scanf("%f", &breadth);

    //calculate and print perimeter of rectangle;
    printf("The perimeter of rectangle with length %f and breadth %f is %f", length, breadth, 2*(length+breadth));
    return 0;

    int a = b = c = 10;
    printf("%d %d %d", a, b, c);
}