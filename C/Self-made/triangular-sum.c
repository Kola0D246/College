//Print triangular sum (1+2+3+4...+n) upto input numbers
#include <stdio.h>

// Using For loop
/* 
    ++i - preincrement operator. Increase by 1 then use i;
    i++ - postincrement operator. use i then Increase by 1;
    --i - predecrement operator. decrease by 1 then use i;
    i-- - postdecrement operator. use i then Increase by 1;
*/
/*
int main() {
    int num, i, sum=0;
    printf("Enter any integer");
    scanf("%d", &num);
    for (i=1; i<=num; ++i){
        sum+=i;
    }
    printf("Sum = %d",sum);
    return 0;
}
*/

// Using formula
/*  
int main() {
    int num, sum;
    printf("Enter any integer");
    scanf("%d", &num);
    sum= num*(num+1)/2;
    printf("Sum = %d",sum);
    return 0;
}
*/

//Using recusrion
int nSum(int num) {
    //base condition for termination
    if (num==0){
        return 0;
    } else {
        int res = num + nSum(num+1);
    }
}

int main() {
    int numb;
    printf("Enter a number:");
    scanf("%d", &numb);

    int sum = nSum(numb);
    printf("Sum of first %d natural numbers is %d", numb, sum);
    return 0;
}