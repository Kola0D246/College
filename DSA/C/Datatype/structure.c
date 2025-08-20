#include <stdio.h>

int main() {
    struct employee {
    int ID;
    char fname[15];
    char lname[15];
    };

    struct employee e1;
    printf("Enter (ID First_Name Last_Name)");
    scanf("%d %s %s", &e1.ID, &e1.fname, &e1.lname);

    printf("Enter data is:\n ID = %d\n Name = %s %s\n", e1.ID, e1.fname, e1.lname);

    return 0;
}