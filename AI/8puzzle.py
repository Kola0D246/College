# This is program to solve 8 puzzle problem using genrate and test method

## Setup Goal grid, Intial grid, and values available
goalGrid = [["A","B","C"],
            ["D","E","F"],
            ["G","H",""]]

#initGrid = [["","",""],["","",""],["","",""]]
#avaValue = ("A","B","C","D","E","F","G","H")         # for user input for intial grid setup

'''#Level 10
initGrid = [['G','F','E'],
            ['D','H',''],
            ['C','A','B']]
'''

#Level 01
initGrid = [["A","B","C"],
            ["D","E",""],
            ["G","H","F"]]



## Show current state of grid
def showGrid(grid):
    for row in grid:
        print(row)

'''
## Generate intial Grid using user input
def setInitGrid():
    print("Fill the empty grid to make 8 puzzle problem for computer to solve")
    print("Enter row and column for each value to put it in the grid")

    ### Loop for each row
    for value in avaValue:
        while True:
            print("Enter row and column for", value)
            #### catch error
            try:            
                R = int(input("row:"))
                C = int(input("col:"))
                if R <0 or R >2 or C<0 or C>2: 
                    raise ValueError("Exceed Grid Length")
                elif initGrid[R][C] != "":
                    raise ValueError("Spot taken")
            #### handle error
            except ValueError as E:
                if str(E) == "Exceed Grid Length":
                    print(f"[{R}][{C}] exceed grid length [0-2]")
                elif str(E) == "Spot taken":
                    print(f"Spot [{R}][{C}] is already taken. Choose another")
                    # print list of available spots
                else:
                    print("Entered value contain char datatype! Enter integer value [0-2]")
                continue    # reEnter the value
            #### run if no error is found
            else:
                initGrid[R][C] = value
                break

    ## Show final grid
    showGrid(initGrid)
'''


def Generate():
    # Generate possible move
    pass

def Test():
    # Test the generated move
    pass

def ManathonDis(curtGrid, value):
    for R in range(3):
        for C in range(3):
            if goalGrid[R][C] == value:
                Target = (R,C)
            if curtGrid[R][C] == value:
                Start = (R,C)
    return (Target[0]-Start[0], Target[1]-Start[1])

print(ManathonDis(initGrid, "F"))