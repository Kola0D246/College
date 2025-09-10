import numpy as np
import random as rd

# Crete Grid
Grid = np.repeat([" "], 9)

# Function for how player plays
def PLAYER():
    showGrid()
    avaSlot = listEmpty()
    print("Available positions:", avaSlot)
    while True:
        try:
            idx = int(input("Choose where you want to play:"))
            if idx in avaSlot: break
            print("Position unavailable!")
        except:
            print("Invalid input")
    Grid[idx] = player

# Function for how computer plays
def COMPTR():
    avaSlot = listEmpty()
    idx = rd.choice(avaSlot)
    Grid[idx] = comptr

# Function to check winning
def win(contender):
    for i in range(3):
        if Grid[i*3] == Grid[i*3+1] == Grid[i*3+2] == contender: return True
        if Grid[i] == Grid[i+3] == Grid[i+6] == contender: return True
    if Grid[2] == Grid[4] == Grid[6] == contender: return True
    if Grid[0] == Grid[4] == Grid[8] == contender: return True

# Other Functions
def showGrid():
    for i in range(3):
        print(f"{Grid[i*3]} | {Grid[i*3+1]} | {Grid[i*3+2]}")
        if i<2: print("---------")

def listEmpty():
    lst = []
    for i in range(9):
        if Grid[i] == " ":
            lst.append(i)
    return lst


#######################
###### Play game ######
#######################

# Player will select sign X or O. Computer will take the other sign.
while True:
    sign = input("Choose what you want to play - X or O:")
    if sign == 'X':
        player = 'X'
        comptr = 'O'
        break
    elif sign == 'O':
        player = 'O'
        comptr = 'X'
        break
    else:
        print("ValueError! Only X and O are allowed. Please re-enter")

# Game start with 'X' sign. Player and Computer takes turn alternatively.
for i in range(9):
    if player == 'X':
        if i%2 == 0: PLAYER()
        else: COMPTR()
    else:
        if i%2 == 0: COMPTR()
        else: PLAYER()
    if win(player):
        print("Player wins the game!")
        break
    if win(comptr):
        print("Computer wins the game!")
        break

# Show Final Grid
showGrid()