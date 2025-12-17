'''Problem Statement
The prime factors of 13195 are 5, 7, 13 and 29
Make function that return the largest prime factor of the argumented number
Paarameter:
> num - number for prime factorization

Test: num =600851475143
'''

def largest_prime_factor(num:int) -> int:
    if num in (0, 1, 2, 3): return num
    N = abs(num)
    x = 0

    prime = (2, 3)
    while x*x <= N:
        while N%prime[0] == 0:
            N //= prime[0]
        if N==1: return prime[0]

        while N%prime[1] == 0:
            N //= prime[1]
        if N==1: return prime[1]

        x+=6
        prime = (x-1, x+1)
    return N     # N is prime number

num= 600851475143
print(largest_prime_factor(num))


def largest_prime_factor2(num:int) -> int:
    factor = 2
    while num != 1:
        if num%factor == 0:
            num //= factor
        else:
            factor+=1
    return factor

# optimsed