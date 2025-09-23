# This is tic tac toe game based on minmax algorithm
from math import inf as INFINITE

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
def avaMove(grid):
    lst = []
    for i in range(3):
        if grid[i][0] == " ":lst.append((i,0))
        if grid[i][1] == " ":lst.append((i,1))
        if grid[i][2] == " ":lst.append((i,2))
    return lst

### Check for winner
def winner(contender, grid_local):
    for i in range(3):
        if grid_local[i][0] == grid_local[i][1] == grid_local[i][2] == contender: return True
        if grid_local[0][i] == grid_local[1][i] == grid_local[2][i] == contender: return True
    if grid_local[0][2] == grid_local[1][1] == grid_local[2][0] == contender: return True
    if grid_local[0][0] == grid_local[1][1] == grid_local[2][2] == contender: return True
    return False

def checkWin(grid):
    if winner(player, grid): return player
    if winner(comptr, grid): return comptr
    if avaMove(grid) == []: return "DRAW"
    return None

### Minmax Algorithm
def minmaxAlgo(grid_local, isMaxmize):
    result = checkWin(grid_local)
    if result == player: return -1
    elif result == comptr: return 1
    elif result == 'DRAW': return 0

    if isMaxmize:                               # maximize function for computer turn
        bestScore = -INFINITE
        for cord in avaMove(grid_local):
            grid_local[cord[0]][cord[1]] = comptr     # make hypothetical move
            score = minmaxAlgo(grid_local, False)     # recurse for player's turn
            grid_local[cord[0]][cord[1]] = " "        # backtrack move
            bestScore = max(score, bestScore)
        return bestScore
    else:                   # isMaximize = False; minimize function for player turn
        bestScore = INFINITE
        for cord in avaMove(grid_local):
            grid_local[cord[0]][cord[1]] = player
            score = minmaxAlgo(grid_local, True)
            grid_local[cord[0]][cord[1]] = " "
            bestScore = min(score, bestScore)
        return bestScore
    
### Computer's turn
def AImove(grid_local):
    bestScore = -INFINITE
    bestMove = None

    for cord in avaMove(grid_local):
        grid_local[cord[0]][cord[1]] = comptr     # make hypothetical move
        score = minmaxAlgo(grid_local, False)     # recurse for player's turn
        grid_local[cord[0]][cord[1]] = " "        # backtrack move
        
        if bestScore < score:                     # Descise for best score
            bestScore = score
            bestMove = cord

    if bestMove != None:
        grid[bestMove[0]][bestMove[1]] = comptr   # This move is played on global grid

### Player's turn
def PLmove():
    #### Show current state of grid
    showGrid()
    #### Check for input error
    while True:
        #### See if input is type-castable to int
        try:
            # Enter row and column for desired block
            R = int(input("Enter row (0-2):"))
            C = int(input("Enter column (0-2):"))
        except:
            print("Invalid datatype! Enter only integer value -> 0, 1, 2")
            continue

        ##### See if the input is in range of grid
        if R<0 or R>2 or C<0 or C>2:
            print("Input exceeds the grid size (0-2). Please re-enter!")
            continue

        #### See if the block is empty? Mark if it is, else ask to re-enter move
        if grid[R][C] != " ":
            print("The block is unavailable, Please choose again!")
            continue

        break       # no error in input

    #### Mark the player's block  
    grid[R][C] = player

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
        finalResult = checkWin(grid)        # Check for wins/ Draw
        if finalResult != None: break

        AImove(grid)
        finalResult = checkWin(grid)        # Check for wins/ Draw
        if finalResult != None: break

    else:
        AImove(grid)
        finalResult = checkWin(grid)        # Check for wins/ Draw
        if finalResult != None: break

        PLmove()
        finalResult = checkWin(grid)        # Check for wins/ Draw
        if finalResult != None: break

### Declare the game result
if finalResult == player:
    print("Player wins the Game!")
elif finalResult == comptr:
    print("Computer wins the Game!")
else:
    print("Its a Draw!")
showGrid()