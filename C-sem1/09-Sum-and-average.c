// This program find sum and avearge of two numbers;
#include <stdio.h>

int main() {
    int num1, num2, num3, sum;
    float avg;

    printf("Enter three numbers (a,b,c) :");
    scanf("%d,%d,%d", &num1, &num2, &num3);

    sum = num1+num2+num3;
    avg = sum/3.0;

    printf("The sum of three input numbers = %d\n", sum);
    printf("The average of three input numbers = %f\n", avg);

    return 0;
}