import math
def check_prime(num):
    if type(num) != int or num <= 1:
        raise ValueError('num should be positive integer equal to or greater than 2')
    elif num == 2 or num == 3:
        return (True)
    elif num%2 == 0 or num%3 == 0:
        return (False)
    for x in range (6, math.isqrt(num), 6):
        if num%(x+1) == 0 or num%(x-1) == 0:
            return (False)
    return(True)

def list_prime(frm, to):
    if to<=frm: raise ValueError('frm should be smaller than to')
    list = [num for num in range(frm,to) if check_prime(num) is True]
    return (list)

def count_prime(frm, to):
    return (len(list_prime(frm, to)))

def prime_factor(num):
    if check_prime(num) == True:
        raise ValueError("num should not be prime number")
    pre= list_prime(2, math.isqrt(num))
    lst =[]
    for div in pre:
            if num==1:break
            while num%div == 0:
                num=  num/div
                lst.append(div)
    return (lst)

def common_factor(A, B):
    lstA= prime_factor(A)
    lstB= prime_factor(B)
    common =[]
    for el in lstA:
        if el not in common:common.append(el)


def LCM(A, B):
    lisA= prime_factor(A)
    lisB= prime_factor(B)
    multiple= [x for x in lisA for y in lisB if x==y]
    a=1
    for x in multiple:
        a*=a
    return(a)


