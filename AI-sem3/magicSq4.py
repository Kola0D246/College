# This is tic tac toe game based on minmax algorithm
import random as rd

## Create initial grids (empty)
grid = [" "]*9
gridNum = [8, 3, 4, 1, 5, 9, 6, 7, 2]
playerCh = comptrCh = [0]*9

## Functions for Gameplay

### Display Grid
def showGrid():
    for i in range(3):
        print(f"{grid[i*3]} | {grid[i*3+1]} | {grid[i*3+2]}")    # join elements of ith row of grid with sep " | "
        if i<2: print("---------")

### Check for available moves
def avaMove():
    lst = []
    for i in range(9):
        if grid[i] == " ":lst.append(i)
    return lst

### Check for winner
def winner(contender):
    for i in range(3):
        if grid[i*3] == grid[i*3+1] == grid[i*3+2] == contender: return True
        if grid[i] == grid[i+3] == grid[i+6] == contender: return True
    if grid[0] == grid[4] == grid[8] == contender: return True
    if grid[2] == grid[4] == grid[6] == contender: return True
    return False

def checkWin():
    if winner(player): return player
    if winner(comptr): return comptr
    if avaMove() == []: return "DRAW"
    return None

### Computer's turn
def MagicSq(contdrCh):
    for i in range(3):
        if 15 - contdrCh[i*3] + contdrCh[i*3+1] + contdrCh[i*3+2] == 15: return True
        if contdrChoice[i] + contdrChoice[i+3] + contdrChoice[i+6] == 15: return True
    if contdrChoice[2] + contdrChoice[4] + contdrChoice[6] == 15: return True
    if contdrChoice[0] + contdrChoice[4] + contdrChoice[8] == 15: return True
    return False

def AImove():
    if MagicSq(comptrCh): return
    elif MagicSq(playerCh): return
    else:
        print("Random move")
        avaSlot = avaMove()
        idx = rd.choice(avaSlot)
        grid[idx] = comptr

### Player's turn
def PLmove():
    showGrid()
    while True:
        try:
            idx = int(input("Choose where you want to play (0-8):"))
            if grid[idx] == " ": break
            print("Position unavailable!")
        except:
            print("Invalid input")
    grid[idx] = player
    playerCh[idx] = gridNum[idx]

## Gameplay
showGrid()     # Display intial grid(empty)

### Select player's sign - X move first
while True:
    sign = input("Choose what you want to play - X or O:")
    if sign == 'X':
        player = "X"
        comptr = "O"
        print("Player will mark first:")
        break
    elif sign == 'O':
        player = "O"
        comptr = "X"
        print("Computer will mark first:")
        break
    else:
        print("ValueError! Only X and O are allowed (capital case) Please re-enter")



### Play the game in infinite loop - X mark first
while True:
    if player=="X":
        PLmove()
        finalResult = checkWin()        # Check for wins/ Draw
        if finalResult != None: break

        AImove()
        finalResult = checkWin()        # Check for wins/ Draw
        if finalResult != None: break

    else:
        AImove()
        finalResult = checkWin()        # Check for wins/ Draw
        if finalResult != None: break

        PLmove()
        finalResult = checkWin()        # Check for wins/ Draw
        if finalResult != None: break

### Declare the game result
if finalResult == player:
    print("Player wins the Game!")
elif finalResult == comptr:
    print("Computer wins the Game!")
    showGrid()
else:
    print("Its a Draw!")