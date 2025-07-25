// Write a program to findout sum of digits of given number
#include <stdio.h>

int main() {
    int num=1358, _num = num, sum=0, dig;
    while (num !=0) {
        dig = num % 10;
        num = num / 10;
        sum += dig;
    }
    printf("Sum of all digits of %d = %d", _num, sum);
    return 0;
}