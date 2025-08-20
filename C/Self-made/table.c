// print table of enter number
#include <stdio.h>

int main() {
    int num, i, upto;
    printf("Input number:");
    scanf("%d", &num);
    printf("Input length of table:");
    scanf("%d", &upto);

    for (i=1; i<=upto; i++){
        printf("%d * %d = %d\n", num, i, num*i);
    }
}