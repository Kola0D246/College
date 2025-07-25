//This program tells you whether you pass or fail;
#include <stdio.h>

int main() {
    float max_marks, obt_marks;

    printf("Enter the marks obtained:");
    scanf("%f", &obt_marks);
    printf("Enter the maximum marks:");
    scanf("%f", &max_marks);

    obt_marks >= (1.0/3.0)*max_marks? printf("Pass"): printf("Fail");
    return 0;
}