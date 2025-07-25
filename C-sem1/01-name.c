#include <stdio.h>

int main() {
    char fname[15], lname[15], branch[40], city[15];
    int year;

    printf("Enter your name:");
    scanf("%s %s", &fname, &lname);

    printf("Enter your branch:");
    scanf(branch);

    printf("Enter your year:");
    scanf("%d", &year);

    printf("Enter your city of permanent residence:");
    scanf("%s", &city);

    printf("Hello, %s!\n", fname);
    printf("You can introduce yourself as following:\n");
    printf("Hi!\n My name is %s %s. I am from %c. I am persuing BTech in %s\n from Samrat Ashok Institute of Technology, Vidisha.\n I am currently in %dst year.", fname, lname, city, branch, year);

}