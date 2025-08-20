// This program find difference between two numbers;
#include <stdio.h>

int main() {
    int num1, num2;

    printf("Minuend:");
    scanf("%d", &num1);
    printf("Subtrahend:");
    scanf("%d", &num2);
    printf("The difference of two input numbers is %d\n", num1-num2);
    
    return 0;
}