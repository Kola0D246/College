#include <stdio.h>
int main() {

  int term_1=0, term_2=1, next_term, n;

  printf("Enter the number of terms: ");
  scanf("%d", &n);

  // print the first two terms t1 and t2
  printf("Fibonacci Series: %d, %d, ", term_1, term_2);

  // print 3rd to nth terms
  for (int i = 3; i <= n; i++) {
    next_term = term_1 + term_2;
    printf("%d, ", next_term);
    term_1 = term_2;
    term_2 = next_term;
  }

  return 0;
}