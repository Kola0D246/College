## Creting full array of player choice and computer choice

import numpy as np

# Crete Grid
Gridnum = np.array([8, 3, 4, 1, 5, 9, 6, 7, 2])
playerChoice = comptrChoice = np.full(9,0)
Grid = np.full(9, " ")

# Function for how player plays
def PLAYER():
    showGrid()
    while True:
        try:
            idx = int(input("Choose where you want to play:"))
            if idx not in playerChoice and idx not in comptrChoice: break
            print("Position unavailable!")
        except:
            print("Invalid input")
    Grid[idx] = player
    playerChoice[idx] = Gridnum[idx]
    

# Function for how computer plays
def mark(contdrChoice):
    for i in range(3):
        if 15 - contdrChoice[i*3] + contdrChoice[i*3+1] + contdrChoice[i*3+2] == 15: return True
        if contdrChoice[i] + contdrChoice[i+3] + contdrChoice[i+6] == 15: return True
    if contdrChoice[2] + contdrChoice[4] + contdrChoice[6] == 15: return True
    if contdrChoice[0] + contdrChoice[4] + contdrChoice[8] == 15: return True
    
def COMPTR():
    if mark(playerChoice): return
    elif mark(comptrChoice): return

# Function to check winning
def win(contdrChoice):
    for i in range(3):
        if contdrChoice[i*3] + contdrChoice[i*3+1] + contdrChoice[i*3+2] == 15: return True
        if contdrChoice[i] + contdrChoice[i+3] + contdrChoice[i+6] == 15: return True
    if contdrChoice[2] + contdrChoice[4] + contdrChoice[6] == 15: return True
    if contdrChoice[0] + contdrChoice[4] + contdrChoice[8] == 15: return True

# Other imp functions
def showGrid():
    for i in range(3):
        print(f"{Grid[i*3]} | {Grid[i*3+1]} | {Grid[i*3+2]}")
        if i<2: print("---------")


# Select sign - X or O:
while True:
    sign = input("Choose what you want to play - X or O:")
    if sign == 'X':
        player = "X"
        comptr = "O"
        break
    elif sign == 'O':
        player = "O"
        comptr = "X"
        break
    else:
        print("ValueError! Only X and O are allowed. Please re-enter")