//This program prints largest number of three input numbers;
#include <stdio.h>

int main() {
    //declare variable;
    int n1, n2, n3;

    //input n1, n2, n3;
    printf("Input three different numbers: (a,b,c):");
    scanf("%d,%d,%d", &n1, &n2, &n3);
    
    //Compare n1, n2, and n3;
    if (n1 > n2 && n1 > n3) {
        printf("%d is greatest", n1);
    } else if (n2 > n1 && n2 > n3) {
        printf("%d is greatest", n2);
    } else if (n3 > n1 && n3 > n2) { 
        printf("%d is greatest", n3);       
    } else {
        printf("Please input 3 different numbers");
    }

    return 0;
}