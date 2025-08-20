//This program takes Principle, Rate and Time as inputs and print simple interest;
#include <stdio.h>
#include <math.h>

int main(){
    //declare variable;
    float Principle, Rate, Time, CI, Amount;

    //input values;
    printf("Input - (Principle Rate Time):");
    scanf("%f %f %f", &Principle, &Rate, &Time);

    //calculate compound interest;
    Amount = Principle*pow(1+Rate/100, Time);
    CI = Amount-Principle;

    //print output;
    printf("Compound interest is %f\n", CI);
    printf("Total Payable Amount is %f\n", Amount);

    return 0;
}