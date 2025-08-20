#include <stdio.h>
int main() {
    int age;
    printf("Enter your age:");
    scanf("%d", &age);
    if (age <= 3){
        printf("Baby");
    } 
    else if (age <= 12){
        printf("Child");
    }
    else if (age <= 17){
        printf("teenager");
    }   
    else if (age <= 24){
        printf("Young Adult");
    }
    else if (age < 60){
        printf("Adult");
    }
    else {
        printf("Old");
    }
    
}