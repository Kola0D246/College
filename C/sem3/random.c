// Write a program to compare three numbers and find the second largest no.
// write a program to compare n number and find the second largest no. 

#include <stdio.h>

int main() {
    int arr[] = {1,5,3,6,22,64,22,44,2,5};
    int user, a = 0, b = 0, t=arr[0];

    int n = sizeof(arr)/sizeof(arr[0]);

    for (int i = 0; i < user; i++){

        if (a < t){
            b = a;
            a = t;
        }
    }

    printf("\n%d is the largest number\n", a);
    printf("%d is the second largest number", b);

    return 0;
}

