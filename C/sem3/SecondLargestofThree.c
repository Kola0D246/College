// Write a program to compare 3 given number and display 2nd largest number
#include <stdio.h>

int main() {
    int num1= 12, num2= 43, num3= 23;
    if (num2>num1 && num1>num3 || num3>num1 && num1>num2) {
        printf("%d",num1);
        }
    else if (num1>num2 && num2>num3 || num3>num2 && num2>num1) {
        printf("%d",num2);
        }
    else if (num1>num3 && num3>num2 || num2>num3 && num3>num1) {
        printf("%d",num3);
        }
    }

/*All possible comparisons:
b>a>c   c>a>b
a>b>c   c>b>a
a>c>b   b>c>a
*/
