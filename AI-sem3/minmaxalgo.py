# This is tic tac toe game based on minmax algorithm
import math

## Create initial 3x3 grid (empty)
grid = [[" ", " ", " "],
        [" ", " ", " "],
        [" ", " ", " "]]

## Functions for Gameplay

### Display Grid
def showGrid():
    for i in range(3):
        print(" | ".join(grid[i]))    # join elements of ith row of grid with sep " | "
        if i<2: print("---------")

### Check for available moves
def avalMove(grid):
    lst = []
    for rowN in range(3):
        if grid[rowN][0] == " ":lst.append((rowN,0))
        if grid[rowN][1] == " ":lst.append((rowN,1))
        if grid[rowN][2] == " ":lst.append((rowN,2))
    return lst

### Check for winner
def winner(contender, grid):
    for i in range(3):
        if grid[i][0] == grid[i][1] == grid[i][2] == contender: return True
        if grid[0][i] == grid[1][i] == grid[2][i] == contender: return True
    if grid[0][2] == grid[1][1] == grid[2][0] == contender: return True
    if grid[0][0] == grid[1][1] == grid[2][2] == contender: return True
    return False

def checkWin(grid):
    if winner(player, grid): return player
    if winner(comptr, grid): return comptr
    if avalMove(grid) == []: return "DRAW"
    return None

### Minmax Algorithm
def minmaxAlgo(grid_local, isMaxmize):
    result = checkWin(grid_local)
    if result == player: return -1
    elif result == comptr: return 1
    elif result == 'DRAW': return 0

    if isMaxmize:                               # maximize function for computer turn
        bestScore = -math.inf
        for cord in avalMove(grid_local):
            grid_local[cord[0]][cord[1]] = comptr     # make hypothetical move
            score = minmaxAlgo(grid_local, False)           # recurse for player's turn
            grid_local[cord[0]][cord[1]] = " "        # backtrack move
            bestScore = max(score, bestScore)
        return bestScore
    else:                   # isMaximize = False; minimize function for player turn
        bestScore = math.inf
        for cord in avalMove(grid_local):
            grid_local[cord[0]][cord[1]] = player
            score = minmaxAlgo(grid_local, True)
            grid_local[cord[0]][cord[1]] = " "
            bestScore = min(score, bestScore)
        return bestScore
    
def bestAImove(grid_local):
    bestScore = -math.inf
    bestMove = None

    for cord in avalMove(grid_local):
        grid_local[cord[0]][cord[1]] = comptr     # make hypothetical move
        score = minmaxAlgo(grid_local, False)           # recurse for player's turn
        grid_local[cord[0]][cord[1]] = " "        # backtrack move
        
        if bestScore < score:
            bestScore = score
            bestMove = (cord[0],cord[1])

    return bestMove


## Gameplay

### Select player's sign - X move first
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

showGrid()

while True:
    # Human Player's turn
    try:
        R = int(input("Enter row (0-2):"))
        C = int(input("Enter column (0-2):"))
    except:
        print("Invalid input!")
        continue

    if R<0 or R>2 or C<0 or C>2:
        print("Input exceeds the grid size. Please re-enter!")
        continue

    if grid[R][C] != " ":
        print("The block is unavailable, Please choose again!")
        continue
    grid[R][C] = player
    showGrid()

    finalResult = checkWin(grid) 
    if finalResult != None: break

    # Computer's turn
    AIMove = bestAImove(grid)
    if AIMove != None:
        grid[AIMove[0]][AIMove[1]] = comptr
    showGrid()

    finalResult = checkWin(grid) 
    if finalResult != None: break

if finalResult == player:
    print("Player wins the Game!")
elif finalResult == comptr:
    print("Computer wins the Game!")
else:
    print("Its a Draw!")