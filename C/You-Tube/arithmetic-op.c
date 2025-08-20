//Check if number is divisible by 2?

#include <stdio.h>

int main() {
    printf("If divisible, answer is 1 \nIf not divisible, answer is 0 \n");

    //Declare variable;
    int num;

    // input number;
    printf("Enter any integer:");
    scanf("%d",&num);

    //Print output
    printf("%d", num%2 == 0);       // if remainder is 0, then it is divisible (TRUE)

    return 0;
}
