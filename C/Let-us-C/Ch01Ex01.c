/* 
Ramesh's basic salary is input through the keyboard
His dearness allowance is 40% of basic salary
and house rent allownace is 40% of basic salry.
Write a program to calculate his gross salary.
*/

#include <stdio.h>

int main(){    
    // declare variable;
    float base_salary, dearness_allw, house_allw, gross_salary;       //allw = allowance

    // input and calculation;
    printf("Enter base salary:");
    scanf("%f", &base_salary);

    dearness_allw = 0.4*base_salary;
    house_allw = 0.2*base_salary;
    gross_salary = base_salary + dearness_allw + house_allw;

    // output
    printf("\nDearness Allowance = %.2f", dearness_allw);
    printf("\nHouse Allowance = %.2f", house_allw);
    printf("\nGross Salary = %.2f", gross_salary);
    return 0;
}

// Since % is use to tell format specifier, we use another % as escape character (%%) to print %