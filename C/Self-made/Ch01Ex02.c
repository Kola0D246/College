/*
The distance between two cities (in km) is input through the keyboard.
Write a program to convert and print this distance in meters, feet, inches and centimeters
*/

#include <stdio.h>
 
char help();

int main() {
    //declare variable;
    float dist_km;
    char conv_unit, garbage;

    //input and calculation;
    printf("Enter the distance between two cities in km:");
    scanf("%f", &dist_km);
    scanf("%c", &garbage);

    help();
    printf("Enter character for desired unit:");
    scanf("%c", &conv_unit);

    if (conv_unit == 'm') {
        printf("converted distance = %.2f meter", dist_km*1000);
    }
    else if (conv_unit == 'f') {
        printf("converted distance = %.2f feet", dist_km*3280.84);
    }
    else if (conv_unit == 'i') {
        printf("converted distance = %.2f inches", dist_km*39370.079);
    }
    else if (conv_unit == 'c') {
        printf("converted distance = %.2f centimeter", dist_km*100000);
    }
    else {
        printf("Incorrect character for conversion!");
    }
}

char help(){
    printf("Use following charaters to assign convert to units:");
    printf("\nm : meter \nc : centimeter \nf : feet \ni : inch\n");
}