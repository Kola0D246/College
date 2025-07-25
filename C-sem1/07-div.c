// This program find qoutient and remainder when two numbers are divided;
#include <stdio.h>

int main() {
    int num1, num2;

    printf("Dividend:");
    scanf("%d", &num1);
    printf("Divisor:");
    scanf("%d", &num2);
    printf("After dividing the two input number\n");
    printf("  qoutient = %d\n remainder = %d", num1/num2, num1%num2); 
    
    return 0;
}