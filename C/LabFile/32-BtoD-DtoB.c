// binary to decimmal and decimal to binary

#include <stdio.h>

int BtoD(int binary){
    int dec = 0, base = 1;

    while (binary > 0){
        int last = binary % 10;
        binary /= 10;
        dec += last * base;
        base *= 2;
    }
    return dec;
}

int DtoB(int decimal){
    int bin = 0, i=1, remain;

    while (decimal != 0) {
        remain = decimal % 2;
        decimal /= 2;
        bin += remain * i;
        i *= 10;
    }
    return bin;
}

int main(){
    long long binary = 1011001;
    int decimal = 83, contob, contod;

    contod = BtoD(binary);
    contob = DtoB(decimal);

    printf("%lld in decimal is %d\n", binary, contod);
    printf("%d in binary is %d\n", decimal, contob);


    return 0;
}