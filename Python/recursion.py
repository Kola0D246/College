def P(n: int):
    # End case
    if n<0:
        print("\nBacktracking")
        return

    # print number
    print(n, end=" ")

    # recursion call
    P(n-1)

    # backtracking
    print(n, end=" ")

# initial call
# P(100)

###########################################################
def Nfactorial(N: int):
    if N==1: return 1
    return N*Nfactorial(N-1)
    
#print(Nfactorial(7))

#########################################################
def Fibonacci1(N: int):
    if N==1:
        print(0, 1, end=" ")
        return [0, 1]
    tup = Fibonacci(N-1)
    sum = tup[0] + tup[1]
    print(sum, end=" ")
    return [tup[1], sum]

def Fibonacci(N:int):
    if N==0 or N==1:
        print(N, end=" ")
        return N
    sum = Fibonacci(N-1) + Fibonacci(N-2)
    print(sum, end=" ")
    return sum

# Fibonacci(3)

#########################################################
def isSorted(arr):
    if len(arr) <=1: return True
    if arr[0] >= arr[1]: return False
    return isSorted(arr[1:])

# print(isSorted([1,2,3,4,5,6,7,8,9]))
#########################################################
def BSearch(arr, target, offset=0):
    if target not in arr:
        return None
    
    key = len(arr)//2
    if target == arr[key]:
        return key + offset
    elif target < arr[key]:
        return BSearch(arr[:key], target, offset)
    elif target > arr[key]:
        return BSearch(arr[key+1:], target, offset+key+1)
    
def BSearch2(arr, target, low=0, high=None):
    if high is None:
        high = len(arr) - 1
    if low > high:  
        return None
    
    key = (low+high)//2
    if target == arr[key]:
        return key
    elif target < arr[key]:
        return BSearch2(arr, target, low, key)
    elif target > arr[key]:
        return BSearch2(arr, target, key+1, high)
    
arr = [1,2,3,4,5,6,7,8,9]
print(BSearch2(arr, 12))