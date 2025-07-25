#include <stdio.h>

int main() {
    int number, square;
    char choice;

    do {
        printf("Enter a number to find its square: ");
        scanf("%d", &number);

        square = number * number;
        printf("The square of %d is %d\n", number, square);

        printf("Do you want to calculate the square of another number? (y/n): ");
        scanf(" %c", &choice); 
    } while (choice == 'y' || choice == 'Y');

    printf("Program ended. Thank you!\n");
    return 0;
}