// This program find sum of three numbers;
#include <stdio.h>
int sum(int num1, int num2){
    return num1+num2;
}
int main() {
    int num1, num2;

    printf("Enter two numbers:");
    scanf("%d,%d", &num1, &num2);

    printf("The sum of two input numbers is %d\n", sum(num1, num2));

    return 0;
}