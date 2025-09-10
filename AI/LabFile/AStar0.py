graph_connections = {
    'A':{'B':4, 'C':2},
    'B':{'D':3, 'E':5, 'F':2},
    'C':{'E':1},
    'D':{},
    'E':{'F':6},
    'F':{'G':1},
    'G':{}
}

graph_EC = {    # Straight-line distance
    'A':11,
    'B':9,
    'C':7,
    'D':4,
    'E':5,
    'F':1,
    'G':0
}

def pathcost(lst):
    pathcost = 0
    for idx in range(1, len(lst)):
        connection = graph_connections[lst[idx-1]]
        pathcost += connection[lst[idx]]
    return pathcost

def add(lst, label, fullCost):
    length = len(lst)
    element = (label, fullCost)
    
    if length == 0:
        lst.append(element)
        return
    
    if element in lst:
        return
    
    for idx in range(length):
        if fullCost < lst[idx][1]:
            lst.insert(idx, element)
            return
        
    lst.append(element)

def AStar(start, goal, openlist=[], closelist=[]):
    closelist.append(start)
    if goal in closelist:
        return closelist
    
    connections = graph_connections[start]
    for node in connections.keys():
        fullcost = graph_EC[node] + pathcost(tuple(closelist) + (node,))
        add(openlist, node, fullcost)

    nxt = openlist[0][0]

    return AStar(nxt, goal, openlist, closelist)

AStar('A', 'G')