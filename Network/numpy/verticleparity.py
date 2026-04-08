#Verticle Parity

# Sender - 
## break the 12 bit binary sequnce into 3 column of 4 bit binary sequnce
## Add the corresponsing bit and generate 4th column
## Send the entire packet

# Reciever -
## break the 12 bit binary sequnce into 3 column of 4 bit binary sequnce
## Add corresponding bit of first 3 column and generate a 4 bit binary sequnce
## Check if 4 bit sequnce is same as 4th column. If yes, 

import numpy as np

def binaryinput(input_size):
    binary = np.zeros(input_size+1, dtype=bool)
    inpt = input(f"Enter {input_size} bit binary sequence: ")

    #check for incorrect input
    if len(inpt) != input_size: return None
    for idx in range(input_size):
        if inpt[idx] == '1':
            binary[idx+1] = True
        elif inpt[idx] != '0': 
            return None
    return binary

def break_binary(binary, chunk_size):
    gap = len(binary)%chunk_size
    num_chunk = len(binary)//chunk_size
    np.insert(binary, 0, [False]*gap)
    binary= np.split(binary, num_chunk)
    row_sums = np.bitwise_xor.reduce(binary, axis=0)
    print(binary)
    print(row_sums)

def patch_binary(binary):
    pass

def sender():
    pass

break_binary(np.array([1,0,0,1,0,0,1,1], dtype=bool), 4)