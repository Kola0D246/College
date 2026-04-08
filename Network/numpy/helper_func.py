# This file contain all the helper functions that are used across files

def binaryinput(input_size):
    binary = input(f"Enter {input_size} bit binary sequence: ")
    if len(binary) != input_size: return None
    for bit in binary:
        if bit != '0' and bit != '1': return None
    return binary

def breaksequence(binary:str, chunk_size:int) -> list[str]:
    lst = []
    size= len(binary)
    overflow = size%chunk_size
    lst.append(('0'*(chunk_size-overflow))+binary[0:overflow])
    for idx in range(overflow, size, chunk_size):
        lst.append(binary[idx:idx+4])
    print(lst)
    return lst

def chunksum(lst:list[str], chunk_size):
    if chunk_size != len(lst[0]):
        raise ValueError('chunk size in list not same as protocol')
    for x in range(chunk_size):
        input = str([chunk[x] for chunk in lst])
        count = input.count('1')
        print(count)
    


lst = breaksequence('101100001000011',4)
chunksum(lst, 4)