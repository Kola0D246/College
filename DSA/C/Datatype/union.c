#include <stdio.h>

union Data {
    int i;
    float f;
    char c;
};

int main() {
    union Data data;

    data.i = 10;
    printf("After setting integer: data.i = %d\n", data.i);

    data.f = 3.14;      //overwrite data.i
    printf("After setting float: data.f = %.2f\n", data.f);

    data.c = 'A';       //overwrite data.f
    printf("After setting char: data.c = %c\n", data.c);

    printf("\nNow trying to print all members:\n");
    printf("data.i = %d\n", data.i);    //garbage value
    printf("data.f = %.2f\n", data.f);  //garbage value
    printf("data.c = %c\n", data.c);

    return 0;
}
