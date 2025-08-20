//This program takes Principle, Rate and Time as inputs and print simple interest;
#include <stdio.h>

int main() {
    // Declare variable;
    float Principle, Rate, Time, SI, Amount;

    // input principle, rate and time;
    printf("Enter Principle amount:");
    scanf("%f", &Principle);
    printf("Enter Rate of Interest (without percentage sign):");
    scanf("%f", &Rate);
    printf("Enter Time period (in year):");
    scanf("%f", &Time);

    // calculate Simple interest and total payable amount;
    SI = (Principle*Rate*Time)/100;
    Amount = SI + Principle;
    printf("Simple interest is calculated to be %f\n", SI);
    printf("Total Payable Amount is calculated to be %f\n", Amount);

    return 0;
}

/* 
Note:- When varaible are called in scanf() function, '&' prefix is used, like &Time. This is because we call for memory location where we will store the value. However, in printf() function, '&' prefix is not used as we call the value inside the variable.
*/ 