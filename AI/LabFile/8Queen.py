# 8Queen problem
# Print chess board with 8 Queen such that no queen kill each other
# There are 12 unique solutions and 92 distinct solutions

# print board
def showBoard(QP):
    line = '-'*33
    for R in range(8):
        print(line)
        row = ['Q' if (R, C) in QP else ' ' for C in range(8)]
        print('| '+' | '.join(row)+' |')
    print(line)

# check if spot is available
def spotAvailable(QP, R, C):
    for (r,c) in QP:
        if (R==r or C==c or R+C==r+c or R-C==r-c): return False
      # horizontal vertical /-daigonal  \-daigonal
    return True

def solve(QP, R=0):
    if R == 8:  
        return [QP.copy()]

    solutions = []
    for C in range(8):
        if spotAvailable(QP, R, C):
            QP.add((R, C))          # place queen
            solutions.extend(solve(QP, R + 1))  # go deeper
            QP.remove((R, C))       # backtrack
    return solutions

print("All possible placement of Queen:")
ans = solve(set())
size = len(ans)
for a in range(size): 
    print(f"{a}: {ans[a]}")

print('-'*50)
board = int(input(f"Pick a solution(0-{size-1}):"))
if board < size:
    showBoard(ans[board])