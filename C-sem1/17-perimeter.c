#include <stdio.h>

float circle(){
    float radius;
    printf("Enter radius of circle:");
    scanf("%f", &radius);
    return (2.0*3.141*radius);
}

float square(){
    float side;
    printf("Enter side of square:");
    scanf("%f", &side);
    return 4*side;
}

float rectangle(){
    float len, bre;
    printf("Enter length, breadth of rectangle:");
    scanf("%f,%f", &len, &bre);
    return 2*(len+bre);
}

float triangle(){
    float base, height;
    printf("Enter base, height of triangle:");
    scanf("%f, %f", &base, &height);
    return 0.5*base*height;
}

void main(){
    int user;

    printf("Enter the number for perimeter of given shapes:\n\
    1. Circle\n\
    2. Square\n\
    3. Rectangle\n\
    4. Triangle\n\n\
    Choice: ");
    scanf("%d", &user);

    switch (user)
    {
    case 1:
        printf("Perimeter of circle: %f", circle());
        break;

    case 2:
        printf("Perimeter of square: %f", square());
        break;

    case 3:
        printf("Perimeter of rectangle: %f", rectangle());
        break;

    case 4:
        printf("Perimeter of triangle: %f", triangle());
        break;
    
    default:
        printf("Incorrect input");
        break;
    }
}