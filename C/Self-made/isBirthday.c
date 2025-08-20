#include <stdio.h>

int main(){
    int value;
    printf("IS IT YOUR BIRTHDAY??\n");
    printf("   Enter 0 for true\n");
    printf("   Enter anything else for false\n");
    scanf("%d", &value);
    printf("---------------------------------------------------\n");

    if (value == 0) {
        printf("\t !!! HAPPY BIRTHDAY RISHITA!!!\n");
        printf("\n\
    May your days brim with laughter and joy.\n\
    With Happiness alone, no troubles to annoy\n\
    In academics and skills, you soar so high\n\
    fulfill all your dreams and glide through sky\n\
    Happy Birthday My Friend, so amazing, so bright\n\
    Your path ahead lit with golden light\n\n");
        printf("Cheers to another year of adventure and growth.\n");
    } 
    else {
        printf("Oops! My mistake\n");
        printf("Sorry for disturbance!");
        printf("Enjoy your day!");
    }
}