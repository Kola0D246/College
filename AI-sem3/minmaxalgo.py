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
def avalMove():
    lst = []
    for row in grid:
        if grid[row][0] == " ":lst.append((row,0))
        if grid[row][1] == " ":lst.append((row,1))
        if grid[row][2] == " ":lst.append((row,2))
    return lst

### Check for winner
def winner(contender):
    for i in range(3):
        if grid[i][0] == grid[i][1] == grid[i][2] == contender: return True
        if grid[0][i] == grid[1][i] == grid[2][i] == contender: return True
    if grid[0][2] == grid[1][1] == grid[2][0] == contender: return True
    if grid[0][0] == grid[1][1] == grid[2][2] == contender: return True
    return False

def checkWin():
    if winner(player): return player
    if winner(comptr): return comptr
    if avalMove() == []: return "DRAW"
    return None

### Minmax Algorithm
def minmaxAlgo(grid, isMaxmize):
    result = checkWin()
    if result == player: return -1
    elif result == comptr: return 1
    elif result == 'DRAW': return 0

    if isMaxmize:                               # maximize function for computer turn
        bestScore = -math.inf
        for cord in avalMove():
            grid[cord[0]][cord[1]] = comptr     # make hypothetical move
            score = minmaxAlgo(grid, False)           # recurse for player's turn
            grid[cord[0]][cord[1]] = " "        # backtrack move
            bestScore = max(score, bestScore)
        return bestScore
    else:                   # isMaximize = False; minimize function for player turn
        bestScore = math.inf
        for cord in avalMove():
            grid[cord[0]][cord[1]] = player
            score = minmaxAlgo(grid, True)
            grid[cord[0]][cord[1]] = " "
            bestScore = min(score, bestScore)
        return bestScore
    
def bestAImove(grid):
    bestScore = -math.inf
    bestMove = None

    for cord in avalMove():
        grid[cord[0]][cord[1]] = comptr     # make hypothetical move
        score = minmaxAlgo(grid, False)           # recurse for player's turn
        grid[cord[0]][cord[1]] = " "        # backtrack move
        
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
    R = input("Enter row (0-2):")
    C = input("Enter column (0-2):")

    if grid[R][C] != " ":
        print("The block is unavailable, Please choose again!")
        continue
    grid[R][C] = player
    showGrid()

    finalResult = checkWin() 
    if finalResult != None: break

    # Computer's turn
    AIMove = bestAImove(grid)
    if AIMove != None:
        grid[AIMove[0]][AIMove[1]] = comptr
    showGrid()

    finalResult = checkWin() 
    if finalResult != None: break

if finalResult == player:
    print("Player wins the Game!")
elif finalResult == comptr:
    print("Computer wins the Game!")
else:
    print("Its a Draw!")