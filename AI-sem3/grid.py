Grid = []

i=0
while i<9:
    print(i)
    sign = input("Enter X or O: ")
    if sign != 'X' and sign != 'O':
        print("ValueError! Only X and O are allowed. Please re-enter")
    else:
        Grid[i] = sign
        i += 1

for i in range(3):
    print(f"{Grid[i*3]} | {Grid[i*3+1]} | {Grid[i*3+2]}")
    if i<2: print("---------")

print(Grid)