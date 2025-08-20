#include <stdio.h>
//count from 1 to 100

int main() {
    int i, start, end, jump;      //i = iterator or counter
    printf("Enter (start,end,jump) values:");
    scanf("%d,%d,%d", &start, &end, &jump);
    for (i=start; i<=end; i= i+jump){
        printf("%d ",i);
    }
}