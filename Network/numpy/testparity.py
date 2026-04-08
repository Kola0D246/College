from parity import sender, receiver
from helper_func import binaryinput

#set protocol
packet_size=8   #including parity bit
evenParity=True

#collect input
while True:
    binary = binaryinput(packet_size-1)
    if binary: break
    else: print("ValueError! Please re-enter")

packet = sender(binary, evenParity)
receiver(packet, evenParity)