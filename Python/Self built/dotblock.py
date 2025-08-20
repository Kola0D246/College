def dotblock(column, row, x=1, y=1):
    addx = addy = 1
    lst = []
    while True:
        lst.append((x, y))
        print(lst)
        if x == column and y == row:
            corner = 'bottom-left'
            break
        elif x == column and y == 1:
            corner = 'up-left'
            break
        elif x == 1 and y == row:
            corner = 'bottom-right'
            break
        if x == column: addx = -1
        elif x == 1: addx = 1
        x += addx
        if y == row: addy = -1
        elif y == 1: addy = 1
        y += addy
    return (lst, corner)

def checkInfinfite(lst):
    if not lst:
        return False
    n = len(lst)
    doubled = lst + lst  # Duplicate the list
    sub_list = doubled[1:-1]  # Remove first and last elements
    return lst in sub_list 

dotblock(5,7, 2, 1)