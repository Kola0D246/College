#Parity
import numpy as np

def binaryinput(input_size):
    binary = np.zeros(input_size+1)
    inpt = input(f"Enter {input_size} bit binary sequence: ")

    #check for incorrect input
    if len(inpt) != input_size: return None
    for idx in range(input_size):
        if inpt[idx] == '1':
            binary[idx+1] = 1
        elif inpt[idx] != '0': 
            return None
    return binary

def sender(binary, evenParity):
    count=binary.sum()
    if (evenParity and count%2==1) or (not evenParity and count%2==0):
        binary[0]=1
    #print("Parity bit:", binary[0])
    return binary

def receiver(binary, evenParity):
    count=binary.sum()
    if (evenParity and count%2==0) or (not evenParity and count%2==1):
        s = ''.join(x for x in binary[1:])
        print("Data transmitted successfully:", s)
    else:
        print("Data is broken")

if __name__=='__main__':
    # set protocol
    size = 7
    evenParity = True
    packet_size=8 #including parity bit

    #collect input
    while True:
        binary = binaryinput(packet_size-1)
        if binary: break
        else: print("ValueError! Please re-enter")
    packet=sender(binary, evenParity)
    receiver(packet, evenParity)

