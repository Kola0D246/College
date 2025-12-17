''' Problem Statement
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Create a function that find the sum of all the multiples of a list of number <lst> smaller than some number <num>

Parameter:
> lst - list of numbers of whose multiples we need to add
> num - upper cap of number

Test:
sum of all multiples 3 and 5 below 100
'''

def sum_multiples(lst: list, num:int) -> int:
    total = 0
    for N in lst:
        while N < num:
            total+=N
            N+=N
    return total

lst = [3, 5]
num = 100
ans = sum_multiples(lst, num)
print(ans)