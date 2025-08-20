//Print triangular sum (1+2+3+4...+n) upto input numbers
#include <stdio.h>
//count from 1 to 100

int main() {
    int i, start, end, jump, sum=0;      //i = iterator or counter
    printf("Enter (start,end,jump) values:");
    scanf("%d,%d,%d", &start, &end, &jump);
    for (i=start; i<=end; i= i+jump){
        sum += i;
    }
    printf("Sum = %d",sum);
    return 0;
}