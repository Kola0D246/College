// Find range of float datatype;
#include <stdio.h>
#include <float.h>

int main() {
    float minFloat_value = FLT_MIN;
    float maxFloat_value = FLT_MAX;
    printf("Minimum value of Float datatype stores: %e\n", minFloat_value);
    printf("Maximum value of Float datatype stores: %e\n", maxFloat_value);

    return 0;
}