#include <stdio.h>
#include <math.h>

int main() {
    int num, _num_, remain, cube, power=0, result = 0;

    printf("Enter an integer: ");
    scanf("%d", &_num_);
    //number of decimal places
    num = _num_;
    while (num != 0) {
        num /= 10;
        ++power;
    }

    num = _num_;
    while (num != 0) {
        remain = num % 10;
       // cube = (int) pow(remain, power);
       // result += cube;
        result += pow(remain, power);
        num /= 10;
    }

    // if num is equal to result, the number is an Armstrong number
    if (result == _num_){
        printf("%d is an Armstrong number.\n", _num_);
    } else {
        printf("%d is not an Armstrong number.\n", _num_);
    }
         
    return 0;
}