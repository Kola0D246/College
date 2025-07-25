// find sum of n prime number

#include <stdio.h>

int isPrime(int n) {
   if (n <= 1) return 0;
   for (int i = 2; i * i <= n; i++)
       if (n % i == 0) return 0;
   return 1; 
}

int main() {
   int n, sum = 0, num = 2, count = 0;
   
   printf("Enter N: ");
   scanf("%d", &n);
   
   while (count < n) {
       if (isPrime(num)) {
           sum += num;
           count++;
       }
       num++;
   }
   
   printf("Sum of first %d prime numbers: %d", n, sum);
   return 0;
}