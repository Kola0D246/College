// This program find sum of three numbers;
#include <stdio.h>

int main() {
    int num1, num2, num3;

    printf("Enter first number:");
    scanf("%d", &num1);
    printf("Enter second number:");
    scanf("%d", &num2);
    printf("Enter third number:");
    scanf("%d", &num3);

    printf("The sum of three input numbers is %d\n", num1+num2+num3);

    return 0;
}  