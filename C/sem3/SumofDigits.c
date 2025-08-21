// Write a program to findout sum of digits of given number
#include <stdio.h>

int main() {
    int num, dig, sum=0;

    printf("Enter a number:");
    scanf("%d", &num);
    
    while (num !=0) {
        dig = num % 10;
        num = num / 10;
        sum += dig;
    }
    printf("Sum of all digits = %d", sum);
    return 0;
}