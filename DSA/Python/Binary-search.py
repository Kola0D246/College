#BINARY SEARCH

def Bsearch(lst, key):          #This code takes less time and memory campare to actually slicing the list
    #sort the list
    lst.sort()


    low = 0
    high = len(lst) -1

    while True:
        mid = (low + high)//2
        if key == lst[mid]: return mid  #return index of desired element
        elif key < lst[mid]: high = mid -1
        elif key > lst[mid]: low = mid+1

lst_raw = [4, 6, 0, 2, 10, 9, 1]
key = 6
print("Index of desired element:", Bsearch(lst_raw, key))

