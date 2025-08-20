#include <stdio.h>

void swap(int a, int b) {
   int temp = a; a = b; b = temp;
   printf("After swap:\n"); 
   printf("x = %d, y = %d\n", a, b);
}

int main() {
   int x=5, y=10;
   printf("Before swap:\n");
   printf("x = %d, y = %d\n", x, y);
   
   swap(x, y); 
   return 0;
}