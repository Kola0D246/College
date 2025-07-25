//To calculate factorial of any number
#include <stdio.h>

int main() {
    int i=1, num, factorial=1;
    printf("Enter any integer:");
    scanf("%d", &num);
    while (i<=num){
        factorial*=i;
        i++;
    }
    printf("Factorial of given number = %d", factorial);
}