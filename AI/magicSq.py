import numpy as np

# Crete Grid
Gridnum = np.array([8, 3, 4, 1, 5, 9, 6, 7, 2])
playerChoice = comptrChoice = []
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
    playerChoice.append(Gridnum[idx])
    
# Function for how computer plays
def mark(contdrChoice):
    for i in range(len(contdrChoice)):
        for j in range(i+1, len(contdrChoice)):
            point = 15-contdrChoice[i]-contdrChoice[j]
            if point>9 or point<1:
                Grid[Gridnum[point]] = comptr
                contdrChoice.append(point)
                return True
    return False
    
def COMPTR():
    if mark(playerChoice): return
    elif mark(comptrChoice): return


def win(contender): # contender <= playerChoice or comptrChoice
    for i in range(3):
        if Grid[i*3] == Grid[i*3+1] == Grid[i*3+2] == contender: return True
        if Grid[i] == Grid[i+3] == Grid[i+6] == contender: return True
    if Grid[2] == Grid[4] == Grid[6] == contender: return True
    if Grid[0] == Grid[4] == Grid[8] == contender: return True

# Function to check winning
def win(contender):
    for i in range(3):
        if Grid[i*3] == Grid[i*3+1] == Grid[i*3+2] == contender: return True
        if Grid[i] == Grid[i+3] == Grid[i+6] == contender: return True
    if Grid[2] == Grid[4] == Grid[6] == contender: return True
    if Grid[0] == Grid[4] == Grid[8] == contender: return True

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