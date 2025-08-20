// This program takes a number as input and print its cube as output;
#include <stdio.h>

int main() {
    // declare varibales;
    float num;

    // input length of rectangle;
    printf("Enter any number:");
    scanf("%f", &num);

    //calculate and print cube of input number;
    printf("The cube of %f is %f", num, num*num*num);
    return 0;
}