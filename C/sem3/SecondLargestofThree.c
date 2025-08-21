// Write a program to compare 3 given number and display 2nd largest number
#include <stdio.h>

int main() {
    int num1, num2, num3;

    printf("First num:"); 
    scanf("%d", &num1);
    printf("Second num:"); 
    scanf("%d", &num2);
    printf("Third num:"); 
    scanf("%d", &num3);

    if (num2>num1 && num1>num3 || num3>num1 && num1>num2) {
        printf("Second largest number = %d",num1);
        }
    else if (num1>num2 && num2>num3 || num3>num2 && num2>num1) {
        printf("Second largest number = %d",num2);
        }
    else if (num1>num3 && num3>num2 || num2>num3 && num3>num1) {
        printf("Second largest number = %d",num3);
        }
    else {
        printf("Need three different numbers!");
    }
}

/*All possible comparisons:
b>a>c   c>a>b
a>b>c   c>b>a
a>c>b   b>c>a
*/
