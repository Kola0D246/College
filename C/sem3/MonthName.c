// Write a program to display months in words if word is given in number
#include <stdio.h>

int main() {
    int num;
    char *month[] = {"January","Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    printf("Enter an integer (1-12):");
    scanf("%d", &num);
    
    //check for value error
    if (num <1 || num > 12){
        printf("number of month cannot be less than 1 or greater than 12");
    }
    else {
        printf("The %d month of year is %s",num, month[num-1]);
    }
}