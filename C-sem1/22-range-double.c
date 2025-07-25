// Find range of double datatype;
#include <stdio.h>
#include <float.h>

int main() {
    double minDouble_value = DBL_MIN;
    double maxDouble_value = DBL_MAX;
    printf("Minimum value of Double datatype stores: %e\n", minDouble_value);      //e format specifier for exponential form
    printf("Maximum value of Double datatype stores: %e\n", maxDouble_value);

    return 0;
}