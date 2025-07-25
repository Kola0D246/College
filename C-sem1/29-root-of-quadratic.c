#include <stdio.h>
#include <math.h>

int main(){
    int a, b, c;
    float s, root1, root2;

    printf("Equation:\t ax^2 + bx + c\n");

    printf("Enter the value of a,b,c:");
    scanf("%d,%d,%d", &a,&b,&c);

    s = sqrt((b*b) - (4*a*c));
    root1 = (-b+s)/(2*a);
    root2 = (-b-s)/(2*a);

    printf("Roots of equation are: %.2f, %.2f", root1, root2); 

    return 0;
}