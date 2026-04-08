#Parity

def sender(binary, evenParity):
    count=binary.count('1')
    if evenParity:
        if count%2==0:
            binary='0'+binary
        else:
            binary='1'+binary
    else:
        if count%2==0:
            binary='1'+binary
        else:
            binary='0'+binary
    print("Parity bit:", binary[0])
    return binary

def receiver(binary, evenParity):
    count=binary.count('1')
    if (evenParity and count%2==0) or (not evenParity and count%2==1):
        print("Data transmitted successfully:", binary[1:])
    else:
        print("Data is broken")


# set protocol
size = 7
evenParity = True

sender('1100100', evenParity)
